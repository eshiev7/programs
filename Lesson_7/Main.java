package ru.nsu.home;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {

    private static List<List<Integer>> matrix = new ArrayList<>();

    public static void main(String[] args) throws IOException, IncorrectInputData, InterruptedException {
        List<String> lines = Files.readAllLines(Paths.get("matrix.txt"), StandardCharsets.UTF_8);
        List<Integer> vector = new ArrayList<>();
//--------------------------------------------Create-Matrix-Vector------------------------------------------------------
        for (int i = 0; i <= lines.size() - 1; i++) {
            List<Integer> intLine = new ArrayList<>();
            if (lines.get(i).length() == 1) {
                vector.add(Integer.parseInt(lines.get(i)));
            } else {
                for (String strElement : lines.get(i).split(" ")) {
                    intLine.add(Integer.parseInt(strElement));
                }
                matrix.add(intLine);
            }
        }
//----------------------------------------------Simple-Multiply---------------------------------------------------------
        long begin = System.currentTimeMillis();
        List<Integer> simpleMultiply = Matrix.multiply(matrix, vector);
        long out = System.currentTimeMillis() - begin;
        System.out.println("Результат работы однопоточной программы: " +
                simpleMultiply +
                "; затрачено времени: " +
                out);
        try(BufferedWriter fileWriter = new BufferedWriter(new FileWriter("Multiply.txt"))) {
            fileWriter.write("Результат работы однопоточной программы:");
            fileWriter.newLine();
            for (int i = 0; i < simpleMultiply.size(); i++) {
                fileWriter.write(simpleMultiply.get(i).toString() + " " + (i + 1) + "-й элемент" );
                fileWriter.newLine();
            }
            fileWriter.write("Затрачено времени: " + out + " (милисекунды)");
        }
//-----------------------------------------------Multiply-By-Threads----------------------------------------------------
        long reBegin = System.currentTimeMillis();
        List<Integer> threadMultiply = new ArrayList<>();
        for (int i = 0; i < matrix.size(); i++) {
            MatrixThread thread = new MatrixThread(matrix.get(i), vector);
            thread.start();
            thread.join();
            threadMultiply.add(thread.getResultElement());
        }
        long reOut = System.currentTimeMillis() - reBegin;
        System.out.println("Результат работы многопоточной программы: " +
                threadMultiply +
                "; затрачено времени: " +
                reOut);
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("Thread.txt"))){
            writer.write("Результат работы многопоточной программы:");
            writer.newLine();
            for(int i = 0; i < threadMultiply.size(); i++){
                writer.write(threadMultiply.get(i).toString() + " " + (i + 1) + "-й элемент" );
                writer.newLine();
            }
            writer.write("Затрачено времени: " + reOut + " (милисекунды)");
        }
    }
}
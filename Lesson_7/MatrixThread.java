package ru.nsu.home;

import java.util.List;

public class MatrixThread extends Thread {

    private List<Integer> vectorMatrix;
    private List<Integer> vector;
    private int resultElement = 0;

    public MatrixThread(List<Integer> vectorMatrix, List<Integer> vector) {
        this.vectorMatrix = vectorMatrix;
        this.vector = vector;
    }

    @Override
    public void run() {
        for (int i = 0; i < vector.size(); i++) {
            resultElement += vectorMatrix.get(i) * vector.get(i);
        }
    }

    public int getResultElement() {
        return resultElement;
    }
}
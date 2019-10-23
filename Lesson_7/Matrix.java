package ru.nsu.home;

import java.util.ArrayList;
import java.util.List;

public class Matrix {

    private static List<Integer> result = new ArrayList<>();

    public static List<Integer> multiply(List<List<Integer>> matrix, List<Integer> vector)
            throws IncorrectInputData {
        if(matrix.get(0).size() != vector.size()){
            throw new IncorrectInputData("Умножение невозможно");
        }
        for (int i = 0; i < matrix.size(); i++) {
            if(matrix.get(0).size() != matrix.get(i).size()){
                throw new IncorrectInputData("Умножение невозможно");
            }
            int resultElement = 0;
            for (int j = 0; j < vector.size(); j++) {
                resultElement += matrix.get(i).get(j) * vector.get(j);
            }
            result.add(resultElement);
        }
        return result;
    }
}
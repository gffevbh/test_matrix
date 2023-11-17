package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {

    }
    public static int[][] matrix_addition(int[][] matrix1, int[][] matrix2) {
        int[][] matrix = new int[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                matrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return matrix;
    }

    public static int[][] matrix_multiplication(int[][] matrix1, int[][] matrix2) {
        int[][] matrix = new int[matrix1.length][matrix2[0].length];

        if (matrix1[0].length != matrix2.length) {
            return null;
        }

        List<List<Integer>> rows_matrix1 = new ArrayList<>();
        for (int i = 0; i < matrix1.length; i++) {
            List<Integer> row_matrix1 = new ArrayList<>();
            for (int j = 0; j < matrix1[0].length; j++) {
                row_matrix1.add(matrix1[i][j]);
            }
            rows_matrix1.add(row_matrix1);
        }

        List<List<Integer>> cols_matrix2 = new ArrayList<>();
        for (int i = 0; i < matrix2[0].length; i++) {
            List<Integer> col_matrix2 = new ArrayList<>();
            for (int j = 0; j < matrix2.length; j++) {
                col_matrix2.add(matrix2[j][i]);
            }
            cols_matrix2.add(col_matrix2);
        }

        for (int i = 0; i < rows_matrix1.size(); i++) {
            for (int j = 0; j < cols_matrix2.size(); j++) {
                int sum = 0;
                for (int k = 0; k < rows_matrix1.get(i).size(); k++) {
                    sum += rows_matrix1.get(i).get(k) * cols_matrix2.get(j).get(k);
                }
                for (int m = i; m < matrix.length; m++) {
                    for (int n = j; n < matrix[0].length; n++) {
                        matrix[m][n] = sum;
                    }
                }
            }
        }
        return matrix;
    }

    public static int[][] matrix_exponentiation(int[][] matrix, int power) {
        if (power == 1) {
            return matrix;
        }
        int[][] matrix_result = matrix_multiplication(matrix, matrix);
        for (int i = 3; i <= power; i++) {
            if (matrix_result != null) {
                matrix_result = matrix_multiplication(matrix_result, matrix);
            }
        }
        return matrix_result;
    }

}

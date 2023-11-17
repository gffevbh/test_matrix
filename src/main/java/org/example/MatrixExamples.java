package org.example;

public class MatrixExamples {


    public static int[][] matrix1_for_addition = {{5, 7, 3, 17}, {7, 0, 1, 12}, {8, 1, 2, 3}};
    public static int[][] matrix2_for_addition = {{0, 3, 4, 1}, {22, 45, 1, 8}, {4, 5, 1, 0}};
    public static int[][] expecteds_for_addition = {{5, 10, 7, 18}, {29, 45, 2, 20}, {12, 6, 3, 3}};

    public static int[][] matrix1_for_multiplication = {{3, -1, 2}, {4, 2, 0}, {-5, 6, 1}};
    public static int[][] matrix2_for_multiplication = {{8, 1}, {7, 2}, {2, -3}};
    public static int[][] expecteds_for_multiplication = {{21, -5}, {46, 8}, {4, 4}};

    public static int[][] matrix_for_exponentiation = {{1, 0}, {2, 3}};
    public static int[][] expecteds_for_exponentiation = {{1, 0}, {26, 27}};

}
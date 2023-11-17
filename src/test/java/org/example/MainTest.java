package org.example;
import org.junit.Test;

import java.util.Arrays;
import static junit.framework.TestCase.assertTrue;

public class MainTest {

    @Test
    public void matrix_addition_test() {
        assertTrue(Arrays.deepEquals(MatrixExamples.expecteds_for_addition, Main.matrix_addition(MatrixExamples.matrix1_for_addition, MatrixExamples.matrix2_for_addition)));
    }

    @Test
    public void matrix_multiplication_test() {
        assertTrue(Arrays.deepEquals(MatrixExamples.expecteds_for_multiplication, Main.matrix_multiplication(MatrixExamples.matrix1_for_multiplication, MatrixExamples.matrix2_for_multiplication)));
    }

    @Test
    public void matrix_exponentiation_test() {
        assertTrue(Arrays.deepEquals(MatrixExamples.expecteds_for_exponentiation, Main.matrix_exponentiation(MatrixExamples.matrix_for_exponentiation, 3)));
    }

}

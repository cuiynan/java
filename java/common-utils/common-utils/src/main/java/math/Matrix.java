package com.bohui.commonutils;

/**
 * @author : cuiyingnan
 * @date : 2019/7/16 10:43
 * @desc :
 */
public class Matrix {
    public static final int OPEROPERATION_MUL = 1;

    /**
     * 一阶
     */
    public static int multiplication_a(int[] matrix_a, int[] matrix_b) {
        if (legalOperation(matrix_a, matrix_b, OPEROPERATION_MUL)) {
            return calculateSingleResult(matrix_a, matrix_b);
        } else {
            return -1;
        }
    }

    /**
     * 一阶
     */
    public static int calculateSingleResult(int[] matrix_a, int[] matrix_b) {
        int result = 0;
        for (int i = 0; i < matrix_a.length; i++) {
            result += matrix_a[i] * matrix_b[i];
        }
        return result;
    }

    /**
     * 一阶
     */
    private static boolean legalOperation(int[] matrix_a, int[] matrix_b, int type) {
        boolean legal = true;
        if (type == OPEROPERATION_MUL) {
            if (matrix_a.length != matrix_b.length) {
                legal = false;
            }
        }
        return legal;
    }


    public static void main(String[] args) {
        int a[] = new int[]{1,-1,0};
        int b[] = new int[]{1,-1,0};

        int x = multiplication_a(a,b);
        System.out.println(x);
    }
}

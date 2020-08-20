package com.aidoctor.math;

import com.aidoctor.math.util.Matrix;
import org.apache.commons.lang3.ArrayUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author : cuiyingnan
 * @date : 2019/7/15 16:00
 * @desc :
 */
public class Test {
    public static void main(String[] args) {
//        double a[][] = new double[3][1];
//        double b[][] = new double[3][1];
//
//        a[0][0] = 1;
//        a[1][0] = -1;
//        a[2][0] = 0;
//
//        b[0][0] = 1;
//        b[1][0] = 1;
//        b[2][0] = 0;
//
//        Array2DRowRealMatrix matrix1 = new Array2DRowRealMatrix(a);
//        Array2DRowRealMatrix matrix2 = new Array2DRowRealMatrix(b);
//        System.out.println(matrix1);
//        System.out.println(matrix2);
//        Array2DRowRealMatrix ab  = matrix1.multiply(matrix2);
//        System.out.println(ab.getData());

//        int[] a = new int[]{1, -1, 0 ,1};
//        int[] b = new int[]{1, -1, 0,1};
//        int num  =3 ;
//        int result = Matrix.multiplication_a(a, b);
//        System.out.println(result);
//        System.out.println(result % num == 0);

        List<String> a  = new ArrayList<>();
        a.add("123");
        a.add("1243");
        a.add("12233");
        System.out.println(ArrayUtils.contains(a.toArray(),"1243"));;

    }


}

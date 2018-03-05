package com.company;

import java.util.Arrays;
import java.util.Random;

// 9.2. Выполнить циклический сдвиг заданной матрицы на k позиций вправо (влево, вверх, вниз).
public class Task_2_010 {
    public static void main(String[] args) {
        Random r = new Random();
        //      int n = r.nextInt(((10 - 3) + 1) + 3);
        int n = 4;
        int k = 2;
        // fill and print an Array
        int a[][] = new int[n][n];
        System.out.println("Input");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = ((int) (Math.random() * 11) + 0);
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
        //   System.out.println("Output DownShift");
        //   downShift(a, k);
        System.out.println("Output LeftShift");
        leftShift(a, k);
        System.out.println("Output LeftShift");
        rightShift(a, k);
    }


    public static void downShift(int[][] a, int k) {
        int[] tmp;
        for (int i = 0; i < k; i++) {
            tmp = a[a.length - 1];
            System.arraycopy(a, 0, a, 1, a.length - 1);
            a[0] = tmp;
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void leftShift(int[][] a, int k) {
// Convert Matrix to Array and Print
        int[] tmp = new int[a.length * a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                tmp[i * a.length + j] = a[i][j];
                System.out.print(tmp[i * a.length + j] + " ");
            }
        }
        System.out.println();
        int[] array_2_tmp = new int[tmp.length];
        for (int pos = 0; pos < k; pos++) {
            int firstElement = tmp[0];
            System.arraycopy(tmp, 1, array_2_tmp, 0, tmp.length - 1);
            array_2_tmp[array_2_tmp.length - 1] = firstElement;
            System.arraycopy(array_2_tmp, 0, tmp, 0, tmp.length);
            for (int i = 0; i < array_2_tmp.length; i++)
                System.out.print(array_2_tmp[i] + " ");
            System.out.println();
        }
// Convert Array to matrix and print
        int s = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = tmp[s];
                s++;
                System.out.print(a[i][j] + "\t");

            }
            System.out.println();
        }
    }
        public static void rightShift(int[][] a, int k) {
// Convert Matrix to Array and Print
            int[] tmp = new int[a.length * a.length];
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a.length; j++) {
                    tmp[i * a.length + j] = a[i][j];
                    System.out.print(tmp[i * a.length + j] + " ");
                }
            }
            System.out.println();
            int[] array_2_tmp = new int[tmp.length];
            for (int pos = 0; pos < k; pos++) {
                int lastElement = tmp[array_2_tmp.length - 1];
                System.arraycopy(tmp, 0, array_2_tmp, 1, tmp.length - 1);
                array_2_tmp[0] = lastElement;
                System.arraycopy(array_2_tmp, 0, tmp, 0, tmp.length);
                for (int i = 0; i < array_2_tmp.length; i++)
                    System.out.print(array_2_tmp[i] + " ");
                System.out.println();
            }
// Convert Array to matrix and print
            int s = 0;
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a.length; j++) {
                    a[i][j] = tmp[s];
                    s++;
                    System.out.print(a[i][j] + "\t");

                }
                System.out.println();
            }


        } //leftShift




} //class

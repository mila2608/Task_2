package com.company;

import java.util.Arrays;
import java.util.Random;

// 9.1. Упорядочить строки (столбцы) матрицы в порядке возрастания значений

public class Task_2_009 {
    public static void main(String[] args) {
        Random r = new Random();
        //      int n = r.nextInt(((10 - 3) + 1) + 3);
        int n = 4;
// fill and print an Array
        Integer a[][] = new Integer[n][n];
        Integer min = a[0][0];
        System.out.println("Input");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = ((int) (Math.random() * 11) + 0);
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
        rowSort(a, n);
        // print a result sorting by row
        System.out.println("Output sorting by row");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println(Arrays.deepToString(a));

        columnSort(a, n);
        // print a result sorting by column
        System.out.println("Output sorting by column");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println(Arrays.deepToString(a));
    }

    public static void rowSort(Integer[][] a, int n) {
        for (int row = 0; row < a.length; row++) {
            for (int col = 0; col < a[row].length - 1; col++) {
                for (int k = 0; k < a[row].length - col - 1; k++) {
                    if (a[row][k] > a[row][k + 1]) {
                        int min = a[row][k];
                        a[row][k] = a[row][k + 1];
                        a[row][k + 1] = min;
                    }
                }
            }
        }
    }

    public static void columnSort(Integer[][] a, int n) {
        for (int col = 0; col < a.length; col++) {
            for (int row = 0; row < a[col].length - 1; row++) {
                for (int k = 0; k < a[col].length - row - 1; k++) {
                    if (a[k][col] > a[k + 1][col]) {
                        int min = a[k][col];
                        a[k][col] = a[k + 1][col];
                        a[k + 1][col] = min;
                    }
                }
            }
        }
    }

}


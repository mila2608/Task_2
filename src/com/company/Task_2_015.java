package com.company;

import java.util.Arrays;
import java.util.Random;

// 9.6 Построить матрицу, вычитая из элементов каждой строки матрицы ее среднее арифметическое.
public class Task_2_015 {
    public static void main(String[] args) {
        Random r = new Random();
        int n = r.nextInt(((10 - 3) + 1) + 3);
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = r.nextInt(20);
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
        avgCount(a);
    }

    public static void avgCount(int[][] a) {
        int sum = 0;
        double[][] result = new double[a.length][a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                sum += a[i][j];
            }
        }
        double avg = sum / Math.pow(a.length, 2);
        System.out.println(avg);

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                result[i][j] = a[i][j] - avg;
                System.out.printf("%.2f", result[i][j]);
                System.out.print("\t");
            }
            System.out.println();
        }
    }
}

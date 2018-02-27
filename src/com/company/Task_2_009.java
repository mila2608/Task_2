package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Comparator;

// 9.1. Упорядочить строки (столбцы) матрицы в порядке возрастания значений
public class Task_2_009 {
    public static void main(String[] args) {
        Random r = new Random();
        // int n = r.nextInt(((10 - 3) + 1) + 3);
        int n = 4;
// fill and print an Array
        Integer a[][] = new Integer[n][n];
        Integer min = a[0][0];
        System.out.println("Input");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = r.nextInt(20);
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }

 // sort Array by row
        for (int l = 0; l < a.length; l++) {
            for (int i = 0; i < a[l].length -1 ; i++) {
                for (int j = 0; j < a[l].length -i -1; j++) {
                    if (a[l][j] > a[l][j + 1]) {
                        min = a[l][j];
                        a[l][j] = a[l][j + 1];
                        a[l][j + 1] = min;
                    }
                }
            }
        }
// print a resul
        System.out.println("Output");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }
}


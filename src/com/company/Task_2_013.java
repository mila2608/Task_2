package com.company;

import java.util.Random;

// 9.4. Найти сумму элементов матрицы, расположенных между первым и вторым положительными элементами каждой строки.
public class Task_2_013 {
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
    }

    public static void sumFirstSecond (int[][] a){

    }


}

package com.company;

import java.util.Random;

public class CreateMatrix {
    public static Integer[][] getMatrix(int k) {
        Random r = new Random();
        int n = r.nextInt(((10 - 3) + 1) + 3);
        Integer a[][] = new Integer[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = r.nextInt(20);
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
        return a;
    }

}


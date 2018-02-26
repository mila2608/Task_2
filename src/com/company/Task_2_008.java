package com.company;

import java.util.Arrays;
import java.util.Random;

// 8. Вывести числа от 1 до k в виде матрицы N x N слева направо и сверху вниз
public class Task_2_008 {
    public static void main(String[] args) {
        Random r = new Random();
        int n = r.nextInt(((10 - 3) + 1) + 3);
        Integer inputValue[] = new Integer[n * n];
        Integer twoDim[][] = new Integer[n][n];
        int k = 0;
        System.out.println("Matrix dimension = " + n);
        for (int i = 0; i < inputValue.length; i++) {
            inputValue[i] = r.nextInt(20);
        }
        System.out.println(Arrays.asList(inputValue));

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                twoDim[i][j] = inputValue[k];
                k++;
                System.out.print(twoDim[i][j] + "\t");
            }
            System.out.println();
        }
//        System.out.println(Arrays.deepToString(twoDim));
        }
}
package com.company;

import java.util.Random;

// 9.5. Повернуть матрицу на 90 (180, 270) градусов против часовой стрелки.
public class Task_2_014 {
    public static void main(String[] args) {
        Random r = new Random();
        int n = 6;
                //r.nextInt(((10 - 3) + 1) + 3);
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = r.nextInt(20);
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }

        turn90(a, 1);
    }

public static void turn90 (int[][] a, int rotation){
    int tmp;
    for (int k = 0; k < rotation ; k++) {
        for(int i=0;i<a.length/2;i++) {
            for(int j=i;j<a.length-1-i;j++) {
                tmp = a[i][j];
                a[i][j]=a[j][a.length-1-i];
                a[j][a.length-1-i] = a[a.length-1-i][a.length-1-j];
                a[a.length-1-i][a.length-1-j] = a[a.length-1-j][i];
                a[a.length-1-j][i] = tmp;
            }
        }
    }
    if (rotation == 1) System.out.println("Output 90");
    if (rotation == 2) System.out.println("Output 180");
    if (rotation == 3) System.out.println("Output 270");
    for (int i = 0; i < a.length; i++) {
        for (int j = 0; j < a.length; j++) {

            System.out.print(a[i][j] + "\t");
        }
        System.out.println();
    }
}
// по часовой
/*for (int rot = 0; rot < 1; rot++) {
        for (int i = 0; i < a.length / 2; i++) {
            for (int j = i; j < a.length - 1 - i; j++) {
                temp = a[i][j];
                a[i][j] = a[a.length - 1 - j][i];
                a[a.length - 1 - j][i] = a[a.length - 1 - i][a.length - 1
                        - j];
                a[a.length - 1 - i][a.length - 1 - j] = a[j][a.length - 1
                        - i];
                a[j][a.length - 1 - i] = temp;
            }
        }
    }*/

}

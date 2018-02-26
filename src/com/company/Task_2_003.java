package com.company;

import java.util.Arrays;

//3. Вывести на консоль те числа, длина которых меньше (больше) средней, а также длину.

public class Task_2_003 {
    public static void main(String[] args) {
        int k = 100, sum = 0;
        String b[] = new String[10];
        for (int i = 0; i < b.length; i++) {
            b[i] = GetString.getString(k);
        }
        System.out.println(Arrays.asList(b));

        for (int i = 0; i < b.length; i++) {
            sum += b[i].length();
        }
        int avg = sum/b.length;
        for (int i = 0; i < b.length; i++) {
            if (b[i].length() < avg)
                System.out.println(b[i] + ", length = " + b[i].length());
            else continue;
        }
        System.out.println("sum = " + sum);
        System.out.println("avg = " + avg);
    }
}

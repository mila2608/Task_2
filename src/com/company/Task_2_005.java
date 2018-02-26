package com.company;

import java.util.Arrays;
// 5. Найти количество чисел, содержащих только четные цифры,
// а среди них количество чисел с равным числом четных и нечетных цифр.

public class Task_2_005 {
    public static void main(String[] args) {
        Integer n[] = new Integer[]{8372386, 27334445, 24688884, 872379637, 11111111, 2, 345, 246};
        String str = new String();
           System.out.println(Arrays.asList(n));
        int counter = 0;
        for (int i = 0; i < n.length; i++) {
            str = n[i].toString();
            for (int k = 0; k < str.length(); k++) {
                if ((str.toString().charAt(k) % 2 == 0)) {
                    if (k == (str.length() - 1))
                        counter++;
                } else break;
            } //for k
        } //for i
        System.out.println(counter);
    } //main
} //class


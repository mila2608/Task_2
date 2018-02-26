package com.company;

import java.util.Arrays;
// 4. Найти число, в котором число различных цифр минимально. Если таких чисел несколько, найти первое из них.

public class Task_2_004 {
    public static void main(String[] args) {
        Integer inputValues[] = new Integer[]{8372386, 27334445, 2468884, 872379637, 11, 2, 345, 246};
        String str, resultString = new String();
        int tmpNum = 0, counter = 0;
        System.out.println(Arrays.asList(inputValues));
        for (int i = 0; i < inputValues.length; i++) {
            str = inputValues[i].toString();
            for (int j = 0; j < str.length() - 1; j++) {
                counter = 0;
                for (int k = j; k < str.length(); k++) {
                    if (str.toString().charAt(j) == str.toString().charAt(k)) {
                        counter++;
                    }
                    if (counter > tmpNum) {
                        tmpNum = counter;
                        resultString = str;
                    }
                }
            }
        }
        System.out.println(resultString);
    }
}

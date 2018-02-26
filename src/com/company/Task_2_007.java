package com.company;

import java.util.Arrays;

// 7. Найти число, состоящее только из различных цифр. Если таких чисел несколько, найти первое из них.
public class Task_2_007 {
    public static void main(String[] args) {
        Integer inputValues[] = new Integer[]{8372386, 27334445, 2468884, 872379637, 11, 2, 345, 246, 1234567890};
        String str = new String();
        System.out.println(Arrays.asList(inputValues));
        for (int i = 0; i < inputValues.length; i++) {
            str = inputValues[i].toString();
            for (int j = 0; j < str.length() - 1; j++) {
                for (int k = 1; k < str.length(); k++) {
                    if (str.toString().charAt(j) != str.toString().charAt(k))
                    {
                        System.out.println(inputValues[i]);
                    return;
                }

                }
            }
        }

    }
}

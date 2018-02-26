package com.company;

import java.util.Arrays;

// 6. Найти число, цифры в котором идут в строгом порядке возрастания. Если таких чисел несколько, найти первое из них.
public class Task_2_006 {
    public static void main(String[] args) {
        Integer inputValues[] = new Integer[]{8372386, 27334445, 2468884, 872379637, 11, 2, 345, 246};
        String str = new String();
        String[] mask = new String[inputValues.length];

        for (int i = 0; i < inputValues.length; i++) {
            str = inputValues[i].toString();
            for (int k = 0; k < str.length(); k++) {
                byte[] a = str.getBytes();
                byte[] b = str.getBytes();
                Arrays.sort(b);
                if (Arrays.equals(a,b)){
                    System.out.println(str);
                    break;
                }
            }
        }
    }
}
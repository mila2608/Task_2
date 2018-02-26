package com.company;

import java.util.Arrays;
import java.util.Collections;

// 2. Упорядочить и вывести числа в порядке возрастания (убывания) значений их длины.
public class Task_2_002 {
    public static void main(String[] args) {
        int k = 50;
        String b[] = new String[10];
        for (int i = 0; i < b.length; i++) {
            b[i] = GetString.getString(k);
        }
        System.out.println(Arrays.asList(b));

        for (int i = b.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (b[j].length() < b[j + 1].length()) {
                    String tmp = b[j];
                    b[j] = b[j + 1];
                    b[j + 1] = tmp;
                }
            }
        }
        System.out.println(Arrays.asList(b));

        for (int i = 0; i < b.length / 2; i++) {
            String tmp = b[i];
            b[i] = b[b.length - i - 1];
            b[b.length - i - 1] = tmp;
        }
        System.out.println(Arrays.asList(b));
    }

}


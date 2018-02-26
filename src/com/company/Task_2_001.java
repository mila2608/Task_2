package com.company;

import java.util.*;

// 1. Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.

public class Task_2_001 {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        int k = 122;
        for (int i = 0; i < 10; i++) {
            a.add(GetString.getString(k));
        }
        System.out.println(a);

        int minLen = a.get(0).length(), maxLen = a.get(0).length();
        String min = a.get(0), max = a.get(0);
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).length() < minLen) {
                minLen = a.get(i).length();
                min = a.get(i);
            }
            if (a.get(i).length() > maxLen) {
                maxLen = a.get(i).length();
                max = a.get(i);
            }
        }
        System.out.println("min = " + min);
        System.out.println("minLen = " + minLen);
        System.out.println("max = " + max);
        System.out.println("maxLen = " + maxLen);
    }
} //class


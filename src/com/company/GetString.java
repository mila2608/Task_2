package com.company;

import java.util.Random;

//  этот код для генерации строки произвольной длины взят из Инета

public class GetString {
    public static String getString(int k) {
        String CHARS = "0123456789";
        StringBuilder str = new StringBuilder();
        Random rnd = new Random();
        while (str.length() < (rnd.nextInt(k))) {
            int index = (int) ((rnd.nextFloat()) * CHARS.length());
            str.append(CHARS.charAt(index));
        }
        String newStr = str.toString();
        return newStr;
    }

}

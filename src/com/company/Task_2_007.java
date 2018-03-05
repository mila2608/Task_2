package com.company;

import java.util.Arrays;

// 7. Найти число, состоящее только из различных цифр. Если таких чисел несколько, найти первое из них.
public class Task_2_007 {
    public static void main(String[] args) {
        //8372386
        Integer inputValues[] = new Integer[]{273345, 24684, 11, 2, 345, 246, 1234567890};
        String str = new String();
        boolean f = false;
        System.out.println(Arrays.asList(inputValues));
        for (int i = 0; i < inputValues.length; i++) {
            str = inputValues[i].toString();
            for (int j = 0; j < str.length() - 1; j++) {
                f = false;
                for (int k = j+1; k < str.length(); k++) {
                   if ((str.charAt(j) != str.charAt(k)))
                       continue;
                   else{
                       f = true;
                       break;}
                }
                if (f == true)
                    break;
                else continue;
            }
            if (f == false) {
                System.out.println(str);
                break;
            }
        }
    }
}


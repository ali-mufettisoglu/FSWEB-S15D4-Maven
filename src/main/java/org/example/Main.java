package org.example;


import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Main {

    public static Boolean checkForPalindrome(String text) {
        text = text.replaceAll("[\s.,?!_-]", "").toLowerCase(Locale.ENGLISH).trim();
        System.out.println(text);

        for (int i = 0; i < text.length() / 2; i++) {
            System.out.println(i);
                System.out.println((text.charAt(i) +" "+ text.charAt(text.length() - 1 - i)));
                if (!(text.charAt(i) == (text.charAt(text.length() - 1 - i)))) {
                    return false;
                }
            }

        return true;
    }

    public static String convertDecimalToBinary(int num) {
        StringBuilder sb = new StringBuilder();

        while (num > 1) {
            sb.append(num % 2);
            num = num / 2;
        }

        sb.append(num);
        sb.reverse();
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(checkForPalindrome("Was it a car or a cat I saw ?"));
    }
}
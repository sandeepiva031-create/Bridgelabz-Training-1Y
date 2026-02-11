package com.gla.string;

import java.util.Scanner;

public class LowercaseCompare {

    public static String toLowerUsingCharAt(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'A' && c <= 'Z') c = (char) (c + 32);
            result += c;
        }
        return result;
    }

    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) if (s1.charAt(i) != s2.charAt(i)) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String lower1 = toLowerUsingCharAt(text);
        String lower2 = text.toLowerCase();

        System.out.println(lower1);
        System.out.println(lower2);
        System.out.println(compareStrings(lower1, lower2));

        sc.close();
    }
}

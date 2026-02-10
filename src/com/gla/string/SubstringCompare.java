package com.gla.string;

import java.util.Scanner;

public class SubstringCompare {

    public static String subUsingCharAt(String str, int start, int end) {
        String sub = "";
        for (int i = start; i < end; i++) sub += str.charAt(i);
        return sub;
    }

    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) if (s1.charAt(i) != s2.charAt(i)) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        int start = sc.nextInt();
        int end = sc.nextInt();

        String sub1 = subUsingCharAt(text, start, end);
        String sub2 = text.substring(start, end);

        System.out.println(sub1);
        System.out.println(sub2);
        System.out.println(compareStrings(sub1, sub2));

        sc.close();
    }
}

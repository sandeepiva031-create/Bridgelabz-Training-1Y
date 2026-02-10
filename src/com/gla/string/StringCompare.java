package com.gla.string;

import java.util.Scanner;

public class StringCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        boolean charAtResult = s1.length() == s2.length();
        for (int i = 0; i < s1.length() && charAtResult; i++) {
            if (s1.charAt(i) != s2.charAt(i)) charAtResult = false;
        }
        System.out.println(charAtResult);
        System.out.println(s1.equals(s2));
        sc.close();
    }
}

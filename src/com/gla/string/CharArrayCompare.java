package com.gla.string;

import java.util.Scanner;

public class CharArrayCompare {

    public static char[] getChars(String str) {
        char[] arr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) arr[i] = str.charAt(i);
        return arr;
    }

    public static boolean compareCharArrays(char[] a, char[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) if (a[i] != b[i]) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();

        char[] arr1 = getChars(text);
        char[] arr2 = text.toCharArray();

        for (char c : arr1) System.out.print(c + " ");
        System.out.println();
        for (char c : arr2) System.out.print(c + " ");
        System.out.println();

        System.out.println(compareCharArrays(arr1, arr2));

        sc.close();
    }
}

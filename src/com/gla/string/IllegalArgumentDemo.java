package com.gla.string;

import java.util.Scanner;

public class IllegalArgumentDemo {

    public static void generateException(String text) {
        System.out.println(text.substring(5, 2));
    }

    public static void handleException(String text) {
        try {
            System.out.println(text.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();

        try {
            generateException(text);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception occurred in generateException()");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException occurred in generateException()");
        }

        handleException(text);
        sc.close();
    }
}

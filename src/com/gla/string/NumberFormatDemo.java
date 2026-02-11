package com.gla.string;

import java.util.Scanner;

public class NumberFormatDemo {

    public static void generateException(String text) {
        System.out.println(Integer.parseInt(text));
    }

    public static void handleException(String text) {
        try {
            System.out.println(Integer.parseInt(text));
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();

        try {
            generateException(text);
        } catch (NumberFormatException e) {
            System.out.println("Exception occurred in generateException()");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException occurred in generateException()");
        }

        handleException(text);
        sc.close();
    }
}

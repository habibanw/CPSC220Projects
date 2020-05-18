package com.company;
import java.util.*;

/**
 * This program will take in a ISBN number, and check if it valid.
 * It uses the given algorithms for both steps, and handles invalid algorithms.
 *
 * @author  Habibullah Anwar
 * @version 1.0
 */

public class Main {

    public static void main(String[] args) {
        // write your code here

        //Scanner Method
        Scanner stdin = new Scanner(System.in);

        // Variables
        String isbn = "";
        int total;
        int mod = 11;
        char ch1, ch2, ch3, ch4, ch5, ch6, ch7, ch8, ch9, ch10, ch11 , ch12, ch13;
        int value1, value2, value3, value4, value5, value6, value7, value8, value9, value10, value11, value12, value13;
        int sum = 0;
        int sumEvenPositions;
        int sumOddPositions;

        // Start the Program
        System.out.println("This program will verify one ISBN.");
        System.out.println("Please enter an ISBN without spaces or dashes: ");
        isbn = stdin.nextLine();
        if ((isbn.length() == 10) || isbn.length() == 13) {
            // Sum for ISBN 10
            if (isbn.length() == 10) {
                ch1 = isbn.charAt(0);
                value1 = Character.getNumericValue(ch1);
                ch2 = isbn.charAt(1);
                value2 = Character.getNumericValue(ch2);
                ch3 = isbn.charAt(2);
                value3 = Character.getNumericValue(ch3);
                ch4 = isbn.charAt(3);
                value4 = Character.getNumericValue(ch4);
                ch5 = isbn.charAt(4);
                value5 = Character.getNumericValue(ch5);
                ch6 = isbn.charAt(5);
                value6 = Character.getNumericValue(ch6);
                ch7 = isbn.charAt(6);
                value7 = Character.getNumericValue(ch7);
                ch8 = isbn.charAt(7);
                value8 = Character.getNumericValue(ch8);
                ch9 = isbn.charAt(8);
                value9 = Character.getNumericValue(ch9);
                ch10 = isbn.charAt(9);
                value10 = Character.getNumericValue(ch10);
                sum = (10 * value1) + (9 * value2) + (8 * value3) + (7 * value4) + (6 * value5) + (5 * value6) + (4 * value7) + (3 * value8) + (2 * value9) + (1 * value10);
                total = sum % mod;
                    if (total == 0) {
                    System.out.println("The " + isbn.length() + " digit " + isbn + " ISBN is valid");
                }   else {
                        System.out.println("The 10 digit ISBN " + isbn + " has an invalid checksum");
                    }
                // Sum for ISBN 13
            } else if (isbn.length() == 13) {
                ch1 = isbn.charAt(0);
                value1 = Character.getNumericValue(ch1);
                ch2 = isbn.charAt(1);
                value2 = Character.getNumericValue(ch2);
                ch3 = isbn.charAt(2);
                value3 = Character.getNumericValue(ch3);
                ch4 = isbn.charAt(3);
                value4 = Character.getNumericValue(ch4);
                ch5 = isbn.charAt(4);
                value5 = Character.getNumericValue(ch5);
                ch6 = isbn.charAt(5);
                value6 = Character.getNumericValue(ch6);
                ch7 = isbn.charAt(6);
                value7 = Character.getNumericValue(ch7);
                ch8 = isbn.charAt(7);
                value8 = Character.getNumericValue(ch8);
                ch9 = isbn.charAt(8);
                value9 = Character.getNumericValue(ch9);
                ch10 = isbn.charAt(9);
                value10 = Character.getNumericValue(ch10);
                ch11 = isbn.charAt(10);
                value11 = Character.getNumericValue(ch11);
                ch12 = isbn.charAt(11);
                value12 = Character.getNumericValue(ch12);
                ch13 = isbn.charAt(12);
                value13 = Character.getNumericValue(ch13);
                sumEvenPositions = value1 + value3 + value5 + value7 + value9 + value11 + value13;
                sumOddPositions = 3 * (value2 + value4 + value6 + value8 + value10 + value12);
                sum = sumEvenPositions + sumOddPositions;
                total = sum % 10;
                    if (total == 0) {
                    System.out.println("The " + isbn.length() + " digit ISBN " + isbn + " is valid");
                }   else {
                    System.out.println("The 13 digit ISBN " + isbn + " has an invalid checksum");
                }
            }

            // Checks if Length Meets any of the following
        } else if (isbn.length() <= 9 || isbn.length() >= 14 || isbn.length() == 11 || isbn.length() == 12) {
            System.out.println("The ISBN that you entered does not meet length requirements. \n" +
                    "Please check your number and run the program again.");
        }
    }
}








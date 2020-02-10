package com.company;
import java.lang.*;
import java.util.*;
import java.util.Scanner;
/**
 * This Program generates a private to a user for as a secure communication
 *This program will generate a private key
 *
 * @author  Habibullah Anwar
 * @version 1.0
 */

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // Variables for Project:
        String name1;
        String name2;
        int privateNumber1;
        int privateNumber2;
        int base;
        int moduloValue;
        int publicPrivate2;
        int publicPrivate1;

        // Welcome Screen
        System.out.println("Welcome to the Shared Secret Project!");

        // Module/Base Value
        System.out.println("Enter the base value: ");
        base = in.nextInt();
        System.out.println("Enter the modulo value: ");
        moduloValue = in.nextInt();

        // Skips Line for String input
        in.nextLine();

        // Input Person 1
        System.out.println("Enter name 1: ");
        name1 = in.nextLine();
        System.out.println("Enter " + name1 + " Private number: ");
        privateNumber1 = in.nextInt();

        // Skips Line for String input
        in.nextLine();

        // Input Person 2
        System.out.println("Enter name 2: ");
        name2 = in.nextLine();
        System.out.println("Enter " + name2 + " Private number: ");
        privateNumber2 = in.nextInt();

        // Calculations
        publicPrivate1 = (int) Math.pow(2, privateNumber1) % moduloValue;
        publicPrivate2 = (int) Math.pow(2, privateNumber2) % moduloValue;
        int sharedSecret = (int) (Math.pow(publicPrivate2, privateNumber1) % moduloValue);

        // Output Person 1
        System.out.println(name1 + "'s" + " keys are: ");
        System.out.println("    Private: " + privateNumber1);
        System.out.println("    Public-Private: " + publicPrivate1);
        System.out.println("    Shared Secret: " + sharedSecret);

        // Output Person 2
        System.out.println(name2 + "'s" + " keys are: ");
        System.out.println("    Private: " + privateNumber2);
        System.out.println("    Public-Private: " + publicPrivate2);
        System.out.println("    Shared Secret: " + sharedSecret);

    }
}

package com.company;

import org.w3c.dom.ls.LSOutput;

public class test {

    public static void main(String[] args) {

        double answer = mystery(2,3);
        int sum =(2 + 3) / (3 - 2);
        System.out.println(sum);

    }

    public static double mystery(int x, int y) {

        double result = (x + y) / (y - x);

        return result;

    }


}
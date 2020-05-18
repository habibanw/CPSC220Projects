package com.company;

import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner stdin = new Scanner(System.in);
        int numOfScores;
        double temp = 0;
        ArrayList<Double> scores = new ArrayList<Double>();
        System.out.println("Please enter the number of scores that you will enter: ");
        numOfScores = stdin.nextInt();
        for (int i = 0; i < numOfScores; i++) {
            System.out.println("Enter Score: ");
            scores.add(stdin.nextDouble());
        }
        int total = 0;
        double avg = 0;
        for(int i=0;i<scores.size();i++){
            System.out.println("Scores are: " + scores.get(i));
            total += scores.get(i);
            avg = total / scores.size();
        }
        System.out.println("The Average is: " + avg);


    }
}



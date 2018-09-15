package com.rodrigo.java_challenges.hh.thirtydaysofcode;

import java.util.Scanner;

public class Operators {
    // Complete the solve function below.
    static void solve(double meal_cost, int tip_percent, int tax_percent) {
        double total = meal_cost + (meal_cost * tip_percent) / 100 + (meal_cost * tax_percent) / 100;
        int totalInt = (int) Math.round(total);
        System.out.println("The total meal cost is " + totalInt + " dollars.");

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

    	//samples
        solve(12.00, 20, 8);
        solve(15.50, 15, 10);
        solve(20.75, 10, 3);

        scanner.close();

    }
    
    
}

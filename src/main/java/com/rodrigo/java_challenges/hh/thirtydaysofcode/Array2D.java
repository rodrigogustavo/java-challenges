package com.rodrigo.java_challenges.hh.thirtydaysofcode;

import java.util.Scanner;

public class Array2D {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int largest = - 9 * 7;

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (j + 2 < 6 && i + 2 < 6) {

                    int sum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];

                    if (sum > largest) {
                    	largest = sum;
                    }
                }
            }
        }
        
        System.out.println(largest);

        scanner.close();
    }
}

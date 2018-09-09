package com.rodrigo.java_challenges.hh.thirtydaysofcode;

import java.util.Scanner;

public class ReverseArray {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }
        
        for (int x = n - 1; x >= 0; x--) {
            System.out.print(arr[x] + " ");
        }

        scanner.close();
    }
}

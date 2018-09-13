package com.rodrigo.java_challenges.hh.thirtydaysofcode;

import java.util.Scanner;

public class BinaryNumbers {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        //Split the number converted to binary into an array of Strings
        String[] bimarys = Integer.toBinaryString(n).split("[0]+");

        int max = 0;

        for (String s : bimarys) {
            if (s.length() > max) {
                max = s.length();
            }
        }

        System.out.println(max);

        scanner.close();
    }
}

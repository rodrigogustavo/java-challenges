package com.rodrigo.java_challenges.hh.thirtydaysofcode;

import java.util.Scanner;

class Calculator {
	int power(int base, int exponent) throws Exception {

		if (base < 0 || exponent < 0) {
			throw new Exception("n and p should be non-negative");
		}

		return (int) Math.pow(base, exponent);
	}
}

class NegativeNumberExcpetion {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {

			int n = in.nextInt();
			int p = in.nextInt();
			Calculator myCalculator = new Calculator();
			try {
				int ans = myCalculator.power(n, p);
				System.out.println(ans);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		in.close();
	}
}

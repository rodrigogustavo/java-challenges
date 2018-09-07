package com.rodrigo.java_challenges.hh.thirtydaysofcode;

public class Solution {

	/**
	 * Given an integer, , print its first  multiples. Each multiple  (where ) should be printed on a new line in the form: n x i = result.
	 */
	public void multiplus(int number) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(number + " x " + i + " = " + number * i);
		}
	}
	
	public static void main(String[] args) {
		Solution s = new Solution();
		s.multiplus(4);
	}

}

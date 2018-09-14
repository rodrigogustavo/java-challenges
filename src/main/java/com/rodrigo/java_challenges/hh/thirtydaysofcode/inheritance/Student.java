package com.rodrigo.java_challenges.hh.thirtydaysofcode.inheritance;

public class Student extends Person{
	private int[] testScores;

    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here
	public Student(String firstName, String lastName, int identification, int[] scores) {
		super(firstName, lastName, identification);
		testScores = scores;
	}
	
    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    // Write your method here
	public char calculate() {
		int sum = 0;
		
		//sum all scores;
		for(int score : testScores) {
			sum += score;
		}
		
		//get the avg score;
		int avg = sum / testScores.length;
		
		//get the grade
		if (avg > 89) {
			return 'O';
		}else if (avg > 79) {
			return 'E';
		}else if (avg > 69) {
			return 'A';
		}else if (avg > 54) {
			return 'P';
		}else if (avg > 39) {
			return 'D';
		}else {
			return 'T';
		}
	}
}
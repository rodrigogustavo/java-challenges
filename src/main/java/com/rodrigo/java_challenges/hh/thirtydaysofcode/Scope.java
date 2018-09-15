package com.rodrigo.java_challenges.hh.thirtydaysofcode;

import java.util.Scanner;

class Difference {

  	private int[] elements;
  	public int maximumDifference;

  	Difference(int[] list){
  		elements = list;
  	}

  	void computeDifference() {
  		int max = 1;
  		int min = 100;
  		
  		for(int number : elements) {
  			min = Math.min(min, number);
  			max = Math.max(max, number);
  		}

  		maximumDifference = max - min;

  	}
}
	
public class Scope{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}

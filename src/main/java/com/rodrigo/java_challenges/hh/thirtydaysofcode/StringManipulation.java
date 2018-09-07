package com.rodrigo.java_challenges.hh.thirtydaysofcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringManipulation {

	/**
	 * Given a string, , of length  that is indexed from  to , print its 
	 * even-indexed and odd-indexed characters as  space-separated strings 
	 * on a single line (see the Sample below for more detail).
	 */
	
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();

        List<String> words = new ArrayList<String>();

        for( int i = 0; i < testCases; i++){
        		words.add(scan.next());
        }

        for (String word : words) {

            int stringSize = word.length();

            //print evens
            for (int x = 0; x < stringSize; x+=2){
                System.out.print(Character.toString(word.charAt(x)));
            }
            System.out.print(" ");
            //print odds
            for (int x = 1; x < stringSize; x+=2){
                System.out.print(Character.toString(word.charAt(x)));
            }
            
            System.out.print("\n");
        }
        
        scan.close();
    }
}

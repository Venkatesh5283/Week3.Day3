package week3.Day3;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharaterUsingHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		//PrintUniqueCharacter
		/*
		 * Problem
		 * 
		 * a) Take your name as input
		 * b) Print all unique characters only (any order)
		 * 
		 * Input:  babu
		 * Output: a u 
		 * 
		 */

		/*
		 * Psuedocode
		 * 
		 * a) Convert String to Character array
		 * b) Create a new Set -> HashSet
		 * c) Add each character to the Set and if it is already there, remove it
		 * d) Finally, print the set
		 * 
		 */
		
		String name= "Venkatesh";
		char c[]=name.toCharArray();
		Set<Character> str=new HashSet<Character>();
		String output="";
		for (Character ch : c) {
			str.add(ch);
		}
		
		output=str.toString().replaceAll("\\,|\\[|\\]|\\s", " ");
		
		System.out.println(output);
		
	}

}

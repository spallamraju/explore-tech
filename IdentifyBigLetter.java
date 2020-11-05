package com.codility.test;

import java.util.TreeSet;

/*
 * Find the largest Alphabetic character present in the string
 * 
 * Problem: Given a string str, our task is to find the Largest Alphabetic Character, 
 * whose both uppercase and lowercase are present in the string. 
 * The uppercase character should be returned. 
 * If there is no such character then return -1 
 * otherwise print the uppercase letter of the character.
 * 
 * This Question was asked in my Codility Programming Test
 */
public class IdentifyBigLetter {

	public static void main(String[] args) {
		String str = "aaaBBAAbbDd";
		//String str = "Codility";
		System.out.println(largestLetter(str));
	}
	
	private static String largestLetter(String str) {
		
		final String notPresentStr = "-1";
		
		if (str.isEmpty() || str.trim().isEmpty()) {
			return notPresentStr;
		}
		TreeSet<Character> charSet = new TreeSet<Character>();
		// First Distinct Identify lower case letters
		char[] charArray = str.toCharArray();
		for (char ch : charArray) {
			if (Character.isLowerCase(ch)) {
				charSet.add(ch);
			}
		}
		
		// Check Whether Any Upper Case letter present or not 
		for (char ch : charArray) {
			if (Character.toUpperCase(charSet.last()) == ch) {
				return String.valueOf(ch);
			}
		}
		
		return notPresentStr;
	}

}

package com.astamatii.javarushexc;

public class L2_StringCountsLambda {

	public static void main(String[] args) {

		String string = "asdjask12312jdh 12312, asdas1231dsa, asd!asd a,sdad a!";
		
		System.out.println("Digits = " + countDigits(string));
		System.out.println("Leters = " + countLetters(string));
		System.out.println("Spaces = " + countSpaces(string));
		
	}
	
	private static int countDigits(String string) {
		return (int)string.chars().filter(c -> Character.isDigit(c)).count();
	}

	private static int countLetters(String string) {
		return (int)string.chars().filter(c -> Character.isLetter(c)).count();
	}
	
	private static int countSpaces(String string) {
		return (int)string.chars().filter(c -> Character.isSpaceChar(c)).count();
	}




}


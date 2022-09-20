package com.astamatii.javarushexc;

public class L5_6_ExceptionsChecked {

	public static void main(String[] args) throws Exception {
		generateLuckyNumber();
	}

	static void generateLuckyNumber() throws Exception {
		int luckyNumber = (int) (Math.random() * 20);
		if (luckyNumber == 13) {
			throw new Exception("не повезло");
		}
		System.out.println("твое счастливое число: " + luckyNumber);
	}

}

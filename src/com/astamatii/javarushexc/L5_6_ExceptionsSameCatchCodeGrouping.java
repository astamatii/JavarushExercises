package com.astamatii.javarushexc;

public class L5_6_ExceptionsSameCatchCodeGrouping {

	public static void main(String[] args) {
		try {
			System.out.println("Программа работает от забора");
			Thread.sleep(1000);
			System.out.println("до обеда");
		} catch (NullPointerException | NumberFormatException e) {
			System.out.println("Произошло исключение на букву N");
		} catch (IllegalArgumentException | IllegalStateException | InterruptedException e) {
			System.out.println("Произошло исключение на букву I");
		} catch (ClassCastException e) {
			System.out.println("Произошло исключение на букву C");
		}
	}
}

package com.astamatii.javarushexc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class L6_1_ConvertTryWithResources {

	public static void main(String[] args) {
		// BEFORE
//		System.out.println("(Try-Catch) Please, write a line:");
//		BufferedReader reader = null;
//		try {
//			reader =  new BufferedReader(new InputStreamReader(System.in));
//			String line = reader.readLine();
//			System.out.println(line.toLowerCase());
//		} catch (IOException e) {
//			System.out.println("Something went wrong : " + e);
//		} finally {
//			try {
//				reader.close();
//			} catch (NullPointerException | IOException e) {
//				e.printStackTrace();
//			}
//		}

		// AFTER
//		System.out.println("(Try-With-Resources) Please, write a line:");
//		try (BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in))) {
//			String line = reader2.readLine();
//			System.out.println(line.toLowerCase());
//		} catch (IOException e) {
//			System.out.println("Something went wrong : " + e);
//		}

		// BEFORE
//		System.out.println("(Try-With-Resources with Scanner()) Please, write a line:");
//		try (Scanner scanner = new Scanner(System.in)) {
//			String line = scanner.nextLine();
//			System.out.println(line.toUpperCase());
//		} catch (Exception e) {
//			System.out.println("Something went wrong : " + e);
//		}

		// AFTER
		System.out.println("(Try-Catch-Final with Scanner()) Please, write a line:");
		Scanner scanner = null;
		try {
			scanner = new Scanner(System.in);
			String line = scanner.nextLine();
			System.out.println(line.toUpperCase());
		} catch (Exception e) {
			System.out.println("Something went wrong : " + e);
		} finally {
			if(scanner != null)
				scanner.close();
		}
		
	}
}

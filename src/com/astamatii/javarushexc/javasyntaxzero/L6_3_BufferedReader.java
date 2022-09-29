package com.astamatii.javarushexc.javasyntaxzero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

//Программа считывает из консоли строку и выводит ее на экран, 
// чередуя регистр символов: первый символ — в нижнем регистре, второй — в верхнем, третий — в нижнем, и т.д.
// Не меняя функциональности программы, перепиши код с использованием BufferedReader для чтения из консоли.

public class L6_3_BufferedReader {

	public static void main(String[] args) {
		try (InputStream stream = System.in;
				InputStreamReader reader = new InputStreamReader(stream); // Before:
				BufferedReader console = new BufferedReader(reader)) {    // Scanner console = new Scanner(stream);
			String line = console.readLine(); // Before: String line = console.nextLine();
			char[] chars = line.toCharArray();
			for (int i = 0; i < chars.length; i++) {
				if (i % 2 == 1) {
					System.out.print(String.valueOf(chars[i]).toUpperCase());
				} else {
					System.out.print(String.valueOf(chars[i]).toLowerCase());
				}
			}
		} catch (IOException e) {
			System.out.println("Something went wrong : " + e);
		}
	}

}

// D:\\Developement\\JavaRush Course\\file1.txt

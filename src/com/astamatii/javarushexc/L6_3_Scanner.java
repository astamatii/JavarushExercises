package com.astamatii.javarushexc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

// Программа считывает из консоли строку и выводит список букв, из которых состоит введенная строка.
// Не меняя функциональности программы, перепиши код с использованием Scanner для чтения из консоли.

public class L6_3_Scanner {

	public static void main(String[] args) {
		try (InputStream stream = System.in;
		/*
		 * InputStreamReader reader = new InputStreamReader(stream); BufferedReader buff
		 * = new BufferedReader(reader)
		 */
				Scanner buff = new Scanner(stream)) {
			String line = buff.nextLine()/*readLine()*/;
			char[] chars = line.toCharArray();
			Set<Character> characters = new HashSet<>();
			for (char aChar : chars) {
				if (Character.isAlphabetic(aChar)) {
					characters.add(Character.toLowerCase(aChar));
				}
			}
			System.out.println(characters);
		} catch (IOException e) {
			System.out.println("Something went wrong : " + e);
		}

	}

}
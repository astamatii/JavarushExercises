package com.astamatii.javarushexc.javacore.L5.lesson_12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//В этой задаче тебе нужно:
//1. Считывать с консоли данные, пока не будет введено слово "exit".
//2. Для каждого значения, кроме "exit", вызвать метод print(). Если значение:
//	- содержит точку '.', вызвать метод print() для Double;
//	- больше нуля, но меньше 128, вызвать метод print() для short;
//	- меньше либо равно нулю или больше либо равно 128, вызвать метод print() для Integer;
//	- иначе — вызвать метод print() для String.

public class L5_12_OOP_4 {
	public static void main(String[] args) throws IOException {
		// напиште тут ваш код
		BufferedReader bufReader = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while (!(line = bufReader.readLine()).equals("exit")) {

			try {
				if (line.contains(".")) {
					print(Double.parseDouble(line));
					return;
				}

				Integer num = Integer.parseInt(line);

				if (num <= 0 || num >= 128) {
					print(num);
				} else {
					print(num.shortValue());
				}

			} catch (Exception e) {
				print(line);
			}

		}
		
		bufReader.close();

	}

	public static void print(Double value) {
		System.out.println("Это тип Double, значение " + value);
	}

	public static void print(String value) {
		System.out.println("Это тип String, значение " + value);
	}

	public static void print(short value) {
		System.out.println("Это тип short, значение " + value);
	}

	public static void print(Integer value) {
		System.out.println("Это тип Integer, значение " + value);
	}
}

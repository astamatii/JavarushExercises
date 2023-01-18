package com.astamatii.javarushexc.javacore.L8.lesson_11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.io.*;
import java.util.Arrays;

//Считать с консоли 2 имени файла.
//Первый файл содержит вещественные(дробные) числа, разделенные пробелом. Например, 3.1415.
//Округлить числа до целых и записать через пробел во второй файл.
//Закрыть потоки.
//
//Принцип округления:
//3.49 => 3
//3.50 => 4
//3.51 => 4
//-3.49 => -3
//-3.50 => -3
//-3.51 => -4

public class L7_8_8_IOStreams {
	public static void main(String[] args) {
		BufferedReader reader;
		BufferedWriter writer;
		String file1, file2;
		String fileText = "";
		char[] buffer;

		try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in))) {
			file1 = console.readLine();
			file2 = console.readLine();
			reader = new BufferedReader(new FileReader(file1));

			// add double numbers from file1 to a String
			while (reader.ready()) {
				buffer = new char[10];
				int length = reader.read(buffer);
				fileText += String.valueOf(buffer);
			}
			reader.close();
			
			// create a String with int numbers
			String numbersInt = Arrays.stream(fileText.split(" "))
					.filter(x -> x != null)
					.map(x -> (String.valueOf(Math.round(Double.parseDouble(x))) + " ") )
					.reduce((x, y) -> x + y)
					.get().trim();
					
			writer = new BufferedWriter(new FileWriter(file2));

			// write int numbers from String to file2 
			writer.write(numbersInt);			
			
			writer.close();
			console.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

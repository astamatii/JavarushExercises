package com.astamatii.javarushexc.javasyntaxzero;

import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.Scanner;
import java.nio.file.Path;

// Напиши программу, которая считывает из консоли имя текстового файла, 
// далее читает строки из этого файла (используй метод readAllLines(Path) класса Files) 
// и выводит их на экран через одну, начиная с первой.

public class L6_3_FilesReadAllLines {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {
			List<String> file = Files.readAllLines(Path.of(scanner.nextLine()));

			for(int i = 0; i < file.size(); i += 2)
					System.out.println(file.get(i));
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

// D:\\Developement\\JavaRush Course\\file1.txt
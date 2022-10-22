package com.astamatii.javarushexc.javasyntaxzero.L6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

// Напиши программу, которая считывает из консоли имя текстового файла, 
// далее читает символы из этого файла (используй метод readAllLines(Path) класса Files) 
// и выводит на экран все, за исключением точки, запятой и пробела.

public class L6_2_IOStreamFaceControl {

	public static void main(String[] args) {
		System.out.println("Введите имя тектового файла:");

//		My version:
		
		try (Scanner scanner = new Scanner(System.in)) {

			// BufferedReader object is created here automatically using try-with-resources(autoclosed):
			List<String> stringList = Files.readAllLines(Paths.get(scanner.nextLine())); 

			for(String string : stringList) {
				
				for(char c : string.toCharArray()) {
					if (c != '.' && c != ' ' && c != ',')
						System.out.print(c);
				}
				
				System.out.println();
			}
			
		} catch (IOException e) {
			System.out.println("You have an IOException: " + e);
		}

//		Javarush answer:
		
//		try (Scanner scanner = new Scanner(System.in)) {
//			List<String> lines = Files.readAllLines(Paths.get(scanner.nextLine()));
//			lines.forEach(str -> {
//				char[] chars = str.toCharArray();
//				for (char character : chars) {
//					if (character != ' ' && character != '.' && character != ',') {
//						System.out.print(character);
//					}
//				}
//			});
//		} catch (Exception e) {
//			System.out.println("Something went wrong : " + e);
//		}
		
	}

}

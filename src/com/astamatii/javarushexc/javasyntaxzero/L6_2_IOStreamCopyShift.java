package com.astamatii.javarushexc.javasyntaxzero;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

// Напиши программу, которая считывает с консоли путь к файлу1 и путь к файлу2. 
// Далее все байты из файла1 записывает в файл2, 
// но при этом меняет их местами по такому принципу: первый со вторым, третий с четвертым, и т.д.
// Если последний байт в файле1 нечетный, то пишем его в файл2 как есть. 
// Для чтения и записи файлов используй методы newInputStream и newOutputStream класса Files

public class L6_2_IOStreamCopyShift {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Введите путь к файлу 1:");
		String file1 = scanner.nextLine();

		System.out.println("Введите путь к файлу 2:");
		String file2 = scanner.nextLine();

		try (InputStream input = Files.newInputStream(Paths.get(file1));
				OutputStream output = Files.newOutputStream(Paths.get(file2))) {

			int[] real = new int[2];

			while (input.available() > 0) {
				if (input.available() > 1) {
					for (int i = 0; i < 2; i++) {
						real[i] = input.read();
					}
					for (int i = 1; i >= 0; i--) {
						output.write(real[i]);
					}
				} else
					output.write(input.read());
			}

		} catch (IOException e) {
			System.out.println("You have an IOException: " + e);
		}

//			Javarush Answer: (Mine is BETTER!)		
//		try (Scanner scanner = new Scanner(System.in);
//				var inputStream = Files.newInputStream(Paths.get(scanner.nextLine()));
//				var outputStream = Files.newOutputStream(Paths.get(scanner.nextLine()))) {
//			byte[] bytesIn = inputStream.readAllBytes();
//			byte[] bytesOut = new byte[bytesIn.length];
//			for (int i = 0; i < bytesIn.length; i += 2) {
//				if (i < bytesIn.length - 1) {
//					bytesOut[i] = bytesIn[i + 1];
//					bytesOut[i + 1] = bytesIn[i];
//				} else {
//					bytesOut[i] = bytesIn[i];
//				}
//			}
//			outputStream.write(bytesOut);
//		} catch (IOException e) {
//			System.out.println("Something went wrong : " + e);
//		}
	}

}


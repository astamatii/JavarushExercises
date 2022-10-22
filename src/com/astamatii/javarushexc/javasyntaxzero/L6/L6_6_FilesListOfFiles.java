package com.astamatii.javarushexc.javasyntaxzero.L6;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

// Напиши программу, которая будет считывать с клавиатуры путь к директории, 
// получать список файлов и директорий в заданной директории 
// и выводить в консоли информацию о них в виде:
// "<путь к файлу> - это файл", если это файл,
// "<путь к директории> - это директория", если это директория.
// Треугольные скобки и кавычки выводить не нужно.
// Используй соответствующие методы класса Files: newDirectoryStream(Path), isRegularFile(Path) и isDirectory(Path).

// Ввод:
// C:\javarush\
//
// Вывод:
// C:\javarush\test.txt - это файл
// C:\javarush\tasks - это директория
// ...

public class L6_6_FilesListOfFiles {

	private static final String THIS_IS_FILE = " - это файл";
	private static final String THIS_IS_DIR = " - это директория";

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		Path directory = Path.of(scanner.nextLine());

		if (Files.isRegularFile(directory))
			System.out.print(directory + THIS_IS_FILE);
		else if (Files.isDirectory(directory)) {
			DirectoryStream<Path> stream = Files.newDirectoryStream(directory);
			for (Path path : stream) {
				if (Files.isRegularFile(path))
					System.out.println(path + THIS_IS_FILE);
				else if (Files.isDirectory(path))
					System.out.println(path + THIS_IS_DIR);
			}
		}
	}
}

// D:\Development\Javarush
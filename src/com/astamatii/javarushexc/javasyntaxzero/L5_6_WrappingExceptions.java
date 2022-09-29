package com.astamatii.javarushexc.javasyntaxzero;

import java.io.FileNotFoundException;
import java.nio.file.FileSystemException;

public class L5_6_WrappingExceptions {

	public static void main(String[] args) {
		copyFile("book.txt", "book_final_copy.txt");
		copyFile("book_final_copy.txt", "book_last_copy.txt");
	}

	static void copyFile(String sourceFile, String destinationFile) {
		// напишите тут ваш код

		try {
			FileUtils.readFile(sourceFile);
			FileUtils.writeFile(destinationFile);
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		} catch (FileSystemException e) {
			throw new RuntimeException(e);
		}

	}

}

class FileUtils {

	public static void readFile(String filePath) throws FileNotFoundException {
		System.out.println("Читаем содержимое файла " + filePath);
	}

	public static void writeFile(String filePath) throws FileSystemException {
		System.out.println("Записываем данные в файл " + filePath);
	}
}

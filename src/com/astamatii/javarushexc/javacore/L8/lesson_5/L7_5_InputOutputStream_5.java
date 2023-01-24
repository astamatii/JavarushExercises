package com.astamatii.javarushexc.javacore.L8.lesson_5;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;

//1 Считывать с консоли имена файлов.
//2 Если файл меньше 1000 байт, то:
//	2.1 Закрыть потоки работы с файлами.
//	2.2 Выбросить исключение DownloadException.

public class L7_5_InputOutputStream_5 {
	public static void main(String[] args) throws DownloadException {
		while (true) {
			try (FileInputStream fileStream = new FileInputStream(
					new BufferedReader(new InputStreamReader(System.in)).readLine())) {

				if (fileStream.available() < 1000) {
					throw new DownloadException();
				}					
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static class DownloadException extends Exception {

	}
}

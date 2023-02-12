package com.astamatii.javarushexc.javacore.L08.lesson_05;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

//С консоли считать имя файла.
//Посчитать в файле количество символов ',', количество вывести на консоль.
//Закрыть потоки.
//
//Подсказка:
//нужно сравнивать с ascii-кодом символа ','.

public class L7_5_InputOutputStream_2 {
	public static void main(String[] args) {
		int count = 0;
		int comma = ',';

		try (FileInputStream fileStream = new FileInputStream(
				new BufferedReader(new InputStreamReader(System.in)).readLine())) {

			while (fileStream.available() > 0) {
				if (fileStream.read() == comma)
					count++;
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println(count);
	}
}

package com.astamatii.javarushexc.javacore.L8.lesson_11;

import java.io.FileReader;
import java.io.IOException;

//В метод main первым параметром приходит путь к файлу.
//Вывести на экран соотношение количества пробелов к количеству всех символов. Например, 10.45.
//1. Посчитать количество всех символов.
//2. Посчитать количество пробелов.
//3. Вывести на экран п2/п1*100, округлив до 2 знаков после запятой до ближайшего.
//4. Закрыть потоки.

public class L7_8_5_IOStreams {
	public static void main(String[] args) {
		String args0;
		double simbolsNum = 0, spacesNum = 0;

		try {
			args0 = args[0];
			FileReader fileReader;

			char[] buffer;

			try {
				fileReader = new FileReader(args0);
				while (fileReader.ready()) {
					buffer = new char[12];
					int length = fileReader.read(buffer);
					for (int i = 0; i < length; i++) {
						simbolsNum++;
						if (buffer[i] == ' ')
							spacesNum++;
					}
				}
				fileReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

			System.out.printf("%.2f", spacesNum / simbolsNum * 100);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

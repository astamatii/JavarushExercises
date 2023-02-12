package com.astamatii.javarushexc.javacore.L08.lesson_11;

import java.io.*;

//Читайте с консоли имена файлов.
//Если файла не существует (передано неправильное имя файла), 
//	то перехватить исключение FileNotFoundException, 
//	вывести в консоль переданное неправильное имя файла и завершить работу программы.
//Закрыть потоки.
//Не используй System.exit();

public class L7_8_12_IOStreams {
	public static void main(String[] args) {
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		FileInputStream fileStream;
		String fileName = null;

		while (true) {

			try {
				fileName = console.readLine();
				fileStream = new FileInputStream(fileName);
				fileStream.close();
			} catch (FileNotFoundException e) {
				System.out.println(fileName);
				break;
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}

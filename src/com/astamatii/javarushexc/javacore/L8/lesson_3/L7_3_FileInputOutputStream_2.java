package com.astamatii.javarushexc.javacore.L8.lesson_3;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

//Ввести с консоли имя файла.
//Найти минимальный байт в файле, вывести его на экран.
//Закрыть поток ввода-вывода.

public class L7_3_FileInputOutputStream_2 {
	public static void main(String[] args) throws Exception {
		FileInputStream fileStream = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
		
		int min = 0xFFFF;
		
		while(fileStream.available() > 0) {
			int current = fileStream.read();
			
			if(current < min)
				min = current;
		}
		
		System.out.println(min);
		
		fileStream.close();
    }
}

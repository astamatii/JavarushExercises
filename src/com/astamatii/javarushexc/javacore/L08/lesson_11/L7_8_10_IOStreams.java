package com.astamatii.javarushexc.javacore.L08.lesson_11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Считать с консоли имя файла.
//Найти в файле информацию, которая относится к заданному id, 
//	и вывести ее на экран в виде, в котором она записана в файле.
//Программа запускается с одним параметром: id (int).
//Закрыть потоки.
//
//В файле данные разделены пробелом и хранятся в следующей последовательности:
//id productName price quantity
//где id - int.
//productName - название товара, может содержать пробелы, String.
//price - цена, double.
//quantity - количество, int.
//
//Информация по каждому товару хранится в отдельной строке.
//
//Пример содержимого файла:
//194 хлеб 12.6 25
//195 масло сливочное 52.2 12
//196 молоко 22.9 19
//
//Пример вывода для id = 195:
//195 масло сливочное 52.2 12

public class L7_8_10_IOStreams {
	public static void main(String[] args) {
		BufferedReader reader;
		String file1, record = null, arg0 = null;
		
		try {
			arg0 = args[0];
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in))) {
			file1 = console.readLine();
			reader = new BufferedReader(new FileReader(file1));
			
			// find record with id(arg0) from file1 and add it to a String
			while (reader.ready()) {
				record = reader.readLine();
				if(record.split(" ")[0].equals(arg0)) break;
			}
			reader.close();			
			console.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(record);
    }
}

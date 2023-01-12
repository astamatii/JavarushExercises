package com.astamatii.javarushexc.javacore.L8.lesson_11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Iterator;

//CRUD для таблицы внутри файла.
//Напиши программу, которая считывает с консоли путь к файлу для операций CRUD 
//	и при запуске со следующим набором параметров:
//-c productName price quantity
//добавляет товар с заданными параметрами с новой строки в конец файла, 
//	генерируя id (8 символов) самостоятельно путем инкремента максимального id, найденного в файле.
//
//Значения параметров:
//-c - флаг, который означает добавления товара.
//productName - название товара, 30 символов.
//price - цена, 8 символов.
//quantity - количество, 4 символа.
//
//В файле данные хранятся в следующей последовательности (без разделяющих пробелов):
//id productName price quantity
//
//Данные дополнены пробелами до их длины.
//
//Для чтения и записи файла нужно использовать FileReader и FileWriter соответственно.
//
//Пример содержимого файла:
//19846   Шорты пляжные синие           159.00  12  
//198478  Шорты пляжные черные с рисунко173.00  17  
//19847983Куртка для сноубордистов, разм10173.991234

public class L7_8_2_IOStreams {

	// Modify padding and length using StringBuilder:
	public static void stringBuilder(StringBuilder sb, int n) {
		StringBuilder str = new StringBuilder();
		for (int i = 0; i < sb.length(); i++) {
			str.append(" ");
		}

		sb.append(str.substring(sb.length())).setLength(n);
	}

	// Modify padding and length using String:
	public static String strFormat(String str, int n) {
		return String.format("%-" + n + "s", str).substring(0, n);
	}

	public static void main(String[] args) throws Exception {
		String productName;
		String price;
		String quantity;
		String id;		
		List<String> records;
		
		BufferedReader reader;
		BufferedWriter writer;
		
		String args0 = null;
				
		try {
			args0 = args[0];
		} catch (Exception e) {
		}
		
		switch (args0) {
		case "-c":
			//Reading the filename from console
			reader = new BufferedReader(new InputStreamReader(System.in));
			String fileName = reader.readLine();
			reader.close();	
			
			//Create new file if it`s needed:
			try {
				reader = new BufferedReader(new FileReader(fileName));
			} catch (FileNotFoundException e) {
				new FileWriter(fileName).close();
				reader = new BufferedReader(new FileReader(fileName));
			}
			
			//Loading all records from file if it has:
			records = new ArrayList<>();
			while (reader.ready()) {
				records.add(reader.readLine());
			}
			reader.close();
			
			//Creating new record
			if (!records.isEmpty()) {
				id = strFormat(String.valueOf(Integer.parseInt(records.get(records.size() - 1).split(" ")[0]) + 1), 8);
			} else
				id = strFormat("1", 8);

			productName = strFormat(args[1], 30);
			price = strFormat(args[2], 8);
			quantity = strFormat(args[3], 4);
		
			records.add(id + productName + price + quantity);
			
			//Writing all records with new one, into the file:
			writer = new BufferedWriter(new FileWriter(fileName));
			for(String record : records)
				writer.write("\n" + record);
			
			writer.close();
			break;

		default:
			break;
		}

	}
}

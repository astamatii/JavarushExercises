package com.astamatii.javarushexc.javacore.L8.lesson_11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

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
    public static void main(String[] args) throws Exception {
//    	String productName = args[1];
//    	String price = args[2];
//    	String quantity = args[3];
    	int id = 0;
    	
//    	String fileName = new BufferedReader(new InputStreamReader(System.in)).readLine();   
//    	FileWriter fileWriter = new FileWriter(fileName);
//    	BufferedReader fileReader = new BufferedReader (new FileReader(fileName));    	
    	
    	List<String> record = new ArrayList<>();
    	String lastLine, line;
    	    	
    	lastLine = "19846   Шорты пляжные синие           159.00  12  ";
		if(lastLine != null)
			record = Arrays.asList(lastLine.split(" ", -1)); 
		
		record.forEach(System.out::println);
    	
//    	switch (args[0]) {
//    	case "-c":
//    		fileWriter.write("");
//    		lastLine = null;
//    		while((line = fileReader.readLine()) != null) {
//        		lastLine = line;
//        	}
//    		lastLine = "19846   Шорты пляжные синие           159.00  12  ";
//    		if(lastLine != null)
//    			record = Arrays.asList(lastLine.split(" ")); 
//    		
//    		record.forEach(System.out::println);
//    		
//    		break;
//    	}
    	
    } 
}

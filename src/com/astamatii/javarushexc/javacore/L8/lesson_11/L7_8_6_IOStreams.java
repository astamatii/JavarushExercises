package com.astamatii.javarushexc.javacore.L8.lesson_11;

import java.io.*;

//Считать с консоли 3 имени файла.
//Записать в первый файл содержимого второго файла, 
//	а потом дописать в первый файл содержимое третьего файла.
//Закрыть потоки.

public class L7_8_6_IOStreams {
    public static void main(String[] args) {
    	BufferedInputStream reader;
    	BufferedOutputStream writer;
    	String file1, file2, file3;
    	
    	try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in))) {
    		file1 = console.readLine();
    		file2 = console.readLine();
    		file3 = console.readLine();
    		reader = new BufferedInputStream(new FileInputStream(file2));
    		writer = new BufferedOutputStream(new FileOutputStream(file1));
    		
    		//write from file2 to file1
    		while(reader.available() > 0) {
    			byte[] buffer = new byte[10];
    			int length = reader.read(buffer);
    			writer.write(buffer, 0, length);
    		}
    		reader.close();
    		reader = new BufferedInputStream(new FileInputStream(file3));
    		
    		//write from file3 to file1
    		while(reader.available() > 0) {
    			byte[] buffer = new byte[10];
    			int length = reader.read(buffer);
    			writer.write(buffer, 0, length);
    		}
    		
    		reader.close();
    		writer.close();   
    		console.close();
    	} catch (IOException e) {
    		e.printStackTrace();
    	}
    }  
}

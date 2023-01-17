package com.astamatii.javarushexc.javacore.L8.lesson_11;

import java.io.*;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

//Считать с консоли 2 имени файла.
//В начало первого файла записать содержимое второго файла так, 
//	чтобы получилось объединение файлов.
//Закрыть потоки.

public class L7_8_7_IOStreams {
    public static void main(String[] args) {
    	BufferedInputStream reader;
    	BufferedOutputStream writer;
    	String file1, file2;
    	Queue<Byte> bytes = new ConcurrentLinkedQueue<>();
		byte[] buffer;

    	try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in))) {
    		file1 = console.readLine();
    		file2 = console.readLine();
    		reader = new BufferedInputStream(new FileInputStream(file2));
    		    		
    		//add bytes from file2
    		while(reader.available() > 0) {
    			buffer = new byte[10];
    			int length = reader.read(buffer);
    			for(int i = 0; i < length; i++)
    				bytes.add(buffer[i]);
    		}
    		reader.close();
    		
    		reader = new BufferedInputStream(new FileInputStream(file1));
    		    		
    		//add bytes from file1
    		while(reader.available() > 0) {
    			buffer = new byte[10];
    			int length = reader.read(buffer);
    			for(int i = 0; i < length; i++)
    				bytes.add(buffer[i]);
    		}
    		reader.close();
    		
    		writer = new BufferedOutputStream(new FileOutputStream(file1));
    		
    		//write from bytes to file1
    		buffer = new byte[10];
    		while(!bytes.isEmpty()) {
    			int length = 0;
    			for(int i = 0; i < buffer.length; i++) {
        			if (!bytes.isEmpty()) {
        				buffer[i] = bytes.poll();
        				length++;
        			}        			
        		}	    			
    			writer.write(buffer, 0, length);
    		}

    		writer.close();   
    		console.close();
    	} catch (IOException e) {
    		e.printStackTrace();
    	}
    }  
}

package com.astamatii.javarushexc.javacore.L08.lesson_11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//Придумать механизм шифровки/дешифровки.
//
//Программа запускается с одним из следующих наборов параметров:
//-e fileName fileOutputName
//-d fileName fileOutputName
//
//где:
//fileName - имя файла, который необходимо зашифровать/расшифровать.
//fileOutputName - имя файла, куда необходимо записать результат шифрования/дешифрования.
//-e - ключ указывает, что необходимо зашифровать данные.
//-d - ключ указывает, что необходимо расшифровать данные.

public class L7_8_01_IOStreams {
    public static void main(String[] args) throws IOException {
    	String fileName = args[1];
    	String fileOutputName = args[2];
    	
    	FileInputStream fileInput = new FileInputStream(fileName);
    	FileOutputStream fileOutputStream = new FileOutputStream(fileOutputName);
    	
    	byte[] buffer = new byte[100];
    	switch (args[0]) {
    	case "-e": //crypt
    		while(fileInput.available() > 0) {
    			int count = fileInput.read(buffer);
    			for (int i = 0; i < buffer.length; i++)
    				buffer[i] += 1;
    			fileOutputStream.write(buffer, 0, count);    			
    		}
    		
    		break;
    	case "-d": //decrypt
    		while(fileInput.available() > 0) {
    			int count = fileInput.read(buffer);
    			for (int i = 0; i < buffer.length; i++)
    				buffer[i] -= 1;
    			fileOutputStream.write(buffer, 0, count);    			
    		}
    		break;
    	}
    	fileInput.close();
    	fileOutputStream.close();
    }          
}

package com.astamatii.javarushexc;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

// Есть программа, которая считывает из консоли путь к файлу1 и путь к файлу2 и копирует содержимое файла1 в файл2.
// Но она не работает корректно. Найди и исправь ошибки в коде, чтобы программа заработала как нужно.

public class L6_2_IOStreamCopyFixing {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in);
	             var inputStream = Files.newInputStream(Paths.get(scanner.nextLine()));
	             var outputStream = Files.newOutputStream(Paths.get(scanner.nextLine()))
	        ) {
	            int size = 1024;
	            byte[] buffer = new byte[size];
	            while (inputStream.available() > 0) {
	                int read = inputStream.read(buffer); // inputStream.read() => inputStream.read(buffer)
	                outputStream.write(buffer, 0, read); // outputStream.write(buffer, size, read) => outputStream.write(buffer, 0, read); 
	                										// outputStream.write(array, offset, length) : 
	                										//  - array - the array of bytes written in the output file; 
	                										//  - offset - skipped bytes; 
	                										//  - length - final length (array[offset+length-1] is the last byte written).
	            }
	        } catch (Exception e) {
	            System.out.println("Something went wrong : " + e);
	        }
	}

}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
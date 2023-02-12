package com.astamatii.javarushexc.javacore.L08.lesson_05;

import java.io.*; 

//Считать с консоли три имени файла: файл1, файл2, файл3.
//Разделить файл1 по следующему критерию:
//Первую половину байт записать в файл2, вторую половину байт записать в файл3.
//Если в файл1 количество байт нечетное, то файл2 должен содержать большую часть.
//Закрыть потоки.

public class L7_5_InputOutputStream_3 {
    public static void main(String[] args) {
    	try (FileInputStream fileStream1 = new FileInputStream(
				new BufferedReader(new InputStreamReader(System.in)).readLine());
    			FileOutputStream fileStream2 = new FileOutputStream(
    					new BufferedReader(new InputStreamReader(System.in)).readLine());
    			FileOutputStream fileStream3 = new FileOutputStream(
    					new BufferedReader(new InputStreamReader(System.in)).readLine())) {

    		int countBytes = fileStream1.available();
    		
    		byte[] buffer = new byte[1]; 
    		
			while (fileStream1.available() > countBytes/2) {
				int count = fileStream1.read(buffer);
				fileStream2.write(buffer, 0, count);
			}

			while (fileStream1.available() > 0) {
				int count = fileStream1.read(buffer);
				fileStream3.write(buffer, 0, count);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}

    }   
}

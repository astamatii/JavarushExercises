package com.astamatii.javarushexc.javacore.L3.lesson_11;

//В этой задаче тебе нужно:
//Считать с консоли путь к файлу.
//Вывести в консоли (на экран) содержимое файла.
//Освободить ресурсы. Закрыть поток чтения с файла и поток ввода с клавиатуры.

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class L3_11_OOP_3 {
    public static void main(String[] args) throws Exception{
        // напишите тут ваш код
    	try(BufferedReader bufreader = new BufferedReader(
    			new InputStreamReader(
    					new FileInputStream(
    							new Scanner(System.in).nextLine())))){
    		
    		while(bufreader.ready()) {
    			System.out.println(bufreader.readLine());
    		} 
    	} catch(Exception e) {
			e.printStackTrace();
		}
    	
    	//My working code on Javarush:
//        Scanner scan = new Scanner(System.in);
//        FileInputStream fisread = new FileInputStream(scan.nextLine());
//          BufferedReader bufreader = new BufferedReader(
//    			new InputStreamReader(fisread));    
//
//    		while(bufreader.ready()) {
//    			System.out.println(bufreader.readLine());
//    		}   
//        
//        fisread.close();
//        scan.close();
//        bufreader.close();   
    	
    	//Javarush answer:
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String sourceFileName = reader.readLine();
//        FileInputStream fileInputStream = new FileInputStream(sourceFileName);
//
//        Scanner scanner = new Scanner(fileInputStream);
//        StringBuilder builder = new StringBuilder();
//
//        while (scanner.hasNextLine()) {
//            builder.append(scanner.nextLine()).append("\n");
//        }
//
//        System.out.print(builder.toString());
//
//        scanner.close();
//        reader.close();
    }  
}

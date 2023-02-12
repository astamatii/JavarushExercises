package com.astamatii.javarushexc.javacore.L03.lesson_11;

//В этой задаче тебе нужно:
//Ввести имя файла с консоли.
//Прочитать из него набор чисел.
//Вывести в консоли только четные, отсортированные по возрастанию.
//Пример ввода:
//5
//8
//-2
//11
//3
//-5
//2
//10
//
//Пример вывода:
//-2
//2
//8
//10

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Сортировка четных чисел из файла
*/

public class L3_11_11_OOP {
    public static void main(String[] args) {
        // напишите тут ваш код
    	
    	ArrayList<Integer> numbers = new ArrayList<>();
    	
    	try(BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
    			FileInputStream fistream = new FileInputStream(console.readLine());
    			BufferedReader filereader = new BufferedReader(new InputStreamReader(fistream))) {
    		
    		while(filereader.ready()) {
    			numbers.add(Integer.parseInt(filereader.readLine()));
    		}
    		
    		numbers.sort((x, y) -> x - y);
    		numbers.stream().filter(x -> x % 2 == 0).forEach(System.out::println);
    			
    	} catch (Exception e) {
    		e.printStackTrace();
    	}

    }
} 

//C:\Users\sa\Documents\file.txt

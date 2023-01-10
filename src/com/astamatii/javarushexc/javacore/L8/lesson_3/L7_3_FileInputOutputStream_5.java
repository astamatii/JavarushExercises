package com.astamatii.javarushexc.javacore.L8.lesson_3;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

//Ввести с консоли имя файла.
//Считать все байты из файла.
//Не учитывая повторений - отсортировать их по байт-коду в возрастающем порядке.
//Вывести на экран.
//Закрыть поток ввода-вывода.
//
//Пример байт входного файла:
//44 83 44
//
//Пример вывода:
//44 83

public class L7_3_FileInputOutputStream_5 {
    public static void main(String[] args) throws Exception {
    	FileInputStream fileStream = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
    	
    	Set<Integer> fileSet = new TreeSet<>();
    	
    	while(fileStream.available() > 0) {
    		fileSet.add(fileStream.read());
    	}
    	
    	fileSet.forEach(x -> System.out.print(x + " "));
    }  
}

package com.astamatii.javarushexc.javacore.L8.lesson_3;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

//Ввести с консоли имя файла.
//Найти байт или байты с максимальным количеством повторов.
//Вывести их на экран через пробел.
//Закрыть поток ввода-вывода.

public class L7_3_FileInputOutputStream_3 {
    public static void main(String[] args) throws Exception {
		FileInputStream fileStream = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
		ArrayList<Integer> fileArray = new ArrayList<>();
		Map<Integer, Long> fileMap = new HashMap<>();
		
		
		while(fileStream.available() > 0) {
			fileArray.add(fileStream.read());
		}				
		
		for (Integer i : fileArray) {
			fileMap.put(i, fileArray.stream().filter(x -> x == i).count());
		}
		
		Long max = Collections.max(fileMap.values());
						
		for (var set: fileMap.entrySet())
			if(max == set.getValue())
				System.out.print(set.getKey() + " ");
		
		fileStream.close();
    }  
}

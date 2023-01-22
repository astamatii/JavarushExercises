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
			//method III best of the best
			int fileByte = fileStream.read();
			fileMap.put(fileByte, fileMap.get(fileByte) == null ? 0 : fileMap.get(fileByte) + 1l);
			
			//for method I and II
//			fileArray.add(fileStream.read());
		}				
		
		//method I
//		for (Integer i : fileArray) {
//			fileMap.put(i, fileArray.stream().filter(x -> x == i).count());
//		}
		
		//method II : much faster
		
		for (Integer i : fileArray) {
			fileMap.put(i, fileMap.get(i) == null ? 0 : fileMap.get(i) + 1l);
		}
		
		Long max = Collections.max(fileMap.values());
						
		for (var set: fileMap.entrySet())
			if(max == set.getValue())
				System.out.print(set.getKey() + " ");
		
		fileStream.close();
    }  
}

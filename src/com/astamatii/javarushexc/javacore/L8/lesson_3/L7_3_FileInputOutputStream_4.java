package com.astamatii.javarushexc.javacore.L8.lesson_3;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

//Ввести с консоли имя файла.
//Найти байт или байты с минимальным количеством повторов.
//Вывести их на экран через пробел.
//Закрыть поток ввода-вывода.

public class L7_3_FileInputOutputStream_4 {
	public static void main(String[] args) throws Exception {
		FileInputStream fileStream = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
		Map<Integer, Long> fileMap = new HashMap<>();
		
		
		while(fileStream.available() > 0) {
			int fileByte = fileStream.read();
			fileMap.put(fileByte, fileMap.get(fileByte) == null ? 0 : fileMap.get(fileByte) + 1l);
		}				
		fileStream.close();
		
		Long min = Collections.min(fileMap.values());
						
		for (Map.Entry<Integer, Long> set: fileMap.entrySet())
			if(min == set.getValue())
				System.out.print(set.getKey() + " ");
		
		
    }
}

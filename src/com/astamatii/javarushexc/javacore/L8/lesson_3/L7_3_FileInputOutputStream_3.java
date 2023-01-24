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
		Map<Integer, Long> fileMap = new HashMap<>();
//		ArrayList<Integer> fileArray = new ArrayList<>();
		
		
		while(fileStream.available() > 0) {
			//method III best of the best
			int fileByte = fileStream.read();
			fileMap.put(fileByte, fileMap.get(fileByte) == null ? 0 : fileMap.get(fileByte) + 1l);
			
			//for method I and II
//			fileArray.add(fileStream.read());
		}				
		fileStream.close();
		
		//method I
//		for (Integer i : fileArray) {
//			fileMap.put(i, fileArray.stream().filter(x -> x == i).count());
//		}
		
		//method II : much faster
		
//		for (Integer i : fileArray) {
//			fileMap.put(i, fileMap.get(i) == null ? 0 : fileMap.get(i) + 1l);
//		}
		
		Long max = Collections.max(fileMap.values());
						
		for (Map.Entry<Integer, Long> set: fileMap.entrySet())
			if(max == set.getValue())
				System.out.print(set.getKey() + " ");
		
		
		
		//Javarush answer:
//		 BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//	        String fileName = reader.readLine();
//
//	        int[] byteCountArray = new int[256];
//	        try (FileInputStream fileInputStream = new FileInputStream(fileName)) {
//	            while (fileInputStream.available() > 0) {
//	                byteCountArray[fileInputStream.read()] += 1;
//	            }
//	        }
//	        int maxCount = 0;
//	        for (int byteCount : byteCountArray) {
//	            if (byteCount > maxCount) maxCount = byteCount;
//	        }
//	        ArrayList<Integer> resultList = new ArrayList<>();
//	        for (int i = 0; i < byteCountArray.length; i++) {
//	            if (byteCountArray[i] == maxCount) resultList.add(i);
//	        }
//	        for (Integer resultItem : resultList) System.out.print(resultItem + " ");

    }  
}

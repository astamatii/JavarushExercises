package com.astamatii.javarushexc.javacore.L08.lesson_11;

import java.io.*;
import java.util.TreeSet;

//Собираем файл из кусочков.
//Считывать с консоли имена файлов.
//Каждый файл имеет имя: [someName].partN.
//
//Например, Lion.avi.part1, Lion.avi.part2, ..., Lion.avi.part37.
//
//Имена файлов подаются в произвольном порядке. Ввод заканчивается словом "end".
//В папке, где находятся все прочтенные файлы, создать файл без суффикса [.partN].
//
//Например, Lion.avi.
//
//В него переписать все байты из файлов-частей используя буфер.
//Файлы переписывать в строгой последовательности, 
//	сначала первую часть, потом вторую, ..., в конце - последнюю.
//Закрыть потоки.

public class L7_8_13_IOStreams {
	public static void main(String[] args) {
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		FileInputStream input;
		FileOutputStream output;
		String fileName;
		TreeSet<String> fileNames = new TreeSet<>(//(s1, s2) -> {
//			String[] sArr1 = s1.split("\\.");
//			String[] sArr2 = s2.split("\\.");
//			String part1 = sArr1[sArr1.length - 1];
//			String part2 = sArr2[sArr2.length - 1];
//			return part1.compareTo(part2);
//		}
	);

		try {
			while (!(fileName = console.readLine()).equals("end")) {
				fileNames.add(fileName);
			}
			console.close();

			String[] fileArr = fileNames.first().split("\\.");
			String outputName = "";
			
			for (int i = 0; i < fileArr.length - 1; i++) {
				if (i > 0)	outputName += ".";
				outputName += fileArr[i];
			}
			
			System.out.println(outputName);
			
			output = new FileOutputStream(outputName);
			for (String s : fileNames) {
				input = new FileInputStream(s);
				
				byte[] buffer = new byte[10];
				while(input.available() > 0) {
					int length = input.read(buffer);
					output.write(buffer, 0, length);
				}
				
				input.close();
			}			
			
			output.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

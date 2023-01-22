package com.astamatii.javarushexc.javacore.L8.lesson_11;

import java.io.*;
import java.util.Comparator;
import java.util.Set;
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
    	String fileName;
    	
    	try {
			while(!(fileName = console.readLine()).equals("end")) {
				
			}
			
			console.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
    }    
}

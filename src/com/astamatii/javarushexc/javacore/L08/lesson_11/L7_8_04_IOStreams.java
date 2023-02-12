package com.astamatii.javarushexc.javacore.L08.lesson_11;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

//В метод main первым параметром приходит путь к файлу.
//Посчитать количество символов в файле, которые соответствуют буквам английского алфавита.
//Вывести на экран число (количество символов).
//Закрыть потоки.

public class L7_8_04_IOStreams {
	public static void main(String[] args) {
		String args0;
		int count = 0;
		
		try {
			args0 = args[0];
			FileReader fileReader;
			Set<Character> letters = new HashSet<>();
			for (char i = 'A'; i <= 'z'; i++) {
				letters.add(i);
			}			 
			
			char[] buffer;
			
			try {
				fileReader = new FileReader(args0);
				while(fileReader.ready()) {
					buffer = new char[12];
					fileReader.read(buffer);
					for(Character c : letters) {
						for( int i = 0; i < buffer.length; i++)
							if(c.charValue() == buffer[i]) count++;
					}
				}
				fileReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			System.out.println(count);
		} catch (Exception e) {
		}
    }
}

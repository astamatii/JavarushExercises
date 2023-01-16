package com.astamatii.javarushexc.javacore.L8.lesson_11;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

//В метод main первым параметром приходит путь к файлу.
//Посчитать количество символов в файле, которые соответствуют буквам английского алфавита.
//Вывести на экран число (количество символов).
//Закрыть потоки.

public class L7_8_4_IOStreams {
	public static void main(String[] args) {
		String args0;
		try {
			args0 = args[0];
			FileReader fileReader;
			Set<Character> letters = new HashSet<>();
			for (char i = 'a'; i <= 'z'; i++) {
				letters.add(i);
			}
			int count = 0;
			
			char[] buffer = new char[3];
			
			try {
				fileReader = new FileReader(args0);
				while(fileReader.ready()) {
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

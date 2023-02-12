package com.astamatii.javarushexc.javacore.L08.lesson_11;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Программа запускается с одним параметром - именем файла, который содержит английский текст.
//Посчитать частоту встречания каждого символа.
//Отсортировать результат по возрастанию кода ASCII (почитать в инете).
//
//Пример:
//','=44, 's'=115, 't'=116.
//
//Вывести на консоль отсортированный результат:
//[символ1] частота1
//[символ2] частота2
//Закрыть потоки.
//
//Пример вывода:
//, 19
//- 7
//f 361

public class L7_8_09_IOStreams {
    public static void main(String[] args) {
    	String args0;

		try {
			args0 = args[0];
			FileReader fileReader;
			List<Character> simbols = new ArrayList<>();
			Map<Character, Integer> result = new HashMap<>();
			
			char[] buffer;

			try {
				fileReader = new FileReader(args0);
				while (fileReader.ready()) {
					buffer = new char[12];
					int length = fileReader.read(buffer);
					for (int i = 0; i < length; i++) {
						simbols.add(buffer[i]);
					}
				}
				fileReader.close();				
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			for (char i = 0; i < 256; i++) {
				int count = 0;
				for(char c : simbols) {
					if(c == i) count++;
				}
				
				if (count != 0)
					result.put(i, count);
			}
			
			result.forEach((c, i) -> System.out.println(c + " " + i));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//Javarush answer:
//		int[] aSCII = new int[128];
//        try (FileReader reader = new FileReader(args[0])) {
//            while (reader.ready()) {
//                aSCII[reader.read()]++;
//            }
//        }
//        for (int i = 0; i < aSCII.length; i++) {
//            if (aSCII[i] != 0) {
//                System.out.println((char) i + " " + aSCII[i]);
//            }
//        }
    }
}

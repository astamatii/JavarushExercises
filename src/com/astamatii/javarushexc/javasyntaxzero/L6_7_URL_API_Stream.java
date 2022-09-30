package com.astamatii.javarushexc.javasyntaxzero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

// Твоя задача — обратиться к публичному API в интернете и получить данные. 
// Напиши программу, которая будет обращаться по ссылке к публичному API в интернете, 
// получать данные и выводить их на экран.

// Подсказки:

// Используй метод openStream() класса URL.
// Если не знаешь, какой API использовать, можешь запросить у нас на сервере список проектов-игр:
// https://javarush.ru/api/1.0/rest/projects

public class L6_7_URL_API_Stream {

	public static void main(String[] args) throws IOException {
        URL url = new URL("https://javarush.ru/api/1.0/rest/projects");
		try (InputStream input = url.openStream();
				BufferedReader reader = new BufferedReader(new InputStreamReader(input))) {
			while(reader.ready()) {
				System.out.println(reader.readLine());
			}
		}
		
		// JavaRush Solution:
//		InputStream input = url.openStream();
//        byte[] buffer = input.readAllBytes();
//        String str = new String(buffer);
//        System.out.println(str); 

	}

}

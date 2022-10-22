package com.astamatii.javarushexc.javasyntaxzero.L6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.URL;
import java.net.URLConnection;

// Твоя задача — обратиться к публичному API в интернете: отправить и получить данные.
// Напиши программу, которая будет обращаться по ссылке к публичному API в интернете, 
// отправляя туда данные, получать ответные данные и выводить их на экран.

// Подсказки:

// Используй метод openConnection() класса URL.
// Используй методы setDoOutput(true) и getOutputStream() класса URLConnection.
// Если не знаешь, какой API использовать, бери http://httpbin.org/post.

public class L6_7_URL_Connection {

	public static void main(String[] args) throws IOException {
		URL url = new URL("http://httpbin.org/post");
		URLConnection connection = url.openConnection();
		connection.setDoOutput(true);
		
		try (OutputStream output = connection.getOutputStream()) {
			output.write(1);
		}
		try (InputStream input = connection.getInputStream()) {
			System.out.println(new String(input.readAllBytes()));
		}
		
		// JavaRush Solution:
//        try (OutputStream output = connection.getOutputStream();
//                PrintStream sender = new PrintStream(output)) {
//               sender.println("Привет");
//           }
//
//           try (InputStream input = connection.getInputStream();
//                BufferedReader reader = new BufferedReader(new InputStreamReader(input))) {
//               while (reader.ready()) {
//                   System.out.println(reader.readLine());
//               }       
//           }          

	}

}

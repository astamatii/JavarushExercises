package com.astamatii.javarushexc.javacore.L3.lesson_11;

//В этой задаче тебе нужно:
//Прочесть с консоли имя файла.
//Считывать строки с консоли, пока пользователь не введет строку "exit".
//Записать абсолютно все введенные в п.2 строки в файл: каждую строчку — с новой строки.

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class L3_11_OOP_4 {
	public static void main(String[] args) {
        // напишите тут ваш код
		try(BufferedReader bufreader = new BufferedReader(new InputStreamReader(System.in));
				FileWriter filewriter = new FileWriter(bufreader.readLine());
				BufferedWriter bufwriter = new BufferedWriter(filewriter)){
			
			String line = "";
			
			while(!line.equals("exit")) {
				line = bufreader.readLine();
				bufwriter.append(line);
				bufwriter.newLine();
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
    }	
}

//C:\Users\sa\Documents\file.txt
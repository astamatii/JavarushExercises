package com.astamatii.javarushexc.javacore.L8.lesson_8;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

//Используя шаблон проектирования Wrapper (Decorator) расширь функциональность AmigoOutputStream.
//В классе QuestionFileOutputStream при вызове метода close() должна быть реализована следующая функциональность:
//	1. Вывести в консоль фразу "Вы действительно хотите закрыть поток? Д/Н".
//	2. Считай строку.
//	3. Если считанная строка равна "Д", то закрыть поток.
//	4. Если считанная строка не равна "Д", то не закрывать поток.

public class L7_8_WrappedStreams_2 {

}


class QuestionFileOutputStream implements AmigoOutputStream {

	AmigoOutputStream amigo;
	BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));
	
	QuestionFileOutputStream(AmigoOutputStream outputStream){
		amigo = outputStream;
	}
	
	@Override
	public void flush() throws IOException {
		amigo.flush();		
	}

	@Override
	public void write(int b) throws IOException {
		amigo.write(b);
	}

	@Override
	public void write(byte[] b) throws IOException {
		amigo.write(b);
	}

	@Override
	public void write(byte[] b, int off, int len) throws IOException {
		amigo.write(b, off, len);
	}

	@Override
	public void close() throws IOException {
		System.out.println("Вы действительно хотите закрыть поток? Д/Н");
		
		if("Д".equals(reader.readLine())) 
			amigo.close();		
	}

} 

interface AmigoOutputStream {
    void flush() throws IOException;

    void write(int b) throws IOException;

    void write(byte[] b) throws IOException;

    void write(byte[] b, int off, int len) throws IOException;

    void close() throws IOException;
}    
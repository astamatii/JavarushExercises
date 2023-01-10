package com.astamatii.javarushexc.javacore.L8.lesson_8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException; 

//Измени класс TxtInputStream так, чтобы он работал только с txt-файлами (*.txt).
//Например, first.txt или name.1.part3.txt.
//Если передан не txt-файл, например, file.txt.exe, то конструктор должен выбрасывать исключение UnsupportedFileNameException.
//Подумай, что еще нужно сделать, в случае выброшенного исключения.

public class L7_8_WrappedStreams_4 {

}

class TxtInputStream extends FileInputStream {

	public TxtInputStream(String fileName) throws FileNotFoundException, UnsupportedFileNameException {
		super(fileName);
		if(!fileName.endsWith(".txt"))    		
    		throw new UnsupportedFileNameException();	
    }

    public static void main(String[] args) {
    }
} 

class UnsupportedFileNameException extends Exception {

}                              
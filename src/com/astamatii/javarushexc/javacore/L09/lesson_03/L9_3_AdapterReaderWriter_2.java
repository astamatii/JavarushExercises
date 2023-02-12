package com.astamatii.javarushexc.javacore.L09.lesson_03;

import java.io.FileOutputStream;
import java.io.IOException; 

//Используй класс AdapterFileOutputStream, чтобы адаптировать 
//FileOutputStream к новому интерфейсу AmigoStringWriter.

public class L9_3_AdapterReaderWriter_2 {

}

interface AmigoStringWriter {
    void flush() throws IOException;

    void writeString(String s) throws IOException;

    void close() throws IOException;
}

class AdapterFileOutputStream {

    public static void main(String[] args) {

    }

} 

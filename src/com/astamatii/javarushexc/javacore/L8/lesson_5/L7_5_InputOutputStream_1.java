package com.astamatii.javarushexc.javacore.L8.lesson_5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//Исправить функциональность в соответствии с требованиями.
//
//Программа должна:
//1. Переписать все байты одного файла в другой одним куском.
//2. Закрывать потоки ввода-вывода.
//
//Подсказка:
//4 ошибки.

public class L7_5_InputOutputStream_1 {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream("c:/data.txt");
        // Создаем поток-записи-байт-в-файл
        FileOutputStream outputStream = new FileOutputStream("c:/result.txt");

        if (inputStream.available() > 0) { //if (inputStream.read() >= 0) { //1,2
            //читаем весь файл одним куском
            byte[] buffer = new byte[inputStream.available()];
            int count = inputStream.read(buffer);
            outputStream.write(buffer, 0, count);
        }

        inputStream.close(); 	//inputStream.reset(); //3
        outputStream.close (); 	//outputStream.flush(); //4
    }
}

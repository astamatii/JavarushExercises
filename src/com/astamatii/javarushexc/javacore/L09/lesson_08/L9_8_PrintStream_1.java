package com.astamatii.javarushexc.javacore.L09.lesson_08;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream; 

//В методе main подмени объект System.out написанной тобой ридер-оберткой по аналогии с лекцией.
//Твоя ридер-обертка должна преобразовывать весь текст в заглавные буквы.
//Вызови готовый метод printSomething(), воспользуйся testString.
//Верни переменной System.out первоначальный поток.
//Выведи модифицированную строку в консоль.

public class L9_8_PrintStream_1 {
    public static TestString testString = new TestString();

    public static void main(String[] args) {

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }  
}

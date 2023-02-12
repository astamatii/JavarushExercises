package com.astamatii.javarushexc.javacore.L09.lesson_08;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

//В методе main подмени объект System.out написанной тобой ридер-оберткой по аналогии с лекцией.
//Твоя ридер-обертка должна выводить только цифры.
//Вызови готовый метод printSomething(), воспользуйся testString.
//Верни переменной System.out первоначальный поток.
//Выведи модифицированную строку в консоль.
//
//Пример вывода:
//12345678

public class L9_8_PrintStream_3 {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's 1 a 23 text 4 f5-6or7 tes8ting");
        }
    }
}

package com.astamatii.javarushexc.javacore.L09.lesson_08;

import java.io.*;

//Считай с консоли имя файла.
//В методе main подмени объект System.out написанной тобой ридер-оберткой по аналогии с лекцией.
//Твоя ридер-обертка должна выводить весь текст и на консоль и в файл, имя которого ты считал.
//Вызови готовый метод printSomething(), воспользуйся testString.
//Верни переменной System.out первоначальный поток.
//Закрой поток файла.
//
//Пример вывода на экран:
//it's a text for testing
//
//Пример тела файла:
//it's a text for testing

public class L9_8_PrintStream_5 {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}

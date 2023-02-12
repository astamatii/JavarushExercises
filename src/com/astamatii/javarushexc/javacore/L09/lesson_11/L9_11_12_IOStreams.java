package com.astamatii.javarushexc.javacore.L09.lesson_11;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream; 

//В методе main подмени объект System.out написанной тобой ридер-оберткой.
//Твоя ридер-обертка должна выводить на консоль контекстную рекламу после каждого второго println-а.
//Вызови готовый метод printSomething(), воспользуйся testString.
//Верни переменной System.out первоначальный поток.
//
//Рекламный текст: "JavaRush - курсы Java онлайн"
//
//Пример вывода:
//first
//second
//JavaRush - курсы Java онлайн
//third
//fourth
//JavaRush - курсы Java онлайн
//fifth

public class L9_11_12_IOStreams {
	public static TestString testString = new TestString();

    public static void main(String[] args) {
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("first");
            System.out.println("second");
            System.out.println("third");
            System.out.println("fourth");
            System.out.println("fifth");
        }
    }
}

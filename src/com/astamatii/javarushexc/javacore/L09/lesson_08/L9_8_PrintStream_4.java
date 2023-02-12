package com.astamatii.javarushexc.javacore.L09.lesson_08;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

//В методе main подмени объект System.out написанной тобой ридер-оберткой по аналогии с лекцией.
//Твоя ридер-обертка должна выводить на консоль решенный пример.
//Вызови готовый метод printSomething(), воспользуйся testString.
//Верни переменной System.out первоначальный поток.
//
//Возможные операции: + - *
//Шаблон входных данных и вывода: a [знак] b = c
//Отрицательных и дробных чисел, унарных операторов - нет.
//
//Пример вывода:
//3 + 6 = 9

public class L9_8_PrintStream_4 {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    } 
}

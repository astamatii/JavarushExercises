package com.astamatii.javarushexc.javacore.L6.lesson_13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//1. В классе Solution создать public static класс нити Read3Strings унаследовавшись от Thread.
//2. В методе run реализовать чтение с консоли трех строк.
//3. Три подряд введенных строки должны считываться в одной нити и объединяться в одну строку через пробел.
//4. В методе main вывести результат для каждой нити.
//5. Используй join.
//
//Пример:
//
//Входные данные:
//a
//b
//c
//d
//e
//f
//
//Выходные данные:
//a b c
//d e f

public class L6_13_12_Threads {
	public static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws InterruptedException {
//        Read3Strings t1 = new Read3Strings();
//        Read3Strings t2 = new Read3Strings();

        //add your code here - добавьте код тут

//        t1.printResult();
//        t2.printResult();
    }

    //add your code here - добавьте код тут 
}

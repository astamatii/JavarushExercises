package com.astamatii.javarushexc.javacore.L2.lesson_4;

//Реализуй два метода: print(int) и print(Integer).
//Напиши такой код в методе main(), чтобы вызвались оба.

public class L2_4_MethodOverloading_2 {
	public static void main(String[] args) {
		print(10);
		print(Integer.valueOf(10));
    }

    //Напишите тут ваши методы
	public static void print(int i) {}
	public static void print(Integer i) {}
}

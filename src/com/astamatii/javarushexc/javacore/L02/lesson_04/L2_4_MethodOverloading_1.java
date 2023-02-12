package com.astamatii.javarushexc.javacore.L02.lesson_04;

//Напиши два метода: print(int) и print(String).

public class L2_4_MethodOverloading_1 {
	public static void main(String[] args) {

		System.out.println(print("Hi!"));
		print(32);
    }

    //Напишите тут ваши методы

	public static void print(int a) {
		System.out.println(a);
	}
	private static String print(String a) {
		return a;
	}
}

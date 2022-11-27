package com.astamatii.javarushexc.javacore.L2.lesson_4;

//Напиши public static методы: int max(int, int), long max(long, long), double max(double, double).
//Каждый метод должен возвращать максимальное из двух переданных в него чисел.

public class L2_4_MethodOverloading_5 {
	public static void main(String[] args) {

    }

    //Напишите тут ваши методы
    public static int max(int i1, int i2) {
    	return i1 > i2 ? i1 : i2;
    }
    public static long max(long i1, long i2) {
    	return i1 > i2 ? i1 : i2;
    }
    public static double max(double i1, double i2) {
    	return i1 > i2 ? i1 : i2;
    }
}

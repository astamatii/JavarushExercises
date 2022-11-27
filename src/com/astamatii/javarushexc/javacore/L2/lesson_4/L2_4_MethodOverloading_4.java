package com.astamatii.javarushexc.javacore.L2.lesson_4;

//Напиши public static методы: int min(int, int), long min(long, long), double min(double, double).
//Каждый метод должен возвращать минимальное из двух переданных в него чисел.

public class L2_4_MethodOverloading_4 {
	public static void main(String[] args) {

    }

    //Напишите тут ваши методы
    public static int min(int i1, int i2) {
    	return i1 < i2 ? i1 : i2;
    }
    public static long min(long i1, long i2) {
    	return i1 < i2 ? i1 : i2;
    }
    public static double min(double i1, double i2) {
    	return i1 < i2 ? i1 : i2;
    }
    
}

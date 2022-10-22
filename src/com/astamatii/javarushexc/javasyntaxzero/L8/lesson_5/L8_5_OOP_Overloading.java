package com.astamatii.javarushexc.javasyntaxzero.L8.lesson_5;

import java.util.ArrayList;
import java.util.Collections;

//В этой задаче тебе предстоит создать универсальный инструмент для поиска минимальных и максимальных чисел.
//В классе MinMaxUtil создай публичные статические методы min() и max(), 
//которые в качестве аргументов принимают целочисленные (тип int) значения 
//и возвращают минимальное и максимальное из них соответственно.
//
//Каждый из методов должен быть перегружен так, 
//чтобы была возможность вызвать метод с двумя, тремя, четырьмя и пятью параметрами.
//В общем, необходимо создать 8 методов, — 4 для min() и 4 для max().
//Все аргументы методов должны быть типа int.

public class L8_5_OOP_Overloading {

	public static void main(String[] args) {
		System.out.println(MinMaxUtil.min(23, -34, 231, 0));
	}

}

class MinMaxUtil {
	public static int min(int a, int b) {
		ArrayList<Integer> numbers = new ArrayList<>();

		Collections.addAll(numbers, a, b);
		return Collections.min(numbers);
	}

	public static int min(int a, int b, int c) {
		ArrayList<Integer> numbers = new ArrayList<>();

		Collections.addAll(numbers, a, b, c);
		return Collections.min(numbers);

	}

	public static int min(int a, int b, int c, int d) {
		ArrayList<Integer> numbers = new ArrayList<>();

		Collections.addAll(numbers, a, b, c, d);
		return Collections.min(numbers);
	}

	public static int min(int a, int b, int c, int d, int e) {
		ArrayList<Integer> numbers = new ArrayList<>();

		Collections.addAll(numbers, a, b, c, d, e);
		return Collections.min(numbers);
	}

	public static int max(int a, int b) {
		ArrayList<Integer> numbers = new ArrayList<>();

		Collections.addAll(numbers, a, b);
		return Collections.max(numbers);
	}

	public static int max(int a, int b, int c) {
		ArrayList<Integer> numbers = new ArrayList<>();

		Collections.addAll(numbers, a, b, c);
		return Collections.max(numbers);
	}

	public static int max(int a, int b, int c, int d) {
		ArrayList<Integer> numbers = new ArrayList<>();

		Collections.addAll(numbers, a, b, c, d);
		return Collections.max(numbers);
	}

	public static int max(int a, int b, int c, int d, int e) {
		ArrayList<Integer> numbers = new ArrayList<>();

		Collections.addAll(numbers, a, b, c, d, e);
		return Collections.max(numbers);
	}
	
	// Javarush solution:
//    public static int min(int a, int b) {
//        return Math.min(a, b);
//    }
//
//    public static int min(int a, int b, int c) {
//        return min(c, min(a, b));
//    }
//
//    public static int min(int a, int b, int c, int d) {
//        return min(d, min(a, b, c));
//    }
//
//    public static int min(int a, int b, int c, int d, int e) {
//        return min(e, min(a, b, c, d));
//    }
//
//    public static int max(int a, int b) {
//        return Math.max(a, b);
//    }
//
//    public static int max(int a, int b, int c) {
//        return max(c, max(a, b));
//    }
//
//    public static int max(int a, int b, int c, int d) {
//        return max(d, max(a, b, c));
//    }
//
//    public static int max(int a, int b, int c, int d, int e) {
//        return max(e, max(a, b, c, d));
//    }
	
}
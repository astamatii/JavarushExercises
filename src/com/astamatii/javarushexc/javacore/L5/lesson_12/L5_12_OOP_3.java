package com.astamatii.javarushexc.javacore.L5.lesson_12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//Напиши метод, который вычисляет факториал - произведение всех чисел от 1 до введенного числа, включая его.
//
//Пример вычислений: 4! = factorial(4) = 1*2*3*4
//Пример вывода: 24
//
//Для этого:
//1. Введи с консоли число меньше либо равно 150.
//2. Реализуй функцию factorial.
//3. Если введенное число меньше 0, выведи 0.
//
//0! = 1

public class L5_12_OOP_3 {

	public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(reader.readLine());
        reader.close();

        System.out.println(factorial(input));
    }

    public static String factorial(int n) {
        //add your code here
    	if(n < 0)
    		return "0";
    	if(n == 0)
    		return "1";
    	if(n > 150)
    		return "Введите число < 150";
    	
//    	return IntStream.rangeClosed(1, n)
//    	.boxed()
//    	.collect(Collectors.toList())
//    	.stream()
//    	.map(BigDecimal::valueOf)
//    	.reduce((x, y) -> x.multiply(y)).get().toString();
    	
    	//This code is faster!
    	BigDecimal result = BigDecimal.ONE;
    	for(int i = 1; i <= n; i++) {
    		result = result.multiply(BigDecimal.valueOf(i));
    	}
    	return result.toString();
    }
}

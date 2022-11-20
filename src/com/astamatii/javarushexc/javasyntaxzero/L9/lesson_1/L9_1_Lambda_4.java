package com.astamatii.javarushexc.javasyntaxzero.L9.lesson_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//Перед тобой программа, которая сортирует список чисел по возрастанию.
//Метод sortNumbers(ArrayList<Integer>) принимает список, элементы которого необходимо отсортировать. 
//Для сортировки используется метод Collections.sort(ArrayList<Integer>, Comparator<Integer>), 
// параметрами которого являются список чисел и компаратор.
//
//Твоя задача — переписать реализацию метода sortNumbers(ArrayList<Integer>), 
// чтобы вместо использования внутреннего анонимного класса Comparator<Integer> использовалось лямбда-выражение.
//
//Метод main() не принимает участие в тестировании.

public class L9_1_Lambda_4 {
    public static void main(String[] args) {
        var numbers = new ArrayList<Integer>();

        Collections.addAll(numbers, 123, -6, 12, 0, 44, 5678, -350);

        sortNumbers(numbers);

        for (Integer number : numbers) {
            System.out.println(number);
        }
    }

    public static void sortNumbers(ArrayList<Integer> numbers) {
        Comparator<Integer> comparator = (o1, o2) -> o1 - o2;
        Collections.sort(numbers, comparator);
    }   
}

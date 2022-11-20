package com.astamatii.javarushexc.javasyntaxzero.L9.lesson_2;

import java.util.ArrayList;
import java.util.Collections;

//В классе Solution есть два публичных статических метода:
//
// - String[] toStringArray(ArrayList<String>), 
//   в котором нужно преобразовать список строк в массив строк и вернуть его;
// - Integer[] toIntegerArray(ArrayList<Integer>), 
//   в котором нужно преобразовать список чисел в массив чисел и вернуть его.
//
//Для преобразования списка в массив используй метод списка toArray(), 
// в который нужно передать ссылку на конструктор массива, тип которого соответствует типу списка.
//
//Метод main() не принимает участие в тестировании.

public class L9_2_Lambda_5 {
    public static void main(String[] args) {
        var strings = new ArrayList<String>();
        Collections.addAll(strings, "Ты", "ж", "программист");

        var integers = new ArrayList<Integer>();
        Collections.addAll(integers, 1000, 2000, 3000);


        String[] stringArray = toStringArray(strings);
        for (String string : stringArray) {
            System.out.println(string);
        }

        Integer[] integerArray = toIntegerArray(integers);
        for (Integer integer : integerArray) {
            System.out.println(integer);
        }
    }

    public static String[] toStringArray(ArrayList<String> strings) {
        //напишите тут ваш код
        return strings.toArray(String[]::new);
    }

    public static Integer[] toIntegerArray(ArrayList<Integer> integers) {
        //напишите тут ваш код
        return integers.toArray(Integer[]::new);
    }

}

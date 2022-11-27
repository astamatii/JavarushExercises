package com.astamatii.javarushexc.javacore.L2.lesson_12;

//Добавь еще один метод, чтобы программа выводила на экран число 10.
//
//Подсказка: используй перегрузку методов.

public class L2_12_MethodOverloading_10 {
    public static void main(String[] args) {
        Integer i = 5;
        int x = transformValue(i);

        System.out.println(x);
    }

    public static int transformValue(int i) {
        return i * i;
    }   
    
    public static int transformValue(Integer i) {
        return i * 2;
    }   
}

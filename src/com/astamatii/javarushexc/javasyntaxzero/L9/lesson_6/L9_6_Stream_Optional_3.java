package com.astamatii.javarushexc.javasyntaxzero.L9.lesson_6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

//Задача метода printList(List<String>) — вывести в консоли все элементы списка, 
// полученного как параметр, в том же порядке. Но есть один нюанс. В списке могут быть элементы, равные null.
//
//Твоя задача — вывести все элементы списка в консоли, а вместо null — фразу: Этот элемент равен null
//В методе printList(List<String>) нельзя использовать циклы, оператор if/else и тернарный оператор.
//Для проверки равенства строки на null и замены её на другую строку 
// есть метод orElse объекта типа Optional<String>.
//
//Метод main() не принимает участие в тестировании.

public class L9_6_Stream_Optional_3 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        Collections.addAll(strings, "first", "second", null, "fourth", "fifth");

        printList(strings);
    }

    public static void printList(List<String> list) {
        String text = "Этот элемент равен null";
        //напишите тут ваш код
        list.forEach(x -> System.out.println(Optional.ofNullable(x).orElse(text)));
    }      
}

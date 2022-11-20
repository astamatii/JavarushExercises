package com.astamatii.javarushexc.javasyntaxzero.L9.lesson_7;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toSet;

//Необходимо, чтобы метод getFilteredStrings(Stream<String>) преобразовывал входящий поток строк 
// во множество строк, длина которых больше шести символов.
//Реализуй его, используя метод collect() объекта типа Stream<String>. 
//В качестве параметра передай нужный коллектор (объект типа Collector<Set<String>>). 
//Такой объект можно получить, вызвав статический метод toSet() класса Collectors.
//
//Метод main() не принимает участие в тестировании.

public class L9_7_Stream_Collectors_2 {
    public static void main(String[] args) {
        var stringStream = Stream.of("JavaRush", "CodeGym", "Amigo", "Elly", "Kim", "Risha");

        getFilteredStrings(stringStream).forEach(System.out::println);
    }

    public static Set<String> getFilteredStrings(Stream<String> stringStream) {
        //напишите тут ваш код
        return stringStream.filter(x -> x.length() > 6).collect(toSet());
    }
}

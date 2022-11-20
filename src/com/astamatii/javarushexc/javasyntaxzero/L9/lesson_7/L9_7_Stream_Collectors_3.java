package com.astamatii.javarushexc.javasyntaxzero.L9.lesson_7;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Необходимо, чтобы метод getMap(Stream<String>) преобразовывал входящий поток строк в карту (map), 
// ключом которой является сама строка, а значением — её длина.
//Реализуй его, используя метод collect() объекта типа Stream<String>. 
//В качестве параметра передай нужный коллектор (объект типа Collector<Map<String, Integer>>). 
//Такой объект можно получить, вызвав статический метод toMap() класса Collectors.
//
//Метод main() не принимает участие в тестировании.

public class L9_7_Stream_Collectors_3 {
    public static void main(String[] args) {
        var stringStream = Stream.of("JavaRush", "CodeGym", "Amigo", "Elly", "Kim", "Risha");

        getMap(stringStream).forEach((s, i) -> System.out.println(s + " - " + i));
    }

    public static Map<String, Integer> getMap(Stream<String> stringStream) {
        //напишите тут ваш код
        return stringStream.collect(Collectors.toMap(x -> x, x -> x.length()));
    }     
}

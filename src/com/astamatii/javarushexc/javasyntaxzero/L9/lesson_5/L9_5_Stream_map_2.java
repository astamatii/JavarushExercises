package com.astamatii.javarushexc.javasyntaxzero.L9.lesson_5;

import java.util.stream.Stream;

//Реализуй метод toUpperCase(Stream<String>) так, чтобы он возвращал поток таких же строк, 
// что и во входящем потоке, только в верхнем регистре.
//Поскольку это будет поток уже других строк, 
// для преобразования используй метод map() объекта типа Stream<String>.
//
//Метод main() не принимает участие в тестировании.

public class L9_5_Stream_map_2 {
	 public static void main(String[] args) {
	        Stream<String> stream = Stream.of("Не", "волнуйтесь", "если", "что-то", "не", "работает.", "Если", "бы", "всё", "работало", "вас", "бы", "уволили.");

	        toUpperCase(stream).forEach(System.out::println);
	    }

	    public static Stream<String> toUpperCase(Stream<String> strings) {
	        //напишите тут ваш код
	        return strings.map(x -> x.toUpperCase());
	    }
}

package com.astamatii.javarushexc.javasyntaxzero.L9.lesson_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

//Метод getDistinct(ArrayList<String>) получает список слов, в котором содержатся повторы. 
//Твоя задача — реализовать этот метод так, чтобы он возвращал поток слов без повторов 
// (каждое слово — по одному разу).
//В этом тебе поможет метод distinct() объекта типа Stream<String>.
//
//Метод main() не принимает участие в тестировании.

public class L9_4_Stream_3 {
	 public static void main(String[] args) {
	        var words = new ArrayList<String>();
	        Collections.addAll(words, "чтобы", "стать", "программистом", "нужно", "программировать",
	                "а", "чтобы", "программировать", "нужно", "учиться");

	        Stream<String> distinctWords = getDistinctWords(words);
	        distinctWords.forEach(System.out::println);
	    }

	    public static Stream<String> getDistinctWords(ArrayList<String> words) {
	        //напишите тут ваш код
	        return words.stream().distinct();
	    }

}

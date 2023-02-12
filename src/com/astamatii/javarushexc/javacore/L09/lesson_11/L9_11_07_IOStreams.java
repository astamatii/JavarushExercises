package com.astamatii.javarushexc.javacore.L09.lesson_11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List; 

//Считать с консоли имя файла.
//Вывести в консоль все строки из файла, которые содержат всего 2 слова из списка words.
//Закрыть потоки.
//
//Пример:
//words содержит слова А, Б, В (количество слов в списке words может быть любым).
//
//Строки:
//В Б А Д //3 слова из words, не подходит
//А Б А Д //3 слова из words, не подходит
//Д А Д //1 слово из words, не подходит
//Д А Б Д //2 слова - подходит, выводим
//Д А А Д //2 слова - подходит, выводим

public class L9_11_07_IOStreams {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) {
         
    }
}

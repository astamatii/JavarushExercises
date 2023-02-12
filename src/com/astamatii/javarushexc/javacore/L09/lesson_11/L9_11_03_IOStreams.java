package com.astamatii.javarushexc.javacore.L09.lesson_11;

//Считай с консоли имя файла, который имеет HTML-формат.
//
//Пример:
//Info about Leela <span xml:lang="en" lang="en"><b><span>Turanga Leela
//</span></b></span><span>Super</span><span>girl</span>
//
//Первым параметром в метод main приходит тег. Например, "span".
//Вывести на консоль все теги, которые соответствуют заданному тегу.
//Каждый тег на новой строке, порядок должен соответствовать порядку следования в файле.
//Количество пробелов, \n, \r не влияют на результат.
//Файл не содержит тег CDATA, для всех открывающих тегов имеется отдельный закрывающий тег, одиночных тегов нет.
//Тег может содержать вложенные теги.
//
//Пример вывода:
//<span xml:lang="en" lang="en"><b><span>Turanga Leela</span></b></span>
//<span>Turanga Leela</span>
//<span>Super</span>
//<span>girl</span>
//
//Шаблон тега:
//<tag>text1</tag>
//<tag text2>text1</tag>
//<tag
//text2>text1</tag>
//
//text1, text2 могут быть пустыми

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class L9_11_03_IOStreams {
	public static void main(String[] args) {
	
	}
}

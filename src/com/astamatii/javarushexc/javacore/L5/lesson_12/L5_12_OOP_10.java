package com.astamatii.javarushexc.javacore.L5.lesson_12;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//Для решения этой задачи:
//Инициализируй переменную Statics.FILE_NAME полным путем к файлу с данными, который содержит несколько строк.
//В статическом блоке считай из файла с именем Statics.FILE_NAME все строки и добавь их по отдельности в List lines.

public class L5_12_OOP_10 {
    public static List<String> lines = new ArrayList<String>();

    public static void main(String[] args) {
        System.out.println(lines);
    }
}

//class Statics {
//    public static String FILE_NAME = /* add the path to your source file here */;
//}   
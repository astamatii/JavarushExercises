package com.astamatii.javarushexc.javacore.L8.lesson_11;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

//Читайте с консоли имена файлов, пока не будет введено слово "exit".
//Передайте имя файла в нить ReadThread.
//Нить ReadThread должна найти байт, который встречается в файле максимальное число раз 
//	(если таких байтов несколько, выбрать наименьший), и добавить его в словарь resultMap,
//где параметр String - это имя файла, параметр Integer - это искомый байт.
//Закрыть потоки.

public class L7_8_11_IOStreams {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) {

    }

    public static class ReadThread extends Thread {
        public ReadThread(String fileName) {
            //implement constructor body
        }
        // implement file reading here - реализуйте чтение из файла тут
    } 
}

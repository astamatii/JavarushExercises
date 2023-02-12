package com.astamatii.javarushexc.javacore.L10.lesson_02;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

//В методе main() происходит считывание пути к файлу с консоли и заполнение runtimeStorage данными из файла.
//Тебе необходимо в методе save() реализовать логику записи в файл для карты runtimeStorage, 
// а в методе load() - логику чтения из файла для runtimeStorage.
//Файл должен быть в формате .properties. Комментарии в файле игнорируй.
//Про .properties прочитай в вики.
//Подсказка: используй объект класса Properties.

public class L10_2_ObjectSaving_3 {
    public static Map<String, String> runtimeStorage = new HashMap<>();

    public static void save(OutputStream outputStream) throws Exception {
        //напишите тут ваш код
    }  

    public static void load(InputStream inputStream) throws IOException {
        //напишите тут ваш код
    }

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream fos = new FileInputStream(reader.readLine())) {
            load(fos);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(runtimeStorage);
    }
}

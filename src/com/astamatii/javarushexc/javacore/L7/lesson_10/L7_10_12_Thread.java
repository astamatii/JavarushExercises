package com.astamatii.javarushexc.javacore.L7.lesson_10;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

//Сделать метод joinData транзакционным, т.е. если произошел сбой, то данные не должны быть изменены.
//1. Считать с консоли 2 имени файла.
//2. Считать построчно данные из файлов. Из первого файла - в allLines, из второго - в forRemoveLines.
//
//В методе joinData:
//3. Если список allLines содержит все строки из forRemoveLines, то удалить из списка allLines все строки, 
//	которые есть в forRemoveLines.
//4. Если условие из п.3 не выполнено, то:
//	4.1. очистить allLines от данных
//	4.2. выбросить исключение CorruptedDataException
//Метод joinData должен вызываться в main. Все исключения обработайте в методе main.
//Не забудь закрыть потоки.

public class L7_10_12_Thread {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) {
    }

    public void joinData() throws CorruptedDataException {

    } 
}

class CorruptedDataException extends IOException {
}                               

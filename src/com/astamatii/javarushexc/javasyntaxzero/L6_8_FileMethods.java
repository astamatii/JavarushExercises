package com.astamatii.javarushexc.javasyntaxzero;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class L6_8_FileMethods {

   public static void main(String[] args) throws IOException {

       //создание файла
	   System.out.println("Создаем файл...");
       Path testFile1 = Files.createFile(Paths.get("D:\\Development\\Javarush\\testFile111.txt"));
       System.out.println("Был ли файл успешно создан?");
       System.out.println(Files.exists(Paths.get("D:\\Development\\Javarush\\testFile111.txt")));

       //создание директории
       System.out.println("Создаем директорию...");
       Path testDirectory = Files.createDirectory(Paths.get("D:\\Development\\Javarush\\testDirectory"));
       System.out.println("Была ли директория успешно создана?");
       System.out.println(Files.exists(Paths.get("D:\\Development\\Javarush\\testDirectory")));

       //копируем файл с рабочего стола в директорию testDirectory2.
       System.out.println("Копируем файл...");
       Path testFile2 = Files.copy(testFile1, Paths.get("D:\\Development\\Javarush\\testDirectory\\testFile111-copy.txt"), REPLACE_EXISTING);
       System.out.println("Остался ли наш файл в родительской директории?");
       System.out.println(Files.exists(Paths.get("D:\\Development\\Javarush\\testFile111.txt")));
       System.out.println("Был ли наш файл скопирован в testDirectory?");
       System.out.println(Files.exists(Paths.get("D:\\Development\\Javarush\\testDirectory\\testFile111-copy.txt")));       
       
       //удаление скопированного файла
       Files.delete(testFile2);
       
       //перемещаем файл с рабочего стола в директорию testDirectory. Перемещать надо с указанием имени файла в папке!
       System.out.println("Перемещаем и переименовываем файл...");
       testFile1 = Files.move(testFile1, Paths.get("D:\\Development\\Javarush\\testDirectory\\testFile11.txt"), REPLACE_EXISTING);
       System.out.println("Остался ли наш файл в родительской директории?");
       System.out.println(Files.exists(Paths.get("D:\\Development\\Javarush\\testFile11.txt")));
       System.out.println("Был ли наш файл перемещен и переименован в testDirectory?");
       System.out.println(Files.exists(Paths.get("D:\\Development\\Javarush\\testDirectory\\testFile11.txt")));

       //удаление файла
       System.out.println("Удаляем файл из testDirectory...");
       Files.delete(testFile1);
       System.out.println("Файл все еще существует?");
       System.out.println(Files.exists(Paths.get("D:\\Development\\Javarush\\testDirectory\\testFile11.txt")));
       
       //удаление директории
       System.out.println("Удаляем testDirectory...");
       Files.delete(testDirectory);
       System.out.println("Директория все еще существует?");
       System.out.println(Files.exists(Paths.get("D:\\Development\\Javarush\\testDirectory")));
   }
}
package com.astamatii.javarushexc.javasyntaxzero.L6;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

//Напиши код, который будет считывать с клавиатуры ссылку на файл в интернете, 
// скачивать его 
// и сохранять во временный файл.

// Используй методы createTempFile(null, null) и write(Path, byte[]) класса Files, а также метод openStream() класса URL.

public class L6_7_URLDownloadSave {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        try (InputStream input = new URL(line).openStream()) {
        	Path temp = Files.createTempFile("file",".html"); //for JavaRush:  Files.createTempFile(null, null);
        	Files.write(temp, input.readAllBytes());
        }
        
    }


}

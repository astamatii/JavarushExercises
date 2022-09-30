package com.astamatii.javarushexc.javasyntaxzero;

import java.nio.file.Path;
import java.util.Scanner;

// Напиши программу, которая будет считывать с клавиатуры два пути 
// и выводить в консоль относительный путь между первым и вторым путями, если он существует. 
// В противном случае выводить ничего не нужно.

public class L6_5_PathRelativise {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        //напишите тут ваш код
        try{
        	System.out.println(Path.of(str1).relativize(Path.of(str2)));
        } catch (Exception e) {
        	
        }
	}

}

// C:\\windows\\
// C:\\windows\\system32\\1\\2\\
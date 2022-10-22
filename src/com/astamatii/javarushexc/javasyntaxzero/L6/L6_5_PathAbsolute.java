package com.astamatii.javarushexc.javasyntaxzero.L6;

import java.nio.file.Path;
import java.util.Scanner;

// Напиши код, который будет считывать с клавиатуры путь и выводить его в консоли, 
// при этом если путь не абсолютный, то перед выводом его нужно преобразовать к таковому.

public class L6_5_PathAbsolute {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        
        try {
        	Path path = Path.of(str);
        	System.out.println(path.isAbsolute() ? path : path.toAbsolutePath());
        } catch (Exception e) {
        	
        }
	}

}

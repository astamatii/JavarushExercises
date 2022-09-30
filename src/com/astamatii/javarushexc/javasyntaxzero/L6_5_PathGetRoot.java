package com.astamatii.javarushexc.javasyntaxzero;

import java.nio.file.Path;

// Напиши программу, в которой пользователь вводит с клавиатуры путь к файлу или папке,
// после чего в консоли выводится диск (корень для Unix-like), на котором находится этот файл (или папка).
// Для решения задачи используй Path и его методы.

import java.util.Scanner;

public class L6_5_PathGetRoot {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.print(Path.of(str).getRoot());
	}

}

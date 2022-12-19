package com.astamatii.javarushexc.javacore.L6.lesson_13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

//1. Создай 5 различных своих нитей (наследников класса Thread):
//1.1. Нить 1 должна бесконечно выполняться;
//1.2. Нить 2 должна выводить "InterruptedException" при возникновении исключения InterruptedException;
//1.3. Нить 3 должна каждые полсекунды выводить "Ура";
//1.4. Нить 4 должна реализовать интерфейс Message, при вызове метода showWarning нить должна останавливаться;
//1.5. Нить 5 должна читать с консоли числа пока не введено слово "N", 
//	а потом вывести в консоль сумму введенных чисел.
//2. В статическом блоке добавь свои нити в List<Thread> threads в перечисленном порядке.
//3. Нити не должны стартовать автоматически.
//
//Подсказка:
//Нить 4 можно проверить методом isAlive()

public class L6_13_2_Threads {
	public static List<Thread> threads = new ArrayList<>(5);

	static {
		threads.add(new Thread1());
		threads.add(new Thread2());
		threads.add(new Thread3());
		threads.add(new Thread4());
		threads.add(new Thread5());
	}

	public static void main(String[] args) {
//		threads.get(0).start();
//		threads.get(1).start();
//		threads.get(1).interrupt();
//		threads.get(2).start();
//		threads.get(3).start();
//		System.out.println(threads.get(3).isAlive());
//		((Thread4) threads.get(3)).showWarning();
//		System.out.println(threads.get(3).isAlive());
//		threads.get(4).start();
	}
}

interface Message {
	void showWarning();
}

class Thread1 extends Thread {

	@Override
	public void run() {
		while (true) {
			run();
		}
	}
}

class Thread2 extends Thread {
	@Override
	public void run() {
		try {
			Thread.sleep(0);
		} catch (InterruptedException e) {
			System.out.println("InterruptedException");
		}
	}
}

class Thread3 extends Thread {
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(500);
				System.out.println("Ура");
			} catch (InterruptedException e) {
				System.out.println("InterruptedException");
			}
		}		
	}
}

class Thread4 extends Thread implements Message {

	@Override
	public void run() {
	}

	@Override
	public void showWarning() {
		interrupt();

	}
}

class Thread5 extends Thread {

	@Override
	public void run() {
		try (BufferedReader bufreader = new BufferedReader(new InputStreamReader(System.in))) {
			String line;
			List<Integer> numbers = new ArrayList<>();

			while (!"N".equals(line = bufreader.readLine())) {
				try {
					numbers.add(Integer.parseInt(line));
				} catch (NumberFormatException e) {
					e.printStackTrace();
				}
			}
			System.out.println(
					numbers.stream()
					.reduce((x, y) -> x + y)
					.orElseGet(() -> 0)
					);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
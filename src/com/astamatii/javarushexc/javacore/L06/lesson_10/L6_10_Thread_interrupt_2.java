package com.astamatii.javarushexc.javacore.L06.lesson_10;

//1. Разберись, что делает программа.
//2. Реализуй логику метода run так, чтобы каждую секунду через пробел
//выдавался отсчет начиная с numSeconds до 1, а потом слово [Марш!] (см примеры).
//3. Если нить работает 3.5 секунды или более, прерви ее методом interrupt и внутри нити выведи в консоль слово [Прервано!].
//
//Пример для numSeconds=4 :
//"4 3 2 1 Прервано!"
//
//4. Если нить работает менее 3.5 секунд, она должна завершиться сама.
//Пример для numSeconds=3 :
//"3 2 1 Марш!"
//
//PS: метод sleep выбрасывает InterruptedException.

public class L6_10_Thread_interrupt_2 {
	public static volatile int numSeconds = 4;

	public static void main(String[] args) throws InterruptedException {
		RacingClock clock = new RacingClock();
		// add your code here - добавь код тут
		Thread.sleep(2500);
		clock.interrupt();
	}

	public static class RacingClock extends Thread {
		public RacingClock() {
			start();
		}

		public void run() {
			// add your code here - добавь код тут
			while (numSeconds > 0 && !isInterrupted()) {
				try {

					System.out.print(numSeconds-- + " ");
					Thread.sleep(1000);
					if (numSeconds == 0)
						System.out.print("Марш!");

				} catch (InterruptedException e) {
					System.out.println("Прервано!");
					interrupt();
				}
			}

			// JavaRush answer:
//        	try {
//                while (!isInterrupted() && numSeconds >= 0) {
//                    if (numSeconds == 0) {
//                        System.out.println("Марш!");
//                    } else {
//                        System.out.print(numSeconds + " ");
//                        Thread.sleep(1000);
//                    }
//                    numSeconds--;
//                }
//            } catch (InterruptedException e) {
//                if (numSeconds != -1) {
//                    System.out.println("Прервано!");
//                }   
//            }

		}
	}
}

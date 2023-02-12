package com.astamatii.javarushexc.javacore.L06.lesson_13;

//Разберись, как работает программа.
//По образу и подобию CountdownRunnable создай нить CountUpRunnable, 
//	которая выводит значения в нормальном порядке - от 1 до number.

public class L6_13_09_Threads {
    public static int number = 5;

    public static void main(String[] args) {
        new Thread(new CountdownRunnable(), "Уменьшаем").start();
        new Thread(new CountUpRunnable(), "Увеличиваем").start();
    }

    public static class CountUpRunnable implements Runnable {
    	//Add your code here - добавь код тут
        private int countIndexUp = 0; 

        public void run() {
            try {
                while (true) {
                	countIndexUp += 1;
                    System.out.println(toString());                 
                    Thread.sleep(500);
                    if (countIndexUp == L6_13_09_Threads.number) return; //Solution.number
                    
                }
            } catch (InterruptedException e) {
            }
        }

        public String toString() {
            return Thread.currentThread().getName() + ": " + countIndexUp;
        }
    } 

    public static class CountdownRunnable implements Runnable {
        private int countIndexDown = L6_13_09_Threads.number; //Solution.number;

        public void run() {
            try {
                while (true) {
                    System.out.println(toString());
                    countIndexDown -= 1;
                    Thread.sleep(500);
                    if (countIndexDown == 0) return;
                    
                }
            } catch (InterruptedException e) {
            }
        }

        public String toString() {
            return Thread.currentThread().getName() + ": " + countIndexDown;
        }
    }
}

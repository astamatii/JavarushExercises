package com.astamatii.javarushexc.javacore.L06.lesson_10;

import java.util.ArrayList;
import java.util.List;

//1. Разберись, как работает программа.
//	1.1. Обрати внимание, что объект Water - один для всех нитей.
//2. Реализуй метод ourInterruptMethod, чтобы он прерывал все нити из threads.
//3. В методе run исправь значения переменных:
//	3.1. isCurrentThreadInterrupted - должна равняться значению метода isInterrupted у текущей нити.
//	3.2. threadName - должна равняться значению метода getName (реализовано в классе Thread) у текущей нити.

public class L6_10_Thread_interrupt_5 {
    public static byte threadCount = 3;
    static List<Thread> threads = new ArrayList<Thread>(threadCount);

    public static void main(String[] args) throws InterruptedException {
        initThreadsAndStart();
        Thread.sleep(3000);
        ourInterruptMethod();
    }

    public static void ourInterruptMethod() {
        //add your code here - добавь код тут
    	threads.forEach(x -> x.interrupt());
    }

    private static void initThreadsAndStart() {
        Water water = new Water("water");
        for (int i = 0; i < threadCount; i++) {
            threads.add(new Thread(water, "#" + i));
        }

        for (int i = 0; i < threadCount; i++) {
            threads.get(i).start();
        }
    }

    public static class Water implements Runnable {
        private String sharedResource;

        public Water(String sharedResource) {
            this.sharedResource = sharedResource;
        }

        public void run() {
            //fix 2 variables - исправь 2 переменных
            boolean isCurrentThreadInterrupted = Thread.currentThread().isInterrupted();
            String threadName = Thread.currentThread().getName();

            try {
                while (!isCurrentThreadInterrupted) {

                    System.out.println("Объект " + sharedResource + ", нить " + threadName);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
            }
        }
    }
}

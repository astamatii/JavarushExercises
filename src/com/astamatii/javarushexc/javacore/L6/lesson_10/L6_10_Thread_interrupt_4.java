package com.astamatii.javarushexc.javacore.L6.lesson_10;

//Разберись, как работает программа.
//Реализуй метод ourInterruptMethod таким образом, чтобы он прерывал нить TestThread. 
//Исправь остальной код программы, если это необходимо. Нельзя использовать метод interrupt.

public class L6_10_Thread_interrupt_4 {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new TestThread());
        t.start();
        Thread.sleep(3000);
        ourInterruptMethod();
    }

    public static void ourInterruptMethod() {

    }

    public static class TestThread implements Runnable {
        public void run() {
            while (true) {
                try {
                    System.out.println("he-he");
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }
            }
        }
    } 
}

package com.astamatii.javarushexc.javacore.L06.lesson_13;

//1. В методе printMsg присвой переменной t текущую нить.
//2. В методе printMsg после всех действий поставь задержку в 1 миллисекунду.

public class L6_13_04_Threads {
    static int count = 5;

    public static void main(String[] args) {
        ThreadNamePrinter tnp = new ThreadNamePrinter();
        tnp.start();
        for (int i = 0; i < count; i++) {
            tnp.printMsg();
        }
    }

    public static class ThreadNamePrinter extends Thread {
        public void run() {
            for (int i = 0; i < count; i++) {
                printMsg();
            }
        }

        public void printMsg() {
            Thread t = Thread.currentThread(); //присвой переменной t текущую нить
            String name = t.getName();
            System.out.println("Name=" + name);
            //add sleep here - добавь sleep тут
            try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
        }
    } 
}

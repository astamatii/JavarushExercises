package com.astamatii.javarushexc.javacore.L06.lesson_05;

//1. Разберись, что делает программа.
//2. Нужно сделать так, чтобы все мыши ели одновременно.
//3. Подумай, какой метод позволяет альфа-самцу мыши есть первым, и почему остальные мыши ждут.
//4. Удали вызов этого метода.

public class L6_5_Thread_join_4 {
    public static void main(String[] args) throws InterruptedException {
        Mouse alpha = new Mouse("#1");
//        alpha.join();
        Mouse mouse1 = new Mouse("#2");
        Mouse mouse2 = new Mouse("#3");
    }

    private static void eat() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
    }

    public static class Mouse extends Thread {
        public Mouse(String name) {
            super(name);
            start();
        }

        public void run() {
            System.out.println(getName() + " is starting to eat");
            eat();
            System.out.println(getName() + " has finished eating");
        }
    }
}

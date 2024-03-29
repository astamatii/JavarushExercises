package com.astamatii.javarushexc.javacore.L07.lesson_10;

//1. Сделай так, чтобы результат успел посчитаться для всех элементов массива values 
//	НЕ используя Thread.sleep в методе main(String[] args)
//2. Исправь synchronized блок так, чтобы массив values заполнился значением 1

public class L7_10_13_Thread {
    public static void main(String[] args) throws InterruptedException {
        Counter counter1 = new Counter();
        Counter counter2 = new Counter();
        Counter counter3 = new Counter();
        Counter counter4 = new Counter();

        counter1.start();
        counter2.start();
        counter3.start();
        counter4.start();
        counter1.join();
        counter2.join();
        counter3.join();
        counter4.join();
        
        for (int i = 1; i <= 100; i++) {
            if (values[i] != 1) {
                System.out.println("Массив values содержит элементы неравные 1");
                break;
            }
        }
    }

    public static Integer count = 0;
    public static int[] values = new int[105];

    static {
        for (int i = 0; i < 105; i++) {
            values[i] = 0;
        }
    }

    public static void incrementCount() {
        count++;
    }

    public static int getCount() {
        return count;
    }

    public static class Counter extends Thread {
        @Override
        public void run() {
            do {
            	
                synchronized (values) { // or synchronized (L7_10_13_Thread.class) {
                	incrementCount();      
                	values[getCount()]++;
                }

                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                }
            } while (getCount() < 100);
        }
    }   
}

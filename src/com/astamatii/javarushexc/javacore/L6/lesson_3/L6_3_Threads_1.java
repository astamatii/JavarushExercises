package com.astamatii.javarushexc.javacore.L6.lesson_3;

//Создать public static class TestThread - нить с интерфейсом Runnable.
//TestThread должен выводить в консоль "My first thread".

public class L6_3_Threads_1 {
    public static void main(String[] args) {
        TestThread task = new  TestThread();
        new Thread(task).start();
    }
    
    public static class TestThread implements Runnable {

    	@Override
    	public void run() {
    		System.out.println("My first thread");
    	}
    	
    }
}


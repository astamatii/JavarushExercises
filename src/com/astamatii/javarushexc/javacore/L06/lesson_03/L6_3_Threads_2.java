package com.astamatii.javarushexc.javacore.L06.lesson_03;

//1. Создать public static класс TestThread, унаследованный от класса Thread.
//2. Создать статик блок внутри TestThread, который выводит в консоль "it's a static block inside TestThread".
//3. Метод run должен выводить в консоль "it's a run method".

public class L6_3_Threads_2 {
    public static void main(String[] args) {
        TestThread thread = new TestThread();
        thread.start();
    } 
    
    public static class TestThread extends Thread {

    	static {
    		System.out.println("it's a static block inside TestThread");
    	}
    	
    	@Override
    	public void run() {
    		System.out.println("it's a run method");
    	}
    	
    }
}

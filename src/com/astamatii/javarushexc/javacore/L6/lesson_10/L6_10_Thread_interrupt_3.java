package com.astamatii.javarushexc.javacore.L6.lesson_10;

//Создай нить TestThread.
//В методе main создай экземпляр нити, запусти, а потом прерви ее используя метод interrupt().

public class L6_10_Thread_interrupt_3 {
    public static void main(String[] args) throws InterruptedException {
        //Add your code here - добавь код тут
    	TestThread thread = new TestThread();
    	thread.start();
    	thread.interrupt();
    }

    //Add your code below - добавь код ниже
    public static class TestThread extends Thread {

		@Override
		public void run() {
			
		}
    }   
}

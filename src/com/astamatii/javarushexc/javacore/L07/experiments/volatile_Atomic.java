package com.astamatii.javarushexc.javacore.L07.experiments;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class volatile_Atomic {
	public static AtomicInteger sharedAtomic = new AtomicInteger(0);
	public static AtomicLong sharedAtomicLong = new AtomicLong(0);
	public static int sharedInt = 0;
	
	public static void main(String[] args) throws InterruptedException {
				
		Thread thread1 = new Thread(() -> {
			for (int i = 0; i < 50000; i++) {
				sharedAtomic.incrementAndGet();
				sharedAtomicLong.incrementAndGet();
				sharedInt++;				
			}
		});
		
		Thread thread2 = new Thread(() -> {
			for (int i = 0; i < 50000; i++) {
				sharedAtomic.incrementAndGet();
				sharedAtomicLong.addAndGet(1); 
				sharedInt++;
			}
		});
		
		thread1.start();
		thread2.start();		
		thread1.join();
		thread2.join();
		
		System.out.println("AtomicInteger: 50000 + 50000 = " + sharedAtomic.get());
		System.out.println("AtomicLong: 50000 + 50000 = " + sharedAtomicLong.get());
		System.out.println("int: 50000 + 50000 = " + sharedInt);
	}
}

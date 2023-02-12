package com.astamatii.javarushexc.javacore.L02.lesson_12;

//Вот что тебе нужно сделать в этой задаче:
//Внутри класса Solution создай интерфейс public interface CanFly (летать) с методом void fly().
//Внутри класса Solution создай интерфейс public interface CanClimb (лазить по деревьям) с методом void climb().
//Внутри класса Solution создай интерфейс public interface CanRun (бегать) с методом void run().
//Подумай логически, какие именно интерфейсы нужно добавить для каждого класса.
//Добавь интерфейсы классам Cat (кот), Dog (собака), Tiger (тигр), Duck (Утка).

public class L2_12_06_Interface {
    public static void main(String[] args) {

    }

    public interface CanFly {
    	void fly();
    }
    
    public interface CanClimb {
    	void climb();
    }
    
    public interface CanRun {
    	void run();
    }
    
    public class Cat implements CanFly, CanClimb {

		@Override
		public void climb() {
			
		}

		@Override
		public void fly() {
			
		}
    }

    public class Dog implements CanRun{

		@Override
		public void run() {
			
		}
    }

    public class Tiger extends Cat {
    }

    public class Duck implements CanRun, CanFly{

		@Override
		public void fly() {
			
		}

		@Override
		public void run() {
			
		}
    }
}

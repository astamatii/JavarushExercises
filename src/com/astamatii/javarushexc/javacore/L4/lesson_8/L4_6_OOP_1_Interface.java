package com.astamatii.javarushexc.javacore.L4.lesson_8;

//В этой задаче тебе нужно:
//Создать интерфейс Bridge с методом int getCarsCount().
//Создать классы WaterBridge и SuspensionBridge, которые реализуют интерфейс Bridge.
//Метод getCarsCount() должен возвращать любое фиксированное значение типа int.
//Метод getCarsCount() должен возвращать различные значения для различных классов.
//В классе Solution создать публичный метод println(Bridge bridge).
//В методе println() вывести на консоль значение getCarsCount() для объекта bridge.
//Каждый класс и интерфейс должны быть в отдельных файлах.

public class L4_6_OOP_1_Interface {
    public static void main(String[] args) {
        println(new WaterBridge());
        println(new SuspensionBridge());
    }

    //add println method here
    
    public static void println(Bridge bridge) {
    	System.out.println(bridge.getCarsCount());
    }
}

interface Bridge {
	int getCarsCount();
}

class WaterBridge implements Bridge{

	@Override
	public int getCarsCount() {
		return 30;
	}
}

class SuspensionBridge implements Bridge{

	@Override
	public int getCarsCount() {
		return 40;
	}
}
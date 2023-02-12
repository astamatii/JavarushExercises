package com.astamatii.javarushexc.javacore.L05.lesson_12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader; 

//В этой задаче тебе нужно:
//1. Создать в отдельных файлах классы Plane и Helicopter, реализующие интерфейс CanFly.
//2. Класс Plane должен иметь конструктор с параметром int - количество перевозимых пассажиров.
//3. В статическом методе reset() класса Solution:
//	- считать с консоли параметр типа String;
//	- если параметр равен "helicopter", статическому объекту CanFly result присвоить объект класса Helicopter;
//	- если параметр равен "plane", считать второй параметр типа int (количество пассажиров), 
//	статическому объекту CanFly result присвоить объект класса Plane.
//4. В статическом блоке инициализировать CanFly result, вызвав метод reset().
//5. Закрыть поток ввода методом close().

public class L5_12_OOP_01 {
    public static void main(String[] args) {

    }

    static {
        //add your code here - добавьте код тут
    	CanFly result;
    	reset();
    }

    public static CanFly result;

    public static void reset() {
        //add your code here - добавьте код тут
    	    	
    	try (BufferedReader bufreader = new BufferedReader(new InputStreamReader(System.in))){
    		String line = bufreader.readLine();
    		if(line.equals("helicopter"))
    			result = new Helicopter();
    		if(line.equals("plane")) {
    			result = new Plane(Integer.parseInt(bufreader.readLine()));
    		}
    		
    		bufreader.close();
    	} catch (IOException e) {
    		e.printStackTrace();
    	}
    }
}

interface CanFly {
    void fly();   
}

class Plane implements CanFly {

	public Plane (int passengers) {
		
	}
	
	@Override
	public void fly() {
		
	}
	
}

class Helicopter implements CanFly {

	@Override
	public void fly() {
		
	}
	
}
package com.astamatii.javarushexc.javacore.L05.lesson_12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;  

//Для решения этой задачи тебе нужно:
//1. Найти пример паттерна Singleton с ленивой реализацией (lazy initialization).
//2. По образу и подобию в отдельных файлах создать в отдельных файлах три класса синглтона — Sun, Moon, Earth.
//3. Реализовать интерфейс Planet в классах Sun, Moon, Earth.
//4. В статическом блоке класса Solution вызвать метод readKeyFromConsoleAndInitPlanet().
//5. Реализовать функционал метода readKeyFromConsoleAndInitPlanet():
//	- для этого считай с консоли один параметр типа String.
//	- если он равен одной из констант интерфейса Planet, создай соответствующий объект 
//	и присвой его Planet thePlanet, иначе — обнули Planet thePlanet.

public class L5_12_OOP_07 {
    public static void main(String[] args) {

    }

    public static Planet thePlanet;

    //add static block here - добавьте статический блок тут
    static {
    	readKeyFromConsoleAndInitPlanet();
    }
    
    public static void readKeyFromConsoleAndInitPlanet() {
        // implement step #5 here - реализуйте задание №5 тут
    	try (BufferedReader bufReader = new BufferedReader(new InputStreamReader(System.in))){
    		String line = bufReader.readLine();
    		
    		if (Planet.SUN.equals(line))
    			thePlanet = Sun.getInstance();
    		else if (Planet.MOON.equals(line))
    			thePlanet = Moon.getInstance();
    		else if (Planet.EARTH.equals(line))
    			thePlanet = Earth.getInstance();
    		else thePlanet = null;
    			
    	} catch (IOException e) {
    		e.printStackTrace();
    	}
    } 
}

class Sun implements Planet {
	private static Sun instance;
	
	private Sun() {}
	
	public static Sun getInstance() {
		if(instance == null) {
			instance = new Sun();
		}
		return instance;
	}
}

class Moon implements Planet {
	private static Moon instance;
	
	private Moon() {}
	
	public static Moon getInstance() {
		if(instance == null) {
			instance = new Moon();
		}
		return instance;
	}
}

class Earth implements Planet {
	private static Earth instance;
	
	private Earth() {}
	
	public static Earth getInstance() {
		if(instance == null) {
			instance = new Earth();
		}
		return instance;
	}
}

interface Planet {
    static String SUN = "sun";
    static String MOON = "moon";
    static String EARTH = "earth";
}
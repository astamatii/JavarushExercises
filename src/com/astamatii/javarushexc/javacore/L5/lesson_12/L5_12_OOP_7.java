package com.astamatii.javarushexc.javacore.L5.lesson_12;

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

public class L5_12_OOP_7 {
    public static void main(String[] args) {

    }

    public static Planet thePlanet;

    //add static block here - добавьте статический блок тут

    public static void readKeyFromConsoleAndInitPlanet() {
        // implement step #5 here - реализуйте задание №5 тут
    } 
}

interface Planet {
    static String SUN = "sun";
    static String MOON = "moon";
    static String EARTH = "earth";
}
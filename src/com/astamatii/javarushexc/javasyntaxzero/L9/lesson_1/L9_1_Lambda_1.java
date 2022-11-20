package com.astamatii.javarushexc.javasyntaxzero.L9.lesson_1;

import java.util.ArrayList;

//В интерфейсе Runnable объявлен метод run() и есть две его реализации: в классе Car и в классе Plane.
//В классе Solution есть публичное статическое поле ArrayList<Runnable> list, а также два публичных статических метода:
//addToList(Runnable), который добавляет в список list элемент, полученный в качестве входного параметра,
// и метод runList(), который вызывает метод run() у каждого элемента списка list.
//Твоя задача — реализовать эти методы.
//
//Метод main() не участвует в тестировании.

public class L9_1_Lambda_1 {

	public static ArrayList<Runnable> list = new ArrayList<>();

    public static void main(String[] args) {
        addToList(new Car());
        addToList(new Plane());

        runList();
    }

    public static void addToList(Runnable runnable) {
        //напишите тут ваш код
    	list.add(runnable);
    }

    public static void runList() {
        //напишите тут ваш код
    	list.forEach(x -> x.run());
    }

}

interface Runnable {
    void run();
}                

class Car implements Runnable {

    @Override
    public void run() {
        System.out.println("Car is running!");
    }
}          

class Plane implements Runnable {

    @Override
    public void run() {
        System.out.println("Plane is running!");
    }
}


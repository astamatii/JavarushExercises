package com.astamatii.javarushexc.javacore.L2.lesson_2;

//Напиши метод, который определяет, объект какого класса ему передали, 
// и выводит на экран одну из надписей: Кошка, Собака, Птица, Лампа.

public class L2_2_Polymorphism_4 {
    public static void main(String[] args) {
        printObjectType(new Cat());
        printObjectType(new Bird());
        printObjectType(new Lamp());
        printObjectType(new Cat());
        printObjectType(new Dog());
    }

    public static void printObjectType(Object o) {
        //Напишите тут ваше решение
    	String pet = "";
    	
    	if(o instanceof Cat)
    		pet = "Кошка";
    	if(o instanceof Dog)
    		pet = "Собака";
    	if(o instanceof Bird)
    		pet = "Птица";
    	if(o instanceof Lamp)
    		pet = "Лампа";
    	
    	System.out.println(pet);
    }

    public static class Cat {
    }

    public static class Dog {
    }

    public static class Bird {
    }

    public static class Lamp {
    }     
}

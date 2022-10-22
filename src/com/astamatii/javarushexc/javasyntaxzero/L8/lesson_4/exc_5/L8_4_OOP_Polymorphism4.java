package com.astamatii.javarushexc.javasyntaxzero.L8.lesson_4.exc_5;

//Класс Pet является родительским классом для классов Cat и Dog. 
//В нем реализован метод printInfo(), который сообщает, что данный объект является питомцем.
//В классах Cat и Dog переопредели метод printInfo(), дополни его функционал следующим образом:
//
// 1. вначале вызови метод printInfo() родительского класса;
// 2. потом дополнительно выведи в консоли "Я не люблю людей" для класса Cat или "Я люблю людей" для класса Dog.
//
//Пример вывода для класса Cat:
//Я домашний питомец.
//Я не люблю людей.
//
//Пример вывода для класса Dog:
//Я домашний питомец.
//Я люблю людей.

public class L8_4_OOP_Polymorphism4 {

	public static void main(String[] args) {
        Cat cat = new Cat();
        cat.printInfo();
        Dog dog = new Dog();
        dog.printInfo();
    }
	
}

class Pet {
    public void printInfo(){
        System.out.println("Я домашний питомец.");
    }         
}

class Dog extends Pet {
    public static final String DOG = "Я люблю людей.";

    //напишите тут ваш код
    @Override
    public void printInfo() {
    	super.printInfo();
    	System.out.println(DOG);
    }
}              

class Cat extends Pet {
    public static final String CAT = "Я не люблю людей.";

    //напишите тут ваш код
    @Override
    public void printInfo() {
    	super.printInfo();
    	System.out.println(CAT);
    }    
}                 

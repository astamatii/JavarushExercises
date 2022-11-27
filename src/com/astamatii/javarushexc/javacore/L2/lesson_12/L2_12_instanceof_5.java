package com.astamatii.javarushexc.javacore.L2.lesson_12;

//Напиши метод, который определяет, какой объект в него передали.
//Программа должна выводить на экран одну из надписей: «Кот», «Тигр», «Лев», «Бык», «Корова», «Животное».
//
//Примечание: постарайся определять тип животного как можно более точно.

public class L2_12_instanceof_5 {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Animal()));
    }

    public static String getObjectType(Object o) {
        //напишите тут ваш код
    	String animal = "";
      	
    	if(o instanceof Tiger)
    		animal = "Тигр";
    	else if(o instanceof Lion)
    		animal = "Лев";
    	else if(o instanceof Cat)
    		animal = "Кот";
    	else if(o instanceof Bull)
    		animal = "Бык";
    	else if(o instanceof Cow)
    		animal = "Корова";
    	else if(o instanceof Animal)
    		animal = "Животное";
    	
        return animal;
    }

    public static class Cat extends Animal   //<--Классы наследуются!!
    {
    }

    public static class Tiger extends Cat {
    }

    public static class Lion extends Cat {
    }

    public static class Bull extends Animal {
    }

    public static class Cow extends Animal {
    }

    public static class Animal {
    }
}

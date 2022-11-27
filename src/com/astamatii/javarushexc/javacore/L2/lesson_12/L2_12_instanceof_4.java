package com.astamatii.javarushexc.javacore.L2.lesson_12;

//Напиши метод, который определяет, какой объект передали в него.
//Программа должна выводить на экран одну из надписей: «Кот», «Тигр», «Лев», «Бык», «Животное».

public class L2_12_instanceof_4 {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Pig()));
    }

    public static String getObjectType(Object o) {
        //напишите тут ваш код
    	String animal = "";
    	
    	if(o instanceof Cat)
    		animal = "Кот";
    	else if(o instanceof Tiger)
    		animal = "Тигр";
    	else if(o instanceof Lion)
    		animal = "Лев";
    	else if(o instanceof Bull)
    		animal = "Бык";
    	else animal = "Животное";
    	
        return animal;
    }

    public static class Cat {
    }

    public static class Tiger {
    }

    public static class Lion {
    }

    public static class Bull {
    }

    public static class Pig {
    }     
}

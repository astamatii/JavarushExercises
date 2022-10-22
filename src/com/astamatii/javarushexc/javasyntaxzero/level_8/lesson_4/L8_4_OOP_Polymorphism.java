package com.astamatii.javarushexc.javasyntaxzero.level_8.lesson_4;

import java.util.ArrayList;

//Перед тем, как космический корабль отправится бороздить просторы Вселенной, 
//необходимо пригласить на борт экипаж, который будет состоять из 2 людей, 1 собаки и 1 кота.
//В методе createCrew() добавь необходимое количество экземпляров соответствующих классов в список astronauts.
//
//Подсказка:
//Чтобы добавить объекты разных классов в один список, им нужен общий предок. 
//Унаследуй интересующие тебя классы от Astronaut. Кто угодно может стать исследователем космоса :)

public class L8_4_OOP_Polymorphism {

    public static ArrayList<Astronaut> astronauts = new ArrayList<>();

    public static void main(String[] args) {
        createCrew();
        printCrewInfo();
    }

    public static void createCrew(){
        //напишите тут ваш код
    	astronauts.add(new Cat());
    	astronauts.add(new Dog());
    	astronauts.add(new Human());
    	astronauts.add(new Human());
    }

    public static void printCrewInfo() {
        System.out.println("На борт погружены члены экипажа: ");
        for (Astronaut astronaut : astronauts) {
            System.out.println(astronaut.getInfo());
        }
    }  

}

class Astronaut {
    public String getInfo(){
        return "Неизвестный астронавт";
    }  
}

class Cat extends Astronaut {
    public String getInfo(){
        return "Кот";
    }     
}

class Human extends Astronaut {
    public String getInfo(){
        return "Человек";
    }
}

class Dog extends Astronaut {
    public String getInfo(){
        return "Собака";
    }
}
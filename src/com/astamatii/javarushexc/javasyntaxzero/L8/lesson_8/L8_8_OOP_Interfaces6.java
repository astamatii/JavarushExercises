package com.astamatii.javarushexc.javasyntaxzero.L8.lesson_8;

//Классы Car и Bus имплементируют интерфейс Vehicle. При этом имплементации некоторых его методов у них сходятся.
//Реализуй эти методы как default в самом интерфейсе Vehicle, а из классов Car и Bus их убери.

public class L8_8_OOP_Interfaces6 {

}

interface Vehicle {
	default void start() {
        System.out.println("Начинаю движение.");
    }
	
    void move();
    
    default void stop() {
        System.out.println("Останавливаюсь.");
    }
}       

class Car implements Vehicle {

    public void move() {
        System.out.println("Еду со средней скоростью 70 км/ч.");
    }


}

class Bus implements Vehicle{

    public void move() {
        System.out.println("Еду со средней скоростью 50 км/ч.");
    }

}   
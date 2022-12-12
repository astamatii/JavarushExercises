package com.astamatii.javarushexc.javacore.L5.lesson_6;

//Упрости код:
//1. убери все наследования классов, которые автоматически добавятся при компиляции;
//2. убери все конструкторы, которые создаются и добавляются автоматически.

public class L5_6_Constructors_RunOrder_3 {
    public static void main(String[] args) {
    }

    public interface Runnable {

    }

    public class Machine implements Runnable {

    }

    public class Car extends Machine {

    }  
}

package com.astamatii.javarushexc.javacore.L05.lesson_04;

//Измени метод printName() так, чтобы он выполнялся для man и woman.
//Реализация метода printName() должна быть одна.

public class L5_4_MethodOverloading_4 {
    public static void main(String[] args) {
        Man man = new Man();
        Woman woman = new Woman();

        printName(man);
        printName(woman);
    }

    public static void printName(Human human) {

    }

    public static class Human {

    }

    public static class Man extends Human {

    }

    public static class Woman extends Human {

    } 
}

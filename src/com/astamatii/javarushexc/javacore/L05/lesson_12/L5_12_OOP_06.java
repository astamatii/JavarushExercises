package com.astamatii.javarushexc.javacore.L05.lesson_12;

import java.math.BigDecimal;

//Для решения этой задачи:
//1. Два раза перегрузи в классе Tree метод info(Object s) так, 
//	чтобы получилось три метода: info(Object s), info(Number s), info(String s).
//2. Разберись в методе info(Object s). Сделай по аналогии функционал новых методов.
//	Например, для метода info(Number s) результат может быть таким: "Дерево № 123 , метод Number, параметр Short".

public class L5_12_OOP_06 {
    public static void main(String[] args) {
        //Блок 2.
        //Вызов для Object
        new Tree().info((Object) new Integer("4"));
        new Tree().info((Object) new Short("4"));
        new Tree().info((Object) new BigDecimal("4"));

        //Блок 3.
        //Вызов для Number
        new Tree().info(new Integer("4"));
        new Tree().info(new Short("4"));
        new Tree().info(new BigDecimal("4"));

        //Блок 4.
        //Вызов для String
        new Tree().info(new String("4"));
        new Tree().info(new Integer("4").toString());
        new Tree().info(new Short("4").toString());
        new Tree().info(new BigDecimal("4").toString());
    }
}

class Tree {
    public static int globalNumber;
    public int number;

    public Tree() {
        this.number = ++globalNumber;
    }

    public void info(Object s) {
        System.out.println(String.format("Дерево № %d , метод Object, параметр %s", number, s.getClass().getSimpleName()));
    } 
    
    public void info(Number s) {
        System.out.println(String.format("Дерево № %d , метод Number, параметр %s", number, s.getClass().getSimpleName()));
    } 
    
    public void info(String s) {
        System.out.println(String.format("Дерево № %d , метод String, параметр %s", number, s.getClass().getSimpleName()));
    } 
}
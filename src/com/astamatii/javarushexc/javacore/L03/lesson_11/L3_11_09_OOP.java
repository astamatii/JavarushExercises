package com.astamatii.javarushexc.javacore.L03.lesson_11;

//Реализуй интерфейс Animal в классе Fox.
//Поменяй код так, чтобы в классе Fox был только один метод - getName.
//Учти, что методы удалять нельзя.

import java.awt.*; 

public class L3_11_09_OOP {
    public static void main(String[] args) throws Exception {
    }

    public interface Animal {
        Color getColor();

        Integer getAge();
    }

    public static abstract class Fox implements Animal{
        public String getName() {
            return "Fox";
        }
    }    
}

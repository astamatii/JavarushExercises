package com.astamatii.javarushexc.javacore.L03.lesson_04;

//Реализуй в классе Fox интерфейс Animal.
//Поменяй код так, чтобы в классе Fox был только один метод - getName.
//Учти, что создавать дополнительные классы и удалять методы нельзя!

import java.awt.*;

public class L3_4_AbstractClass_3 {
    public static void main(String[] args) throws Exception {
    }

    public interface Animal {
        Color getColor();
    }

    public static abstract class Fox implements Animal {
        public String getName() {
            return "Fox";
        }
    }   
}

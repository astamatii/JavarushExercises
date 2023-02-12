package com.astamatii.javarushexc.javacore.L02.lesson_06;

//Исправь код, чтобы программа компилировалась.
//
//Подсказка: метод getChild должен остаться абстрактным.

public class L2_6_AbstractClass_3 {
    public static void main(String[] args) {

    }

    public static abstract class Pet {
        public String getName() {
            return "Я - котенок";
        }

        public abstract Pet getChild();
    }               
}

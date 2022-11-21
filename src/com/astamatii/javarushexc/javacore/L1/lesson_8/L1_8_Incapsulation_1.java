package com.astamatii.javarushexc.javacore.L1.lesson_8;

//Скрой все внутренние переменные класса Cat.

public class L1_8_Incapsulation_1 {
    public static void main(String[] args) {
    }

    public class Cat {
        private String name;
        private int age;
        private int weight;

        public Cat() {
        }

        public Cat(String name, int age, int weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }
    }      
}

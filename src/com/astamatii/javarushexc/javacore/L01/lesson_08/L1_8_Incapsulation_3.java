package com.astamatii.javarushexc.javacore.L01.lesson_08;

//Скрой все внутренние переменные класса Cat, а также методы, 
// позволяющие менять внутреннее состояние объектов класса Cat.

public class L1_8_Incapsulation_3 {
    public static void main(String[] args) {
    }

    public class Cat {
        private String name;
        private int age;
        private int weight;

        public Cat(String name, int age, int weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }

        public String getName() {
            return name;
        }

        private void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        private void setAge(int age) {
            this.age = age;
        }
    } 
}

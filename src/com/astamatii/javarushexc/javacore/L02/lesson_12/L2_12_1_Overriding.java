package com.astamatii.javarushexc.javacore.L02.lesson_12;

//Переопредели метод getName в классе Cat так, чтобы программа выдавала на экран надпись «Я - кот».

public class L2_12_1_Overriding {
    public static void main(String[] args) {
        Pet pet = new Cat();

        System.out.println(pet.getName());
    }

    public static class Pet {
        public String getName() {
            return "Я - пушистик";
        }
    }

    public static class Cat extends Pet {
    	@Override
    	public String getName() {
            return "Я - кот";
        }
    }
}

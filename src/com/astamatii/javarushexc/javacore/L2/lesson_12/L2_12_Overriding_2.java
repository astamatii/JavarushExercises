package com.astamatii.javarushexc.javacore.L2.lesson_12;

//Переопредели метод setName в классе Cat так, чтобы программа выдавала на экран надпись «Я - кот».

public class L2_12_Overriding_2 {
    public static void main(String[] args) {
        Pet pet = new Cat();
        pet.setName("Я - пушистик");

        System.out.println(pet.getName());
    }

    public static class Pet {
        protected String name;

        public Pet() {
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    }

    public static class Cat extends Pet {
    	@Override
    	public void setName(String name) {
            this.name = "Я - кот";
        }
    } 
}

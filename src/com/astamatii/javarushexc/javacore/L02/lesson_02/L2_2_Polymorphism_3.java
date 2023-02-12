package com.astamatii.javarushexc.javacore.L02.lesson_02;

//Переопредели метод getChild в классах Cat(кот) и Dog(собака), чтобы кот порождал кота, а собака — собаку.

public class L2_2_Polymorphism_3 {
    public static void main(String[] args) {
        Pet pet1 = new Cat();
        Pet cat = pet1.getChild();

        cat.getChild();
        
        Pet pet2 = new Dog();
        Pet dog = pet2.getChild();
        
        dog.getChild();
    }

    public static class Pet {
        public Pet getChild() {
            return new Pet();
        }
    }

    public static class Cat extends Pet {
    	@Override
    	public Pet getChild() {
            return new Cat();
        }  	
    }

    public static class Dog extends Pet {
    	@Override
    	public Pet getChild() {
            return new Dog();
        }
    }
}

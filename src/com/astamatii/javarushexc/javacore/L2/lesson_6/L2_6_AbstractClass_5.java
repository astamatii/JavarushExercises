package com.astamatii.javarushexc.javacore.L2.lesson_6;

//Унаследуй классы Cat и Dog от Pet.
//Реализуй недостающие методы. Классы Cat и Dog не должны быть абстрактными.

public class L2_6_AbstractClass_5 {
    public static void main(String[] args) {

    }

    public static abstract class Pet {
        public abstract String getName();

        public abstract Pet getChild();
    }

    public static class Cat extends Pet {

		@Override
		public String getName() {
			return "Cat";
		}

		@Override
		public Pet getChild() {
			return new Cat();
		}

    }

    public static class Dog extends Pet {

		@Override
		public String getName() {
			return "Dog";
		}

		@Override
		public Pet getChild() {
			return new Dog();
		}

    }  
}

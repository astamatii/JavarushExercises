package com.astamatii.javarushexc.javacore.L02.lesson_06;

//Унаследуй класс Cow от Animal.
//Реализуй все недостающие методы в классе Cow.

public class L2_6_AbstractClass_4 {
    public static void main(String[] args) {

    }

    public static abstract class Animal {
        public abstract String getName();
    }

    public static class Cow extends Animal{

		@Override
		public String getName() {
			return "Cow";
		}
    }
}

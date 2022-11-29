package com.astamatii.javarushexc.javacore.L3.lesson_2;

//Реализуй интерфейс Drink в классах Beer и Cola.

public class L3_2_Interfaces_3 {
    public static void main(String[] args) throws Exception {
        print(new Beer());
        print(new Cola());
    }

    private static void print(Drink drink) {
        System.out.println(drink.getClass().getSimpleName());
    }

    public interface Drink {
        boolean isAlcoholic();
    }

    public static class Beer implements Drink {

		@Override
		public boolean isAlcoholic() {
			return true;
		}
    }

    public static class Cola implements Drink {

		@Override
		public boolean isAlcoholic() {
			return false;
		}
    }
}

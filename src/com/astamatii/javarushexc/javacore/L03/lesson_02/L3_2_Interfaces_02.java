package com.astamatii.javarushexc.javacore.L03.lesson_02;

//Добавь к классу AlcoholicBeer интерфейс Drink и реализуй все его методы.

public class L3_2_Interfaces_02 {
    public static void main(String[] args) throws Exception {
        Drink beer = new AlcoholicBeer();
        System.out.println(beer.toString());
    }

    public interface Drink {
        boolean isAlcoholic();
    }

    public static class AlcoholicBeer implements Drink {
        @Override
        public String toString() {
            if (isAlcoholic()) {
                return "Напиток алкогольный";
            } else {
                return "Напиток безалкогольный";
            }
        }

		@Override
		public boolean isAlcoholic() {
			return true;
		}

    }
}

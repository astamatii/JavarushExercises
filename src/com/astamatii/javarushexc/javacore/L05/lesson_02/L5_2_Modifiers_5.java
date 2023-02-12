package com.astamatii.javarushexc.javacore.L05.lesson_02;

//У каждого человека есть рост и вес. 
//Класс Human реализует соответствующие интерфейсы. 
//Но, похоже, в такой реализации закралась ошибка. 
//Обрати внимание на вывод программы. 
//Исправь ошибки в интерфейсах (подсказка: переименуй методы, согласно требований к задаче) 
//и, соответственно, в остальном коде. 
//На экран должны быть выведены рост и вес человека (любые положительные целые числа).

public class L5_2_Modifiers_5 {
    public interface HasWeight {
        int getWeight();
    }

    public interface HasHeight {
        int getHeight();
    }

    public static class Human implements HasWeight, HasHeight {

    	@Override
		public int getHeight() {
			return 23;
		}

		@Override
		public int getWeight() {
			return 42;
		}
    }

    public static void main(String[] args) {
        Human human = new Human();
        System.out.println(human.getHeight());
        System.out.println(human.getWeight());
    } 
}

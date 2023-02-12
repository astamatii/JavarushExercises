package com.astamatii.javarushexc.javacore.L05.lesson_02;

//Давай создадим классы животных и определим их размер, унаследовав их от правильных классов.
//Для этого:
//1. Создай public static класс Goose (Гусь).
//2. Создай public static класс Dragon (Дракон).
//3. Унаследуй класс Goose от BigAnimal или SmallAnimal, подумай, какой логически больше подходит.
//4. Унаследуй класс Dragon от BigAnimal или SmallAnimal, подумай, какой логически больше подходит.
//5. В классах Goose и Dragon переопредели метод String getSize(), расширь видимость до максимальной.
//6. В классе Goose метод getSize должен возвращать строку "Гусь маленький, " + [getSize родительского класса].
//7. В классе Dragon метод getSize должен возвращать строку "Дракон большой, " + [getSize родительского класса].

public class L5_2_Modifiers_2 {
    //добавьте классы Goose и Dragon тут

	public static class Goose extends SmallAnimal {
		@Override
		public String getSize() {
			return "Гусь маленький, " + super.getSize();
		}
	}
	
	public static class Dragon extends BigAnimal {
		@Override
		public String getSize() {
			return "Дракон большой, " + super.getSize();
		}
	}
	
    public static void main(String[] args) {

    }

    public static class BigAnimal {
        protected String getSize() {
            return "как динозавр";
        }
    }

    public static class SmallAnimal {
        String getSize() {
            return "как кошка";
        }
    }  
}

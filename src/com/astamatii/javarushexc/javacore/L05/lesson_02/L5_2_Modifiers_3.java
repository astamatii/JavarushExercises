package com.astamatii.javarushexc.javacore.L05.lesson_02;

//Оцени наши машины и определи их в подходящую категорию — роскошное или дешевое авто — и выведи результат.
//Для вывода используй только переменные из класса Constants.
//1. В классе Ferrari реализуй метод printlnDesire, чтобы он выводил на экран "Я хочу ездить на Феррари".
//2. В классе Lanos реализуй метод printlnDesire, чтобы он выводил на экран "Я хочу ездить на Ланосе".
//3. Создай public static класс LuxuriousCar (РоскошнаяМашина).
//4. Создай public static класс CheapCar (ДешеваяМашина).
//5. Унаследуй Ferrari и Lanos от CheapCar и LuxuriousCar, подумай, какой класс для кого.
//6. В классе LuxuriousCar реализуй метод printlnDesire, чтобы он выводил на экран "Я хочу ездить на роскошной машине".
//7. В классе CheapCar реализуйте метод printlnDesire, чтобы он выводил на экран "Я хочу ездить на дешевой машине".
//8. В классах LuxuriousCar и CheapCar для метода printlnDesire 
//	расставь различными способами модификаторы доступа так, чтобы в классах Ferrari и Lanos выполнялось расширение видимости.

public class L5_2_Modifiers_3 {
    public static void main(String[] args) {
        new L5_2_Modifiers_3.LuxuriousCar().printlnDesire();
        new L5_2_Modifiers_3.CheapCar().printlnDesire();
        new L5_2_Modifiers_3.Ferrari().printlnDesire();
        new L5_2_Modifiers_3.Lanos().printlnDesire();
    }
    
    public static class LuxuriousCar {
    	protected void printlnDesire() {
        	System.out.println(Constants.WANT_STRING + Constants.LUXURIOUS_CAR);
        }
    }
    
    public static class CheapCar {
    	void printlnDesire() {
        	System.out.println(Constants.WANT_STRING + Constants.CHEAP_CAR);
        }
    }

    public static class Ferrari extends LuxuriousCar {
        public void printlnDesire() {
            //add your code here
        	System.out.println(Constants.WANT_STRING + Constants.FERRARI_NAME);
        }
    }

    public static class Lanos extends CheapCar {
        public void printlnDesire() {
            //add your code here
        	System.out.println(Constants.WANT_STRING + Constants.LANOS_NAME);
        }
    }

    public static class Constants {
        public static String WANT_STRING = "Я хочу ездить на ";
        public static String LUXURIOUS_CAR = "роскошной машине";
        public static String CHEAP_CAR = "дешевой машине";
        public static String FERRARI_NAME = "Феррари";
        public static String LANOS_NAME = "Ланосе";
    } 
}

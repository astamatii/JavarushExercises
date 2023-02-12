package com.astamatii.javarushexc.javacore.L04.lesson_08;

//Класс является синглтоном (реализует паттерн Singleton), 
// если позволяет создать всего один объект своего типа.
//
//Реализуй Singleton pattern:
//1. Создай класс Singleton в отдельном файле.
//2. Добавь в него статический метод getInstance().
//3. При любом вызове метода getInstance() он должен возвращать один и тот же объект класса Singleton.
//4. Подумай, каким образом можно запретить создание других объектов этого класса.
//5. Сделай все конструкторы в классе Singleton приватными (private).
//6. В итоге должна быть возможность создать объект (экземпляр класса) используя только метод getInstance.

public class L4_6_OOP_13_Singleton {
    public static void main(String[] args) {
    	Singleton a = Singleton.getInstance();
    } 
}

class Singleton {
	private static final Singleton instance = new Singleton();
	
	private Singleton() {}
	
	public static Singleton getInstance() {
		return instance;		
	}
}
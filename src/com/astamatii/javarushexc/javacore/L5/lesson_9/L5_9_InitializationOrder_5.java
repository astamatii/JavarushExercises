package com.astamatii.javarushexc.javacore.L5.lesson_9;

//В этой задаче тебе нужно:
//Создать класс Cat с публичным полем name типа String в классе Solution.
//В статическом блоке создать объект типа Cat и инициализировать им переменную cat 
//	(не забудь инициализировать поле name).
//В статическом блоке вывести имя созданного кота на экран.
//Примечание: не создавай конструкторы с параметрами в классе Cat.

public class L5_9_InitializationOrder_5 {
    public static Cat cat;
    
    static {
    	cat = new Cat();
		cat.name = "Kaka";
		System.out.println(cat.name);
	}
    
    public static void main(String[] args) {
    }
    
    public static class Cat {
    	public String name;    	
    }
}

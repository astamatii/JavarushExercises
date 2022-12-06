package com.astamatii.javarushexc.javacore.L5.lesson_9;

//В этой задаче тебе нужно:
//1. Создать 7 нестатических public полей класса:
//		intVar типа int
//		doubleVar типа double
//		DoubleVar типа Double
//		booleanVar типа boolean
//		ObjectVar типа Object
//		ExceptionVar типа Exception
//		StringVar типа String
//2. Убедиться, что они инициализируются дефолтными значениями.
//3. Вывести их значения в заданном порядке в методе main()

public class L5_9_InitializationOrder_3 {
	
	public int intVar;
	public double doubleVar;
	public Double DoubleVar;
	public boolean booleanVar;
	public Object ObjectVar;
	public Exception ExceptionVar;
	public String StringVar;
	
    public static void main(String[] args) {
    	L5_9_InitializationOrder_3 solution = new L5_9_InitializationOrder_3();
    	System.out.println(solution.intVar);   
    	System.out.println(solution.doubleVar);
    	System.out.println(solution.DoubleVar);
    	System.out.println(solution.booleanVar);
    	System.out.println(solution.ObjectVar);
    	System.out.println(solution.ExceptionVar);
    	System.out.println(solution.StringVar);
    }         
}

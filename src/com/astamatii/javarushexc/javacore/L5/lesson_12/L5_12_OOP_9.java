package com.astamatii.javarushexc.javacore.L5.lesson_12;

//Разберись, что и в какой последовательности инициализируется в этой программе, а затем:
//1. Поставь брейкпойнты и используй дебаггер.
//2. Исправь порядок инициализации данных так, чтобы результат был следующим:
//		static void init()
//		Static block
//		public static void main
//		Non-static block
//		static void printAllFields
//		0
//		null
//		Solution constructor
//		static void printAllFields
//		6
//		First name

public class L5_12_OOP_9 {
    static {
        System.out.println("Static block");
    }

    {
        System.out.println("Non-static block");
        printAllFields(this);
    }

    public int i = 6;

    public String name = "First name";

    static {
        init();
    }

    public L5_12_OOP_9() {
        System.out.println("Solution constructor");
        printAllFields(this);
    }

    public static void init() {
        System.out.println("static void init()");
    }

    public static void main(String[] args) {
        System.out.println("public static void main");
        L5_12_OOP_9 s = new L5_12_OOP_9();
    }

    public static void printAllFields(L5_12_OOP_9 obj) {
        System.out.println("static void printAllFields");
        System.out.println(obj.name);
        System.out.println(obj.i);
    }
}

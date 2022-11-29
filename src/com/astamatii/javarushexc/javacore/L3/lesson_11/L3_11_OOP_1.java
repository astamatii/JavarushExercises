package com.astamatii.javarushexc.javacore.L3.lesson_11;

//Удали все некорректные строки в интерфейсе Button.

public class L3_11_OOP_1 {
    public static void main(String[] args) throws Exception {
        System.out.println(SimpleObject.NAME);
        System.out.println(Button.NAME);
    }

    interface SimpleObject {
        String NAME = "SimpleObject";
    }

    interface Button extends SimpleObject {

        final String NAME = "Submit";

        public void onPress();

        String onPress(Object o);
    }   
}

package com.astamatii.javarushexc.javacore.L5.lesson_2;

//Добавь все возможные интерфейсы из Movable, Sellable, Discountable в класс Clothes.
//Реализуй их методы.

public class L5_2_Modifiers_1 {
    public static void main(String[] args) {

    }

    public interface Movable {
        boolean isMovable();
    }

    public interface Sellable {
        Object getAllowedAction(String name);
    }

    public interface Discountable {
        Object getAllowedAction();
    }

    public static class Clothes {
    }    
}

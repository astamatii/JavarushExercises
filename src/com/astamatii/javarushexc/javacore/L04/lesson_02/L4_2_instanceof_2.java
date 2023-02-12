package com.astamatii.javarushexc.javacore.L04.lesson_02;

//Исправь строчку 'Cat cat = new Cat();' так, чтобы программа вывела "Bingo!".

public class L4_2_instanceof_2 {
    public static void main(String[] args) {
        Cat cat = new TomCat();

        boolean isCat = cat instanceof Cat;
        boolean isMovable = cat instanceof CanMove;
        boolean isTom = cat instanceof TomCat;

        if (isCat && isMovable && isTom) System.out.println("Bingo!");
    }

    interface CanMove {
    }

    static class Cat implements CanMove {
    }

    static class TomCat extends Cat {

    }
}

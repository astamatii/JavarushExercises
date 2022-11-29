package com.astamatii.javarushexc.javacore.L3.lesson_2;

//Исправь 4 ошибки в программе, чтобы она компилировалась.

public class L3_2_Interfaces_5 {
    public static void main(String[] args) {

        System.out.println(Dream.HOBBY.toString());
        System.out.println(new Hobby().toString());

    }

    interface Desire {
    }

    interface Dream {
        public static Hobby HOBBY = new Hobby();
    }

    static class Hobby implements Desire, Dream {
        static int INDEX = 1;

        @Override
        public String toString() {
            INDEX++;
            return "" + INDEX;
        }    
    }
}

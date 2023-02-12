package com.astamatii.javarushexc.javacore.L05.lesson_06;

//Упрости код — удали все конструкторы и вызовы конструкторов суперклассов, 
//которые автоматически добавятся при компиляции.
//
//Взаимосвязь между объектами классов NakedCat и NormalCat, SiamCat — Is-a: http://en.wikipedia.org/wiki/Is-a

public class L5_6_Constructors_RunOrder_2 {
    public static void main(String[] args) {
        SiamCat simka = new SiamCat("Simka");
        NakedCat nakedSimka = simka.shave();
    }

    public static class NakedCat {
    }

    public static class NormalCat extends NakedCat {
        public NormalCat() {
        }

        public NormalCat(String name) {
            System.out.println("My name is " + name);
        }

        public NakedCat shave() {
            return this;
        }
    }

    public static class SiamCat extends NormalCat {
        public SiamCat(String name) {
            super(name);
        }
    } 
}

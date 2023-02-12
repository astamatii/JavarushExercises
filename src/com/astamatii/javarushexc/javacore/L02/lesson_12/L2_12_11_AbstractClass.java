package com.astamatii.javarushexc.javacore.L02.lesson_12;

//Необходимо расставить правильно ключевые слова abstract, чтобы программа компилировалась.
//Добавь там, где нужно, и удали там, где они не нужны.

public class L2_12_11_AbstractClass {
    public static void main(String[] args) {
        Horse horse = new Pegasus();
        horse.run();
    }

    public static interface CanFly {
        public void fly();
    }

    public static class Horse {
        public void run() {

        }
    }

    public static class Pegasus extends Horse implements CanFly {
        public void fly() {

        }
    }

    public static abstract class SwimmingPegasus extends Pegasus {
        public abstract void swim();
    }   
}

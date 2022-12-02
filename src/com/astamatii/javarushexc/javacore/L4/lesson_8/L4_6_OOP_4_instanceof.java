package com.astamatii.javarushexc.javacore.L4.lesson_8;

//Напиши реализацию метода printMainInfo, чтобы:
//Если в метод передают объект типа Drawable, у этого объекта вызывался метод draw.
//Если в метод передают объект типа Movable, у этого объекта вызывался метод move.

public class L4_6_OOP_4 {
    public static void main(String[] args) {
        Object obj = new Circle();
        Movable movable = (Movable) obj;
        Drawable drawable = new Rectangle();

        printMainInfo(drawable);
        printMainInfo(movable);
    }

    public static void printMainInfo(Object object) {
        //напишите тут ваш код
    }

    static interface Movable {

        void move();
    }

    static class Circle implements Movable {

        public void draw() {
            System.out.println("Can be drawn");
        }

        public void move() {
            System.out.println("Can be moved");
        }

    }

    static interface Drawable {
        void draw();
    }

    static class Rectangle implements Drawable {
        public void draw() {
            System.out.println("Can be drawn");
        }

        public void move() {
            System.out.println("Can be moved");
        }
    } 
}

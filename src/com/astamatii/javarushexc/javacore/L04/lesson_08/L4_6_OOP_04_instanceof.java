package com.astamatii.javarushexc.javacore.L04.lesson_08;

//Напиши реализацию метода printMainInfo, чтобы:
//Если в метод передают объект типа Drawable, у этого объекта вызывался метод draw.
//Если в метод передают объект типа Movable, у этого объекта вызывался метод move.

public class L4_6_OOP_04_instanceof {
    public static void main(String[] args) {
        Object obj = new Circle();
        Movable movable = (Movable) obj;
        Drawable drawable = new Rectangle();

        printMainInfo(drawable);
        printMainInfo(movable);
    }

    public static void printMainInfo(Object object) {
        //напишите тут ваш код
    	
    	if (object instanceof Drawable)
    		((Drawable)object).draw();
    	if (object instanceof Movable)
    		((Movable)object).move();
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

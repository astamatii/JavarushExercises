package com.astamatii.javarushexc.javasyntaxzero.L8.lesson_2;

//Классы Triangle, Rectangle и Circle — геометрические фигуры, поэтому они и унаследованы от класса Shape.
//Переопредели в них метод printInfo(), чтобы в консоли выводилось название конкретной фигуры:
//Для Triangle — "Треугольник";
//Rectangle — "Прямоугольник";
//Circle — "Круг".
//
//Метод main() в тестировании участия не принимает.

public class L8_2_OOP_Inheritance2 {

	public static void main(String[] args) {
        Shape shape = new Shape();
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        Triangle triangle = new Triangle();
        shape.printInfo();
        circle.printInfo();
        rectangle.printInfo();
        triangle.printInfo();
    }
	
}

class Shape {
    public void printInfo(){
        System.out.println("Геометрическая фигура");
    }
}

class Rectangle extends Shape {
	@Override
	public void printInfo() {
		System.out.println("Прямоугольник");
	}
}

class Triangle extends Shape {

	@Override
	public void printInfo() {
		System.out.println("Треугольник");
	}
	
}

class Circle extends Shape {
	@Override
	public void printInfo() {
		System.out.println("Круг");
	}
}
package com.astamatii.javarushexc.javacore.L3.lesson_11;

//Исправь классы Fox и BigFox так, чтобы программа компилировалась.
//В решении этой задачи не нужно создавать экземпляры базового класса.
//Метод main не изменяй.

import java.awt.*;

public class L3_11_OOP_10 {
    public static void main(String[] args) throws Exception {
        Fox bigFox = new BigFox();
        System.out.println(bigFox.getName());
        System.out.println(bigFox.getColor());
    }

    public interface Animal {
        Color getColor();
    }

    public static abstract class Fox implements Animal {
        public String getName() {
            return "Fox";
        }
    }

    public static class BigFox extends Fox {

		@Override
		public Color getColor() {
			return null;
		}
    }
}

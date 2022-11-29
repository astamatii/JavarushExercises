package com.astamatii.javarushexc.javacore.L3.lesson_4;

//Исправь класс BigFox так, чтобы программа компилировалась.

import java.awt.*;

public class L3_4_AbstractClass_4 {
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

    public static class BigFox extends Fox{
        public Color Color() {
            return Color.GRAY;
        }

		@Override
		public java.awt.Color getColor() {
			return Color();
		}
    } 
}

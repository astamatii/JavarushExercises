package com.astamatii.javarushexc.javacore.L02.lesson_02;

//Переопредели метод getName в классе Whale(Кит), чтобы программа выдавала:
//
//Я не корова, Я - кит.

public class L2_2_Polymorphism_1 {
    public static void main(String[] args) {
        Cow cow = new Whale();

        System.out.println(cow.getName());
    }

    public static class Cow {
        public String getName() {
            return "Я - корова";
        }
    }

    public static class Whale extends Cow {
    	@Override 
    	public String getName() {
    		return "Я не корова, Я - кит.";
    	}
    }   
}

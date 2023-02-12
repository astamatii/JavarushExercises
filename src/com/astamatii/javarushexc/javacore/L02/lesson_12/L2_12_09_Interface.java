package com.astamatii.javarushexc.javacore.L02.lesson_12;

//Добавь такой класс-родитель к классу CTO (технический директор), чтобы класс перестал быть абстрактным.
//Добавлять/реализовывать методы в классе CTO запрещается.

public class L2_12_09_Interface {

    public static void main(String[] args) {
        CTO cto = new CTO();
        System.out.println(cto);
    }

    public static interface Businessman {
        public void workHard();
    }

    public static class CTO extends Human implements Businessman {

    }        
    
    public static class Human {
    	public void workHard() {};
    }
	
}

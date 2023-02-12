package com.astamatii.javarushexc.javacore.L05.lesson_12;

//Исправь класс Hryvnia так, чтоб избежать возникновения ошибки StackOverflowError.

public class L5_12_OOP_13 {
    public static void main(String[] args) {
        System.out.println(new Hryvnia().getAmount());
    }

    public static abstract class Money {
        abstract Money getMoney();

        public Object getAmount() {
            return getMoney().getAmount();
        }
    }

    //add your code below - добавь код ниже
    public static class Hryvnia extends Money {
        private double amount = 123d;

        public Hryvnia getMoney() {
            return this;
        }
        
        public Object getAmount() { //Automat will convert to Double (Double also works)
        	return this.amount;
        }
    }
}

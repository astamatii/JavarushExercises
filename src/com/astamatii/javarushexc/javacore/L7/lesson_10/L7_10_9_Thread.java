package com.astamatii.javarushexc.javacore.L7.lesson_10;

//И снова быт...
//Поставьте один synchronized, чтобы diana и igor гладили по очереди, ведь утюг всего один!
//
//Подсказка:
//использовать блокировку на уровне класса.

public class L7_10_9_Thread {
    public static void main(String[] args) {
        Person diana = new Person("Diana");
        Person igor = new Person("Igor");
        diana.start();
        igor.start();
    }

    public static class Person extends Thread { //Человек

        public Person(String name) {
            super(name);
        }

        @Override
        public void run() {
            Iron iron = takeIron();
            Clothes clothes = takeClothes();
            iron(iron, clothes);
            returnIron();
        }

        protected Iron takeIron() {
        	synchronized(Iron.class) {
        		System.out.println("Taking the iron");
                return new Iron();
        	}            
        }

        protected Iron returnIron() {
            System.out.println("Returning the iron");
            return new Iron();
        }

        protected Clothes takeClothes() {
            return new Clothes("T-shirt");
        }

        protected void iron(Iron iron, Clothes clothes) {
            System.out.println(getName() + " is ironing a " + clothes.name);
        }
    }

    public static class Iron {
    } //Утюг

    public static class Clothes {//Одежда
        String name;

        public Clothes(String name) {
            this.name = name;
        }
    } 
}

package com.astamatii.javarushexc.javacore.L02.lesson_12;

//Сделать класс Pegasus (пегас) на основе класса Horse (лошадь) и интерфейса CanFly (летать).

public class L2_12_12_Interface_Inheritance {
    public static void main(String[] args) {
        Pegasus horse = new Pegasus();
        
        horse.run();
    }

    public static interface CanFly {
        public void fly();
    }

    public static class Horse {
        public void run() {

        }
    }

    public static class Pegasus extends Horse implements CanFly{

		@Override
		public void fly() {
			
		}
    }  
}

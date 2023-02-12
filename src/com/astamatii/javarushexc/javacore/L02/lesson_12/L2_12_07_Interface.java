package com.astamatii.javarushexc.javacore.L02.lesson_12;

//Есть интерфейсы CanFly (летать), CanSwim (плавать), CanRun (бегать).
//Добавь эти интерфейсы классам Duck (утка), Penguin (пингвин), Toad (жаба)

public class L2_12_07_Interface {
    public static void main(String[] args) {

    }

    public interface CanFly {
        public void fly();
    }

    public interface CanRun {
        public void run();
    }

    public interface CanSwim {
        public void swim();
    }

    public class Duck implements CanSwim, CanRun, CanFly{

		@Override
		public void fly() {
			
		}

		@Override
		public void run() {
			
		}

		@Override
		public void swim() {
			
		}

    }

    public class Penguin implements CanSwim, CanRun{

		@Override
		public void run() {
			
		}

		@Override
		public void swim() {
			
		}

    }

    public class Toad implements CanSwim{

		@Override
		public void swim() {
			
		}
    }  
}

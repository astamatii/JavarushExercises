package com.astamatii.javarushexc.javacore.L2.lesson_9;

//Есть public интерфейсы CanFly (летать), CanMove (передвигаться), CanEat (есть).
//Добавь эти интерфейсы классам Dog (собака), Car (автомобиль), Duck (утка), Airplane (самолет).

public class L2_9_Interface_3 {

	public static void main(String[] args) {

	}
	
    public interface CanFly {
        public void fly();
    }

    public interface CanMove {
        public void move();
    }

    public interface CanEat {
        public void eat();
    }

    public class Dog implements CanMove, CanEat {

		@Override
		public void eat() {
			
		}

		@Override
		public void move() {
			
		}
    }

    public class Duck implements CanFly, CanMove, CanEat {

		@Override
		public void eat() {
			
		}

		@Override
		public void move() {
			
		}

		@Override
		public void fly() {
			
		}
    }

    public class Car implements CanMove {

		@Override
		public void move() {
			
		}
    }

    public class Airplane implements CanFly, CanMove {

		@Override
		public void move() {
			
		}

		@Override
		public void fly() {
			
		}
    }
}

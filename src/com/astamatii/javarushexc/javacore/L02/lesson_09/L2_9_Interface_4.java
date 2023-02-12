package com.astamatii.javarushexc.javacore.L02.lesson_09;

//Есть public интерфейсы CanFly (летать), CanRun (бежать/ездить), CanSwim (плавать).
//Добавь эти интерфейсы классам Human (человек), Duck (утка), Penguin (пингвин), Airplane (самолет), 
// и не забудь про реализацию методов интерфейсов (в методах ничего делать не нужно).

public class L2_9_Interface_4 {

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


    public class Human implements CanRun, CanSwim {

		@Override
		public void swim() {
			
		}

		@Override
		public void run() {
			
		}

    }

    public class Duck implements CanFly, CanRun, CanSwim {

		@Override
		public void swim() {
			
		}

		@Override
		public void run() {
			
		}

		@Override
		public void fly() {
			
		}

    }

    public class Penguin implements CanRun, CanSwim {

		@Override
		public void swim() {
			
		}

		@Override
		public void run() {
			
		}

    }

    public class Airplane implements CanFly {

		@Override
		public void fly() {
			
		}

    }     

}

package com.astamatii.javarushexc.javacore.L5.lesson_12;

//Найди логическую ошибку: утка (Duck) должна корректно реализовывать интерфейс CanMove.
//Исправь ошибку. Результат вывода в консоль должен быть таким:
//Flying
//Moving

public class L5_12_OOP_5 {
    public static void main(String[] args) {
        Duck duck = new Duck();
        Util.fly(duck);
        Util.move(duck);
    }

    public static class Duck extends Util implements CanFly, CanMove { //added > extends Util
        @Override
        public void doAction() {
            System.out.println("Flying");
        }

		@Override
		public void doAnotherAction() {
			System.out.println("Moving");			
		}
    }

    public static class Util {
        static void fly(CanFly animal) {
            animal.doAction();
        }

        static void move(CanMove animal) {
            animal.doAnotherAction(); //doAction() ->> doAnotherAction()
        }
    }

    public static interface CanFly {
        void doAction();
    }

    public static interface CanMove {
        void doAnotherAction();
    }  
}

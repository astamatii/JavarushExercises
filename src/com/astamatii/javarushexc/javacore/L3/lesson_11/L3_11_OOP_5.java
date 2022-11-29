package com.astamatii.javarushexc.javacore.L3.lesson_11;

//В этой задаче тебе нужно:
//Реализовать интерфейс DBObject в классе User.
//Реализовать метод initializeIdAndName так, 
// чтобы программа работала и выводила на экран: "The user's name is Neo, id = 1".
//Метод toString и метод main менять нельзя.
//Подумать, что должен возвращать метод initializeIdAndName в классе User.
//Обрати внимание: методы toString() и main() менять нельзя.

public class L3_11_OOP_5 {
    public static void main(String[] args) throws Exception {
        System.out.println(Matrix.NEO);
    }

    static class Matrix {
        public static DBObject NEO = new User().initializeIdAndName(1, "Neo");
    }

    interface DBObject {
        DBObject initializeIdAndName(long id, String name);
    }

    static class User implements DBObject{
        long id;
        String name;

        @Override
        public String toString() {
            return String.format("The user's name is %s, id = %d", name, id);
        }

		@Override
		public DBObject initializeIdAndName(long id, String name) {
			this.id = id;
			this.name = name;
			return this;
		}
    }
}
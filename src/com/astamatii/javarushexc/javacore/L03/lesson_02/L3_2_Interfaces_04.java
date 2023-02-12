package com.astamatii.javarushexc.javacore.L03.lesson_02;

//Создай класс Screen и реализуй в нем интерфейсы Selectable и Updatable. Не забудь реализовать методы!

public class L3_2_Interfaces_04 {
    public static void main(String[] args) throws Exception {
    }

    interface Selectable {
        void onSelect();
    }

    interface Updatable {
        void refresh();
    }

    //напишите тут ваш класс
    public class Screen implements Selectable, Updatable {

		@Override
		public void refresh() {
			
		}

		@Override
		public void onSelect() {
			
		}    	
    }
}

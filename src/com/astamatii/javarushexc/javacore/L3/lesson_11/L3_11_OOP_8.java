package com.astamatii.javarushexc.javacore.L3.lesson_11;

//Реализуй интерфейс Updatable в классе Screen.

public class L3_11_OOP_8 {
    public static void main(String[] args) throws Exception {
    }

    interface Selectable {
        void onSelect();
    }

    interface Updatable extends Selectable {
        void refresh();
    }

    class Screen implements Updatable{

		@Override
		public void onSelect() {
			
		}

		@Override
		public void refresh() {
			
		}

    }     
}

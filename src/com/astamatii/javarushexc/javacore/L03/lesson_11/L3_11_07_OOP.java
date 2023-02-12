package com.astamatii.javarushexc.javacore.L03.lesson_11;

//Создай класс StringObject и реализуй в нем интерфейс SimpleObject с параметром типа String.
//Программа должна компилироваться.

public class L3_11_07_OOP {
    public static void main(String[] args) throws Exception {
        SimpleObject<String> stringObject = new StringObject();
        
    }

    interface SimpleObject<T> {
        SimpleObject<T> getInstance();
    }      
    
    static class StringObject implements SimpleObject<String>{

		@Override
		public SimpleObject<String> getInstance() {
			return null;
		}
    }
    
}

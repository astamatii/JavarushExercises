package com.astamatii.javarushexc.javacore.L03.lesson_02;

//В классе StringObject реализуй интерфейс SimpleObject с параметром типа String.

public class L3_2_Interfaces_07 {
    public static void main(String[] args) throws Exception {
    }

    interface SimpleObject<T> {
        SimpleObject<T> getInstance();
    }

    class StringObject implements SimpleObject<String> //допишите здесь ваш код
    {

		@Override
		public SimpleObject<String> getInstance() {
			return this;
		}
    }   
}

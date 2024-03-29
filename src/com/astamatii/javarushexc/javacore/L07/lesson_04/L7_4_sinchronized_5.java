package com.astamatii.javarushexc.javacore.L07.lesson_04;

//Singleton паттерн - синхронизация в методе.
//Класс IMF - это Международный Валютный Фонд.
//Внутри метода getFund создай синхронизированный блок.
//Внутри синхронизированного блока инициализируй поле imf так, чтобы метод getFund всегда возвращал один и тот же объект.

public class L7_4_sinchronized_5 {
	public static void main(String[] args) {
        IMF fund = IMF.getFund();
        IMF anotherFund = IMF.getFund();
        System.out.println(fund == anotherFund);
    } 
}

class IMF {

    private static IMF imf;

    public static IMF getFund() {
        //add your code here - добавь код тут
    	synchronized(IMF.class) {
    		if(imf == null)
    			imf = new IMF();
    	}    	
        return imf;
    }

    private IMF() {
    }
}  
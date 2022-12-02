package com.astamatii.javarushexc.javacore.L4.lesson_8;

//Расширь функциональность программы, которая позволит производить манипуляции с валютами.
//1. В существующем абстрактном классе Money создай приватное поле amount типа double.
//2. Создай публичный геттер для поля amount(public double getAmount()), 
// 	чтобы к этому полю можно было получить доступ извне класса Money.
//3. В отдельных файлах создай классы Hryvnia, Ruble и USD, 
//	которые будут являться потомками класса Money.
//4. В классах Hryvnia, Ruble и USD реализуй метод getCurrencyName() 
// 	который будет возвращать название соответствующей валюты (строку) 
//	в виде аббревиатуры (USD, UAH, RUB).
//5. В классах Hryvnia, Ruble и USD реализуй публичный (public) конструктор, 
// 	который принимает один параметр 
//	и вызывает конструктор базового класса (super) с этим параметром.
//6. Заполни список allMoney объектами всех возможных в рамках условия задачи 
// 	и функциональности программы валют.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class L4_6_OOP_9_AbstractClass {
    public static void main(String[] args) {
        Person ivan = new Person("Иван");
        for (Money money : ivan.getAllMoney()) {
            System.out.println(ivan.name + " имеет заначку в размере " + money.getAmount() + " " + money.getCurrencyName());
        }
    }

    static class Person {
        public String name;

        Person(String name) {
            this.name = name;
            this.allMoney = new ArrayList<Money>();
            //напишите тут ваш код
            Collections.addAll(this.allMoney, new USD(10), new Hryvnia(20), new Ruble(30));
        }

        private List<Money> allMoney;

        public List<Money> getAllMoney() {
            return allMoney;
        }
    } 
}

abstract class Money {
	private double amount = 0; 
	
    public Money(double amount) {
    	this.amount = amount;
    }

    public double getAmount() {
    	return amount;
    }

    public abstract String getCurrencyName();
}

class USD extends Money {

	public USD(double amount) {
		super(amount);
	}

	@Override
	public String getCurrencyName() {
		return "USD";
	}
	
}

class Hryvnia extends Money {
	
	public Hryvnia(double amount) {
		super(amount);
	}

	@Override
	public String getCurrencyName() {
		return "UAH";
	}
	
}

class Ruble extends Money {

	public Ruble(double amount) {
		super(amount);
	}

	@Override
	public String getCurrencyName() {
		return "RUB";
	}
	
}
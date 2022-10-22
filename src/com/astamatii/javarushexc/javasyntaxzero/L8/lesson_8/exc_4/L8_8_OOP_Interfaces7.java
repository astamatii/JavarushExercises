package com.astamatii.javarushexc.javasyntaxzero.L8.lesson_8.exc_4;

//Классы Eagle (Орел), Raven (Ворон) и Aircraft (Самолет) имплементируют интерфейс Flyable, 
// который содержит дефолтную реализацию метода int getMaxSpeed() и возвращает значение 80.
//Такая реализация неправильная, так как реальная максимальная скорость 
// Орла — 180 км/ч, Ворона — 48, а самолета — 1200.
//
//Тебе нужно убрать дефолтную реализацию метода getMaxSpeed() из интерфейса Flyable (сам метод нужно оставить) 
// и имплементировать его в каждом из классов.
//Для каждого класса укажи правильное значение максимальной скорости.

public class L8_8_OOP_Interfaces7 {

}

interface Flyable {
	int getMaxSpeed();
}

class Aircraft implements Flyable {
	@Override
	public int getMaxSpeed() {
		return 1200;
	}
}

class Eagle implements Flyable {
	@Override
	public int getMaxSpeed() {
		return 180;
	}
}

class Raven implements Flyable {
	@Override
	public int getMaxSpeed() {
		return 48;
	}
}
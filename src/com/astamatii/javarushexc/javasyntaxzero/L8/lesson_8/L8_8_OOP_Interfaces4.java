package com.astamatii.javarushexc.javasyntaxzero.L8.lesson_8;

//Существуют 2 интерфейса — Swimmable и Flyable, указывающие на то, что объект умеет плавать и/или летать соответственно.
//Расставь эти интерфейсы для классов Zeppelin (Дирижабль), Ship (Корабль) 
// и JamesBondCar (Машина Джеймса Бонда) в соответствии с их возможностями.
//
//Помни: машина Джеймса Бонда умеет все.

public class L8_8_OOP_Interfaces4 {

}

interface Swimmable {
	
}

interface Flyable {
	
}

class Ship implements Swimmable{
	
}

class JamesBondCar implements Swimmable, Flyable{
	
}

class Zeppelin implements Flyable{
	
}
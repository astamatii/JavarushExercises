package com.astamatii.javarushexc.javasyntaxzero.level_8.lesson_4;

import java.util.ArrayList;

//Все члены экипажа космического корабля находятся на борту, корабль успешно вышел в открытый космос.
//Команде пора приступить к выполнению своих обязанностей:
//Людям — пилотировать корабль, Собаке — заниматься навигацией, а Коту — исследовать открытый космос.
//
//Распредели обязанности членов экипажа в методе runWorkingProcess().
//
//Для этого достань из списка astronauts всех людей (ты знаешь, под какими индексами они находятся) 
//и передай их в качестве аргументов методу pilot(Human human), собаку передай в метод createDirection(Dog dog), 
//а кота — в метод research(Cat cat).
//
//Другие методы не изменяй.
//
//Подсказка:
//Список astronauts содержит объекты типа Astronaut. 
//Чтобы вызвать методы pilot(), createDirection() и research(), сначала объект Astronaut нужно привести к правильному типу.

public class L8_4_OOP_Polymorphism2 {

	public static ArrayList<Astronaut> astronauts = new ArrayList<>();

	public static void main(String[] args) {
		createCrew();
		printCrewInfo();
		runWorkingProcess();
	}

	public static void runWorkingProcess() {
		// напишите тут ваш код
		for (Astronaut astronaut : astronauts) {
			if (astronaut instanceof Human)
				pilot((Human) astronaut);
			if (astronaut instanceof Cat)
				research((Cat) astronaut);
			if (astronaut instanceof Dog)
				createDirection((Dog) astronaut);
		}
	}

	public static void pilot(Human human) {
		System.out.println("Член экипажа " + human.getInfo() + " пилотирует корабль.");
	}

	public static void createDirection(Dog dog) {
		System.out.println("Член экипажа " + dog.getInfo() + " занимается созданием навигационного маршрута.");
	}

	public static void research(Cat cat) {
		System.out.println("Член экипажа " + cat.getInfo() + " исследует ближайшие планеты.");
	}

	public static void createCrew() {
		astronauts.add(new Human());
		astronauts.add(new Human());
		astronauts.add(new Dog());
		astronauts.add(new Cat());
	}

	public static void printCrewInfo() { // Astronaut, Human, Cat, Dog classes are defined in L8_OOP_Polymorphism.java
		System.out.println("На борт погружены члены экипажа: ");
		for (Astronaut astronaut : astronauts) {
			System.out.println(astronaut.getInfo());
		}
	}

}

//Same answer is for the exercise below:

//Сделаем наш предыдущий пример более правильным и универсальным.
//Порядок, в котором добавляются астронавты в список astronauts, не всегда будет известен. 
//Чтобы правильно распределить задачи членам экипажа, необходимо определить, кем является астронавт. 
//Для этого в методе runWorkingProcess() перебери всех астронавтов в цикле, используя оператор instanceof определи, 
//кем является астронавт и передай его в качестве аргумента соответствующему методу:
//Human — в метод pilot(Human human);
//Dog — в метод createDirection(Dog dog);
//Cat — в метод research(Cat cat).
//
//Метод runWorkingProcess() должен работать корректно независимо от количества астронавтов и порядка их добавления в astronauts.


package com.astamatii.javarushexc.javasyntaxzero.L8.lesson_4;

//Перед тобой 4 класса животных — Cow, Lion, Wolf и Elephant. 
//Корова (Cow) и слон (Elephant) являются травоядными, поэтому они наследуются от класса Herbivore.
//А лев (Lion) и волк (Wolf) являются хищниками, поэтому они наследуются от класса Predator. 
//В свою очередь классы Herbivore и Predator унаследованы от Animal.
//В классе Solution реализуй метод printRation(Animal animal), 
// который должен выводить в консоли рацион переданного животного:
//
// 1. если животное хищник, нужно вывести "Любит мясо";
// 2. если животное травоядное, вывести "Любит траву".

public class L8_4_OOP_Polymorphism3 {

	public static void main(String[] args) {
		printRation(new Cow());
		printRation(new Lion());
		printRation(new Elephant());
		printRation(new Wolf());
	}

	public static void printRation(Animal animal) {
		String herbivore = "Любит траву";
		String predator = "Любит мясо";

		// напишите тут ваш код
		
		if(animal instanceof Herbivore)
			System.out.println(herbivore);
		if(animal instanceof Predator)
			System.out.println(predator);
	}

}

class Animal {
}

class Herbivore extends Animal {
}

class Elephant extends Herbivore {
}

class Cow extends Herbivore {
}

class Predator extends Animal {
}

class Lion extends Predator {
}

class Wolf extends Predator {
}

package com.astamatii.javarushexc.javacore.L04.lesson_08;

//Давай напишем программу, которая поможет нам определить, какое вино пить по какому случаю.
//Для этого нужно:
//1. Создать абстрактный класс Drink с реализованным методом public void taste(), 
// 	который выводит в консоль "Вкусно".
//2. Создать класс Wine, наследуемый от Drink, с реализованным методом public String getHolidayName(), 
// 	который возвращает строку "День Рождения".
//3. Создать класс SparklingWine, наследуемый от Wine, 
// 	с реализованным методом public String getHolidayName(), который возвращает строку "Новый Год".
//4. Написать реализацию методов getDeliciousDrink, getWine, getSparklingWine.
//5. Все классы должны находиться в отдельных файлах.

public class L4_6_OOP_02_Inheritance {
    public static void main(String[] args) {
        getDeliciousDrink().taste();
        System.out.println(getWine().getHolidayName());
        System.out.println(getSparklingWine().getHolidayName());
        System.out.println(getWine().getHolidayName());
    }

    public static Drink getDeliciousDrink() {
    	return new Wine();
    }

    public static Wine getWine() {
    	return new Wine();
    }

    public static Wine getSparklingWine() {
    	return new SparklingWine();
    }  
}

abstract class Drink {
	public void taste() {
		System.out.println("Вкусно");
	}
	
	
}

class Wine extends Drink {
	public String getHolidayName() {
		return "День Рождения";
	}
}

class SparklingWine extends Wine {
	@Override
	public String getHolidayName() {
		return "Новый Год";
	}
}
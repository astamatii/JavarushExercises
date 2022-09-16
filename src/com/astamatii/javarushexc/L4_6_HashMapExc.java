package com.astamatii.javarushexc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class L4_6_HashMapExc {

	public static HashMap<String, Double> grades = new HashMap<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addStudents();
		System.out.println(grades);
		System.out.println("_________________________\n");
		printStudents();
		System.out.println("\nСредний балл группы: " + getAverageMark());
		System.out.println("_________________________\nStudentsInfo:");
		printStudentsInfo();
		System.out.println("_________________________\n");
		System.out.println(getProgrammingLanguages());
		System.out.println("_________________________\n");

		// Extracting Set of the Keys(because they all must be distinct), and ArrayList
		// of values(because there could be equal values)
		HashMap<Integer, String> passportsAndNames = new HashMap<>();

		passportsAndNames.put(212133, "Лидия Аркадьевна Бубликова");
		passportsAndNames.put(162348, "Иван Михайлович Серебряков");
		passportsAndNames.put(8082771, "Дональд Джон Трамп");

		Set<Integer> keys = passportsAndNames.keySet();
		System.out.println("Ключи: " + keys);

		ArrayList<String> values = new ArrayList<>(passportsAndNames.values());
		System.out.println("Значения: " + values);

		System.out.println();
		HashMap<Integer, String> passportsAndNames2 = new HashMap<>();
		passportsAndNames2.put(917352, "Алексей Андреевич Ермаков");
		passportsAndNames2.put(925648, "Максим Олегович Архаров");

		passportsAndNames.putAll(passportsAndNames2); // Supply current hashmap with another
		System.out.println(passportsAndNames);

		System.out.println();
		String lidiaName = passportsAndNames.get(212133); // Get Value by Key!
		System.out.println(lidiaName);

		System.out.println("Будет удален " + passportsAndNames.remove(162348)); // Remove one element
		System.out.println("Смена значения для " + passportsAndNames.put(925648, "Александр Сергейевич Пупкин")); // Only
																													// change
																													// the
																													// value
		System.out.println(passportsAndNames);

		System.out.println();
		System.out.println("Содержит ли ключ 11111: " + passportsAndNames.containsKey(11111)); // false
		System.out.println(
				"Содержит ли значение Дональд Джон Трамп: " + passportsAndNames.containsValue("Дональд Джон Трамп")); // true
		System.out.println("Пустой ли данный HashMap: " + passportsAndNames.isEmpty()); // false
		System.out.println("Размер данного HashMap: " + passportsAndNames.size()); // size = 5
		System.out.println("Удаляем все НАХУЙ!");
		passportsAndNames.clear(); // clearing all HashMap
		System.out.println("Состав данного HashMap после полного стирания: " + passportsAndNames); // {} Nothing

	}

	public static void addStudents() {
		grades.put("Давыдов Олег", 4.3d);
		grades.put("Шульга Николай", 4.1d);
		grades.put("Колос Василий", 4.9d);
		grades.put("Шевченко Тарас", 3.7d);
		grades.put("Марчук Любослав", 3.2d);
	}

	public static void printStudents() {
		// напишите тут ваш код
		for (String student : grades.keySet())
			System.out.println(student);
	}

	public static Double getAverageMark() {
		// напишите тут ваш код
		Double averageMark = 0.;
		for (Double mark : grades.values()) {
			averageMark += mark;
		}

		return averageMark / grades.size();
	}

	public static void printStudentsInfo() {
		// напишите тут ваш код
		for (Map.Entry<String, Double> grade : grades.entrySet()) {
			System.out.println(grade.getKey() + " : " + grade.getValue());
		}
	}

	public static HashMap<Integer, String> getProgrammingLanguages() {
		// напишите тут ваш код
		HashMap<Integer, String> programmingLanguages = new HashMap<>();
		programmingLanguages.put(0, "Java");
		programmingLanguages.put(1, "Kotlin");
		programmingLanguages.put(2, "Go");
		programmingLanguages.put(3, "Javascript");
		programmingLanguages.put(4, "Typescript");
		programmingLanguages.put(5, "Python");
		programmingLanguages.put(6, "PHP");
		programmingLanguages.put(7, "C++");
		return programmingLanguages;
	}
}

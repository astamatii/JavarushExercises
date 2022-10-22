package com.astamatii.javarushexc.javasyntaxzero.L4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class L4_9_Switch {

	public static ArrayList<String> planets = new ArrayList<>();

	public static void main(String[] args) {
		Collections.addAll(planets, "Sun", "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus",
				"Neptune");
		int planet = 8;
		System.out.println(planets.get(planet) + " atmosphere is made of:");
		for (String atm : getPlanetAtmosphere(planet)) {
			System.out.println(atm);
		}
		System.out.println();
		System.out.println(getMonthByIndex(4));
		System.out.println(getMonthByIndex(8));
		System.out.println(getMonthByIndex(12));
		System.out.println();
		System.out.println(getTranslationForDayOfWeek("Вторник"));
		System.out.println(getTranslationForDayOfWeek("Пятница"));
		System.out.println(getTranslationForDayOfWeek("Высплюсенье"));
		System.out.println();
		System.out.println(getShapeNameByCountOfCorners(3));
		System.out.println(getShapeNameByCountOfCorners(5));
		System.out.println(getShapeNameByCountOfCorners(10));
		System.out.println();
		System.out.println(getValue(1));

	}

	public static int getValue(int count) {

		// On Java 13 version:
		int value = switch (count) {
		case 1:
			yield 12;
		case 2:
			yield 32;
		case 3:
			yield 52;
		default:
			yield 0;
		};

		// On Java 12 version:
//		int value = switch (count) {
//		  case 1:
//		     break 12;
//		  case 2:
//		     break 32;
//		  case 3:
//		     break 52;
//		  default:
//		     break 0;
//		};

		return value;
	}

	// Not recommended version, just for showing
	public static List<String> getPlanetAtmosphere(int seqNumberFromSun) {
		List<String> result = new ArrayList<>();
		switch (seqNumberFromSun) {
		case 1:
			result.add("Нет атмосферы");
			break;
		case 3:
			result.add("Азот");
			result.add("Кислород");
		case 2:
		case 4:
			result.add("Углекислый газ");
			break;
		case 7, 8:
			result.add("Метан");
		case 5, 6:
			result.add("Водород");
			result.add("Гелий");
		}
		return result;
	}

	public static String getShapeNameByCountOfCorners(int countOfCorner) { // switch as expression
		return switch (countOfCorner) {
		case 3 -> "Треугольник";
		case 4 -> "Четырехугольник";
		case 5 -> "Пятиугольник";
		case 6 -> "Шестиугольник";
		case 7 -> "Семиугольник";
		case 8 -> "Восьмиугольник";
		case 9, 10 -> "Многоугольник";
		default -> "Другая фигура";
		};
	}

	public static String getTranslationForDayOfWeek(String ru) {
		String en;

		if (ru.toLowerCase().equals("понедельник"))
			en = "Monday";
		else if (ru.toLowerCase().equals("вторник"))
			en = "Tuesday";
		else if (ru.toLowerCase().equals("среда"))
			en = "Wednesday";
		else if (ru.toLowerCase().equals("четверг"))
			en = "Thursday";
		else if (ru.toLowerCase().equals("пятница"))
			en = "Friday";
		else if (ru.toLowerCase().equals("суббота"))
			en = "Saturday";
		else if (ru.toLowerCase().equals("воскресенье"))
			en = "Sunday";
		else
			en = "Недействительный день недели";

		return en;
	}

	public static String getMonthByIndex(int monthIndex) {
		String monthString;

		switch (monthIndex) {
		case 1:
			monthString = "Январь";
			break;
		case 2:
			monthString = "Февраль";
			break;
		case 3:
			monthString = "Март";
			break;
		case 4:
			monthString = "Апрель";
			break;
		case 5:
			monthString = "Май";
			break;
		case 6:
			monthString = "Июнь";
			break;
		case 7:
			monthString = "Июль";
			break;
		case 8:
			monthString = "Август";
			break;
		case 9:
			monthString = "Сентябрь";
			break;
		case 10:
			monthString = "Октябрь";
			break;
		case 11:
			monthString = "Ноябрь";
			break;
		case 12:
			monthString = "Декабрь";
			break;
		default:
			monthString = "Недействительный месяц";
			break;
		}

		return monthString;
	}

}

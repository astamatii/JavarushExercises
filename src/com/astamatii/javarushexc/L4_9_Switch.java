package com.astamatii.javarushexc;

public class L4_9_Switch {

	public static void main(String[] args) {
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
		System.out.println(getShapeNameByCountOfCorners(1));
	}

	public static String getShapeNameByCountOfCorners(int countOfCorner) { //switch as expression
		return switch (countOfCorner) {
		case 3 -> "Треугольник";
		case 4 -> "Четырехугольник";
		case 5 -> "Пятиугольник";
		case 6 -> "Шестиугольник";
		case 7 -> "Семиугольник";
		case 8 -> "Восьмиугольник";
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

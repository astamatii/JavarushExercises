package com.astamatii.javarushexc.javasyntaxzero.L4;

import java.util.Arrays;

public class L4_8_EnumExtendedClass {

	public static void main(String[] args) {
		System.out.println(DayOfWeek.SUNDAY);
		System.out.println(DayOfWeek.SUNDAY.ordinal());
		DayOfWeek direct = DayOfWeek.SUNDAY;
		DayOfWeek value = DayOfWeek.valueOf("SUNDAY");
		System.out.println(direct.hashCode());
		System.out.println(value.hashCode());
		System.out.println(direct.hashCode() == value.hashCode());

		System.out.println("\n" + Arrays.toString(DayOfWeek.values()));

		System.out.println("\nWeekend:");
		for (DayOfWeek day : DayOfWeek.getWeekend()) {
			System.out.println(day);
		}

		System.out.println("\nWeekdays:");
		for (DayOfWeek day : DayOfWeek.getWeekdays()) {
			System.out.println(day);
		}

	}

	public enum DayOfWeek {

		SUNDAY("Воскресенье", 7), MONDAY("Понедельник", 1), TUESDAY("Вторник", 2), WEDNESDAY("Среда", 3),
		THURSDAY("Четверг", 4), FRIDAY("Пятница", 5), SATURDAY("Суббота", 6);

		private String day;
		private int dayNumber;

		private static final DayOfWeek[] weekend = { SATURDAY, SUNDAY };
		private static final DayOfWeek[] weekdays = { MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY };

		DayOfWeek(String day, int dayNumber) {
			this.day = day;
			this.dayNumber = dayNumber;
		}

		public static DayOfWeek[] getWeekend() {
			return weekend;
			// OR
			// return new DayOfWeek[] {SATURDAY, SUNDAY};
		}

		public static DayOfWeek[] getWeekdays() {
			return weekdays;
		}

		public String getDay() {
			return day;
		}

		@Override
		public String toString() {
			return "DayOfWeek{" + "day='" + day + '\'' + ", dayNumber=" + dayNumber + '}';
		}
	}
}

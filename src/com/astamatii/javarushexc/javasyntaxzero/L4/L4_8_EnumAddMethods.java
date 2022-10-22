package com.astamatii.javarushexc.javasyntaxzero.L4;

public class L4_8_EnumAddMethods {

	public static void main(String[] args) {
		System.out.println(getNextMonth(Month.JANUARY));
		System.out.println(getNextMonth(Month.JULY));
		System.out.println(getNextMonth(Month.DECEMBER));
		System.out.println();

		for (Month month : Month.getWinterMonths())
			System.out.println(month);
	}

	public static Month getNextMonth(Month month) {
		// напишите тут ваш код
		if (month.ordinal() == Month.values().length - 1) {
			return Month.values()[0];
		} else
			return Month.values()[month.ordinal() + 1];
	}
}

enum Month {
	JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER;

	private static final Month[] winter = { DECEMBER, JANUARY, FEBRUARY };
	private static final Month[] spring = { MARCH, APRIL, MAY };
	private static final Month[] summer = { JUNE, JULY, AUGUST };
	private static final Month[] autumn = { SEPTEMBER, OCTOBER, NOVEMBER };

	public static Month[] getWinterMonths() {

		return winter;
	}

	public static Month[] getSpringMonths() {

		return spring;
	}

	public static Month[] getSummerMonths() {

		return summer;
	}

	public static Month[] getAutumnMonths() {

		return autumn;
	}
}

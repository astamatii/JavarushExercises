package com.astamatii.javarushexc.javasyntaxzero.L7;

import java.util.Calendar;
import java.util.GregorianCalendar;

//Цикл while должен был завершиться за 31 итерацию, но почему-то зациклился. Найди и исправь ошибку.

public class L7_3_Calendar_BugFixing {

	public static void main(String[] args) {
        Calendar start = new GregorianCalendar(2014, Calendar.JANUARY, 2);
        Calendar end = new GregorianCalendar(2014, Calendar.FEBRUARY, 2);

        System.out.print("Старт");
        while (start.before(end)) {
            start.add(Calendar.DATE, 1); //Error in roll(Calendar.DATE, 1);
            System.out.print(".");
        }
        System.out.print("Финиш");
    }        

}

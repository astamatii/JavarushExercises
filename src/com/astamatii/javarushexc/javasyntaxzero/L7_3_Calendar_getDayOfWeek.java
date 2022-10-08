package com.astamatii.javarushexc.javasyntaxzero;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class L7_3_Calendar_getDayOfWeek {

    static Calendar birthDate = new GregorianCalendar(2000, 06, 20);
    
    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Calendar calendar) {
        //напишите тут ваш код
        return new SimpleDateFormat("EEEE", new Locale("ru")).format(calendar.getTime());
    }
	
}

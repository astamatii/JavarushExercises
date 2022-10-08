package com.astamatii.javarushexc.javasyntaxzero;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

// Проинициализируй переменную birthDate объектом Date с датой своего рождения.
// Реализуй метод getDayOfWeek(Date date), чтобы он возвращал русское название дня недели аргумента date.

public class L7_2_Date_getDayOfWeek {

    static Date birthDate = new Date(1231231231L);
    static Date birthDate2 = new Date(120, Calendar.MARCH, 17); // Javarush interpretation 
    
    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }   

    static String getDayOfWeek(Date date) {
        //напишите тут ваш код
    	try {
			SimpleDateFormat formatter = new SimpleDateFormat("EEEE", new Locale("ru"));
			
			return formatter.format(date);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
    }
	
}

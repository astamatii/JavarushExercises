package com.astamatii.javarushexc.javasyntaxzero.L7;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

//В методе main выведи на экран переменную zonedDateTime в таком виде:
//4 9.3.19 06:03:07.319180500 Europe/Kiev
//
//Где:
//
//1. 4 — номер дня недели, т.е. четверг;
//2. 9 — день месяца;
//3. 3 — месяц;
//4. 19 — год;
//5. 06 — часы;
//6. 03 — минуты;
//7. 07 — секунды;
//8. 319180500 — наносекунды;
//9. Europe/Kiev — временная зона.

public class L7_8_DateTimeFormatter_ZonedDateTime {

    static ZonedDateTime zonedDateTime = ZonedDateTime.now();

    public static void main(String[] args) {
        //напишите тут ваш код
    	
    	System.out.println(zonedDateTime.format(DateTimeFormatter.ofPattern("e d.M.yy HH:mm:ss.n VV")));
    	
    	// Javarush answer:
//        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("e d.M.yy HH:mm:ss.n VV");
//        String text = dateTimeFormatter.format(zonedDateTime);
//        System.out.println(text);
    }                  
	
}

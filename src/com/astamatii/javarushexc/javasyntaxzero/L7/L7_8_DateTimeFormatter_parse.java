package com.astamatii.javarushexc.javasyntaxzero.L7;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

//Инициализируй статическую переменную dateTimeFormatter. 
//Подумай, какой шаблон ей задать, чтобы можно было распарсить строку timeString.
//В методе main создай объект LocalDateTime, используя строку timeString и твой шаблон dateTimeFormatter.

public class L7_8_DateTimeFormatter_parse {

    static DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss dd/MM/y");
    static String timeString = "13:30:45 23/02/2019";

    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.parse(timeString, dateTimeFormatter);

        System.out.println(dateTime);
    }                                  
	
}

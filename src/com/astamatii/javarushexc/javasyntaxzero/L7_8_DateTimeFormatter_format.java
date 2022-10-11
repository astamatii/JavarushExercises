package com.astamatii.javarushexc.javasyntaxzero;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// В методе main выведи на экран переменную localDateTime в таком виде:
// 19.03.2020г. 5ч.4мин

public class L7_8_DateTimeFormatter_format {

    static LocalDateTime localDateTime = LocalDateTime.now();

    public static void main(String[] args) {
        //напишите тут ваш код
    	
    	System.out.println(DateTimeFormatter.ofPattern("dd.MM.yг. Hч.mмин").format(localDateTime));
    }
	
}

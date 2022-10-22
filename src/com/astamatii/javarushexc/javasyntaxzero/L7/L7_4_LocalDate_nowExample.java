package com.astamatii.javarushexc.javasyntaxzero.L7;

import java.time.LocalDate;
import java.util.Date;

//В классе Solution реализуй 4 метода:
//
//метод nowExample должен вернуть текущую дату;
//остальные методы должны вернуть дату 12 сентября 2020 года, но разными способами.

public class L7_4_LocalDate_nowExample {
   
	public static void main(String[] args) {
        System.out.println(nowExample());
        System.out.println(ofExample());
        System.out.println(ofYearDayExample());
        System.out.println(ofEpochDayExample());
    }

    static LocalDate nowExample() {
        //напишите тут ваш код

        return LocalDate.now();
    }

    static LocalDate ofExample() {
        //напишите тут ваш код

        return LocalDate.of(2020, 9, 12);
    }

    static LocalDate ofYearDayExample() {
        //напишите тут ваш код

        return LocalDate.ofYearDay(2020, LocalDate.of(2020, 9, 12).getDayOfYear());
    }

    static LocalDate ofEpochDayExample() {
        //напишите тут ваш код

        return LocalDate.ofEpochDay(new Date(120, 8, 12).getTime()/1000/3600/24);
    }
}        


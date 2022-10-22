package com.astamatii.javarushexc.javasyntaxzero.L7;

import java.time.LocalTime;

//Цикл while в методе main должен отработать ровно четыре раза, чтобы на экран вывелись 4 строки.
//Изменения можно вносить только в метод amazingMethod.

public class L7_5_LocalTime_amazingMethod {
	
    public static void main(String[] args) throws InterruptedException {
        LocalTime localTime = LocalTime.MIDNIGHT;
        LocalTime next = amazingMethod(localTime);
        while (next.isAfter(localTime)) {
            System.out.println(next);
            next = amazingMethod(next);
            Thread.sleep(500);
        }
        
    }

    static LocalTime amazingMethod(LocalTime base) {
        return base.plusHours(24/5).plusMinutes((long)(Math.ceil((24./5. - (24/5)) * 10)/10 * 60.)); // if it`s odd minutes will be calculated by that formula
    }    

}

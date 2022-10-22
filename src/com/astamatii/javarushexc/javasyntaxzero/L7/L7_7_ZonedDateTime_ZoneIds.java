package com.astamatii.javarushexc.javasyntaxzero.L7;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.TreeSet;

//Что общего у всех временных зон и Пекина?
//Правильно! Они позволят нам потренироваться в использовании классов ZoneId и ZonedDateTime :)
//
//Реализуй два метода:
//
//1. в методе getSortedZones верни множество TreeSet всех временных зон;
//2. в методе getBeijingTime верни текущую дату и время в Пекине (временная зона для него — "Asia/Shanghai").

public class L7_7_ZonedDateTime_ZoneIds {

    public static void main(String[] args) {
        TreeSet<String> sortedZones = getSortedZones();
        System.out.println(sortedZones.size());
        System.out.println(sortedZones.first());
        System.out.println(sortedZones.last());

        System.out.println(getBeijingDateTime());
    }

    static TreeSet<String> getSortedZones() {
        //напишите тут ваш код
    	
        return new TreeSet<String>(ZoneId.getAvailableZoneIds());
    }

    static ZonedDateTime getBeijingDateTime() {
        //напишите тут ваш код

        return ZonedDateTime.now(ZoneId.of("Asia/Shanghai"));
    }     
	
}

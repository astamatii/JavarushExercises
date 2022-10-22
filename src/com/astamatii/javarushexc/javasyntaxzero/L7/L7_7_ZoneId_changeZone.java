package com.astamatii.javarushexc.javasyntaxzero.L7;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

//Можно ли, зная время в одном часовом поясе, определить время в другом?
//Реши эту задачу в методе changeZone. Его параметры:
//
//1. fromTime — известное время;
//2. fromZone — временная зона, в которой известно время;
//3. toZone — временная зона, в которой нужно определить время.

public class L7_7_ZoneId_changeZone {

    public static void main(String[] args) {
        ZoneId zone1 = ZoneId.of("Zulu");
        ZoneId zone2 = ZoneId.of("Etc/GMT+8");
        System.out.println(ZonedDateTime.now(zone1));
        System.out.println(ZonedDateTime.now(zone2));

        LocalDateTime time = changeZone(LocalDateTime.of(2020, 3, 19, 1, 40), zone1, zone2);
        System.out.println(time);
    }

    static LocalDateTime changeZone(LocalDateTime fromDateTime, ZoneId fromZone, ZoneId toZone) {
        //напишите тут ваш код

        return ZonedDateTime.of(fromDateTime, fromZone).withZoneSameInstant(toZone).toLocalDateTime();
        
        // Javarush Answer:
//        ZonedDateTime fromZonedDateTime = fromDateTime.atZone(fromZone);
//        ZonedDateTime toZonedDateTime = fromZonedDateTime.withZoneSameInstant(toZone);
//        return toZonedDateTime.toLocalDateTime();

    }

	
}

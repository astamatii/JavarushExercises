package com.astamatii.javarushexc.javasyntaxzero;

import java.time.Instant;

//В классе Solution реализуй шесть методов:
//
//1. в методе plusMinutes нужно увеличить параметр instant на minutes минут и вернуть результат;
//2. в методе plusHours нужно увеличить параметр instant на hours часов и вернуть результат;
//3. в методе plusDays нужно увеличить параметр instant на days дней и вернуть результат;
//4. в методе minusMinutes нужно уменьшить параметр instant на minutes минут и вернуть результат;
//5. в методе minusHours нужно уменьшить параметр instant на hours часов и вернуть результат;
//6. в методе minusDays нужно уменьшить параметр instant на days дней и вернуть результат.

public class L7_6_Instant_Methods2 {

    public static void main(String[] args) {
        Instant instant = Instant.ofEpochSecond(10);
        System.out.println(instant);
        System.out.println(plusMinutes(instant, 2));
        System.out.println(plusHours(instant, 2));
        System.out.println(plusDays(instant, 2));
        System.out.println(minusMinutes(instant, 2));
        System.out.println(minusHours(instant, 2));
        System.out.println(minusDays(instant, 2));
    }

    static public Instant plusMinutes(Instant instant, long minutes) {
        //напишите тут ваш код

        return instant.plusSeconds(minutes * 60);
    }

    static public Instant plusHours(Instant instant, long hours) {
        //напишите тут ваш код

        return instant.plusSeconds(hours * 3600);
    }

    static public Instant plusDays(Instant instant, long days) {
        //напишите тут ваш код

        return instant.plusSeconds(days * 3600 * 24);
    }

    static public Instant minusMinutes(Instant instant, long minutes) {
        //напишите тут ваш код

        return instant.minusSeconds(minutes * 60);
    }

    static public Instant minusHours(Instant instant, long hours) {
        //напишите тут ваш код

    	return instant.minusSeconds(hours * 3600);
    }

    static public Instant minusDays(Instant instant, long days) {
        //напишите тут ваш код

    	return instant.minusSeconds(days * 3600 * 24);
    }     
	
}

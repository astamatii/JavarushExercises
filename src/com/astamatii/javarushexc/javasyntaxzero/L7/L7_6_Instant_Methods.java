package com.astamatii.javarushexc.javasyntaxzero.L7;

import java.time.Instant;

//В классе Solution реализуй три метода:
//
//1. в методе getMaxFromMilliseconds верни максимальный Instant, 
//	который можно получить с помощью метода ofEpochMilli(long milliseconds);
//2. в методе getMaxFromSeconds верни максимальный Instant, 
//	который можно получить с помощью метода ofEpochSecond(long seconds);
//3. в методе getMaxFromSecondsAndNanos верни максимальный Instant, 
//  который можно получить с помощью метода ofEpochSecond(long seconds, long nanos).

public class L7_6_Instant_Methods {

    public static void main(String[] args) {
        System.out.println(getMaxFromMilliseconds());
        System.out.println(getMaxFromSeconds());
        System.out.println(getMaxFromSecondsAndNanos());
    }

    static Instant getMaxFromMilliseconds() {
        //напишите тут ваш код

        return Instant.ofEpochMilli(Long.MAX_VALUE);
    }

    static Instant getMaxFromSeconds() {
        //напишите тут ваш код

        return Instant.ofEpochSecond(Instant.MAX.getEpochSecond());
    }

    static Instant getMaxFromSecondsAndNanos() {
        //напишите тут ваш код

        return Instant.ofEpochSecond(Instant.MAX.getEpochSecond(), Instant.MAX.getNano());
    }
	
}

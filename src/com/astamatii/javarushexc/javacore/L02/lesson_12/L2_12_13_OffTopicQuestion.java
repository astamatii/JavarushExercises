package com.astamatii.javarushexc.javacore.L02.lesson_12;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

//Напиши метод, который возвращает минимальное число в массиве и его позицию (индекс).

public class L2_12_13_OffTopicQuestion {
    public static void main(String[] args) throws Exception {
        int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};

        Pair<Integer, Integer> result = getMinimumAndIndex(data);

        System.out.println("The minimum is " + result.x);
        System.out.println("The index of the minimum element is " + result.y);
    }

    public static Pair<Integer, Integer> getMinimumAndIndex(int[] array) {
        if (array == null || array.length == 0) {
            return new Pair<Integer, Integer>(null, null);
        }

        //напишите тут ваш код
        
        AtomicInteger i = new AtomicInteger();
        
        Integer X = Arrays.stream(array).min().getAsInt();
        Integer Y = Arrays.stream(array).peek(v -> i.incrementAndGet())
        	    .anyMatch(a -> a == X) ? i.get() - 1 : -1;
        
        return new Pair<Integer, Integer>(X, Y);
        
        //Javarush answer:
//        int index = 0;
//        for (int i = 1; i < array.length; i++) {
//            if (array[i] < array[index]) {
//                index = i;
//            }
//
//        }  
//
//        return new Pair<Integer, Integer>(array[index], index); 
    }
    
    
    
    public static class Pair<X, Y> {
        public X x;
        public Y y;

        public Pair(X x, Y y) {
            this.x = x;
            this.y = y;
        }
    }  
}

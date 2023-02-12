package com.astamatii.javarushexc.javacore.L05.lesson_09;

import java.util.HashMap;
import java.util.Map; 

//В статическом блоке инициализируй labels пятью различными парами ключ-значение.

public class L5_9_InitializationOrder_1 {
    public static Map<Double, String> labels = new HashMap<Double, String>();
    
    static {
    	labels.put(1., "1");
    	labels.put(2., "2");
    	labels.put(3., "3");
    	labels.put(4., "4");
    	labels.put(5., "5");
    	}

    public static void main(String[] args) {
        System.out.println(labels);
    }    
}

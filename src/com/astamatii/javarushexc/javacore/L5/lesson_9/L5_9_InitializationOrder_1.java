package com.astamatii.javarushexc.javacore.L5.lesson_9;

import java.util.HashMap;
import java.util.Map; 

//В статическом блоке инициализируй labels пятью различными парами ключ-значение.

public class L5_9_InitializationOrder_1 {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    public static void main(String[] args) {
        System.out.println(labels);
    }    
}

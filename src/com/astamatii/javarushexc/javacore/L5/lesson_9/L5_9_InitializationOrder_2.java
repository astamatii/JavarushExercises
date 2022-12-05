package com.astamatii.javarushexc.javacore.L5.lesson_9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader; 

//В этой задаче тебе нужно:
//1. В статическом блоке считать с консоли А и В — две переменные с типом int.
//2. Обработать IOException в блоке catch.
//3. Закрыть поток ввода методом close().

public class L5_9_InitializationOrder_2 {
    public static int A;
    public static int B;

    static {
    	BufferedReader bufreader;
    	try {
    		bufreader = new BufferedReader(new InputStreamReader(System.in));
    		A = Integer.parseInt(bufreader.readLine());
    		B = Integer.parseInt(bufreader.readLine());
    		bufreader.close();
    	} catch (IOException e) {
    		e.printStackTrace();
    	} 
    }
    
    public static final int MIN = min(A, B);
    
    public static void main(String[] args) {
        System.out.println(MIN);
    }

    public static int min(int a, int b) {
        return a < b ? a : b;
    }  
}

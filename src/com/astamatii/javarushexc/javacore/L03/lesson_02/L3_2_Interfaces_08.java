package com.astamatii.javarushexc.javacore.L03.lesson_02;

//В этой задаче тебе нужно:
//Создать интерфейс Person.
//Добавить в него метод isAlive(), который проверяет, жив человек или нет.
//Подумать, какой тип должен возвращать этот метод.
//Создать интерфейс Presentable.
//Унаследовать интерфейс Presentable от интерфейса Person.

public class L3_2_Interfaces_08 {
    public static void main(String[] args) throws Exception {
    	
    }  
    
    interface Person {
    	boolean isAlive();
    }
    
    interface Presentable extends Person {
    	
    }
}

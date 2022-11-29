package com.astamatii.javarushexc.javacore.L3.lesson_2;

//В этой задаче тебе нужно:
//Создать интерфейс CanMove с методом speed.
//Сделать так, чтобы speed возвращал значение типа Double и ничего не принимал в качестве аргументов.
//Создать и унаследовать интерфейс CanFly от интерфейса CanMove.
//Добавить в интерфейс CanFly метод speed.
//Убедиться, что speed возвращает значение типа Double и принимает один параметр типа CanFly.

public class L3_2_Interfaces_9 {
    public static void main(String[] args) throws Exception {
    }          
    
    interface CanMove {
    	Double speed();
    }
    
    interface CanFly extends CanMove{
    	Double speed(CanFly o);
    }
    
}

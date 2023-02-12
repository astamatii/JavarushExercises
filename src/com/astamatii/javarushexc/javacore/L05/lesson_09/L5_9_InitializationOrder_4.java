package com.astamatii.javarushexc.javacore.L05.lesson_09;

//В статическом блоке класса Solution напиши код, выполнение которого приведет к возникновению исключения.
//В результате класс не загрузится, и вместо значения переменной B появится сообщение об ошибке:
//Exception in thread "main" java.lang.ExceptionInInitializerError
//at java.lang.Class.forName0(Native Method)
//at java.lang.Class.forName(Class.java:186)
//at com.intellij.rt.execution.application.AppMain.main(AppMain.java:113)
//Caused by: java.lang.RuntimeException:
//at com.javarush.task.task15.task1517.Solution.<clinit>(Solution.java:22)
//
//Hint: Нужно погуглить причину, если получилось следующее:
//java: initializer must be able to complete normally
//java: unreachable statement

public class L5_9_InitializationOrder_4 {
    public static int A = 0;

    static {
        //throw an exception here - выбросьте эксепшн тут
    	int B = 1 / A;
    }

    public static int B;

    public static void main(String[] args) {
        System.out.println(B);
    }  
}

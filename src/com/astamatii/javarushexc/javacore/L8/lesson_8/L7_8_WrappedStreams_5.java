package com.astamatii.javarushexc.javacore.L8.lesson_8;

import java.util.List; 

//Измени класс TableInterfaceWrapper так, чтобы он стал Wrapper-ом для TableInterface.
//Метод setModel должен вывести в консоль количество элементов в списке 
//	перед обновлением модели (вызовом метода setModel у объекта типа TableInterface).
//Метод getHeaderText должен возвращать текст в верхнем регистре - используй метод toUpperCase().

public class L7_8_WrappedStreams_5 {
    public class TableInterfaceWrapper {

    }

    public interface TableInterface {
        void setModel(List rows);

        String getHeaderText();

        void setHeaderText(String newHeaderText);
    }

    public static void main(String[] args) {
    }   
}

package com.astamatii.javarushexc.javacore.L7.lesson_10;

import java.util.HashMap;
import java.util.Map;

//ApplicationContext будет доступен множеству нитей.
//Сделать так, чтобы данные не терялись: подумай, какое ключевое слово необходимо поставить и где.

public class L7_10_10_Thread {

}

abstract class ApplicationContext<GenericsBean extends Bean> {
    private Map<String, GenericsBean> container = new HashMap<String, GenericsBean>();
    // Map<Name, some class that implements the Bean interface>


    protected ApplicationContext() {
        parseAllClassesAndInterfaces();
    }

    public GenericsBean getByName(String name) {
        return container.get(name);
    }

    public GenericsBean removeByName(String name) {
        return container.remove(name);
    }

    protected abstract void parseAllClassesAndInterfaces();

    public static void main(String[] args) {

    }
}      

interface Bean {   // это интерфейс-маркер
}                        

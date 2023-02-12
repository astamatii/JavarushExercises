package com.astamatii.javarushexc.javacore.L10.lesson_04;

import java.io.Serializable;

//Сделайте так, чтобы сериализация класса Object была возможной.
//Подсказка: для сериализации объекта нужно, чтобы все его поля поддерживали сериализацию.
//Для многих класов из JRE это уже сделано. Но если класс написан тобой, то нужно это свойство добавить вручную.

public class L10_4_Serialization_5_anyObject {
    public static class Object {
        public String string1;
        public String string2;
    }

    public static int stringCount;

    public static class String {
        private final int number;

        public String() {
            number = ++stringCount;
        }

        public void print() {
            System.out.println("string #" + number);
        }                       
    }

    public static void main(String[] args) {

    }
}

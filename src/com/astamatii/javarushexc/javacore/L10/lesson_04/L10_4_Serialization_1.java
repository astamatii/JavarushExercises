package com.astamatii.javarushexc.javacore.L10.lesson_04;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Сделай так, чтобы сериализация класса Human была возможной.

public class L10_4_Serialization_1 {
    public static class Human {
        public String name;
        public List<String> assets = new ArrayList<>();

        public Human() {
        }

        public Human(String name, String... assets) {
            this.name = name;
            if (assets != null) {
                this.assets.addAll(Arrays.asList(assets));
            }
        }
    }

    public static void main(String[] args) {

    }  
}

package com.astamatii.javarushexc.javacore.L03.lesson_04;

//Исправь код так, чтобы программа выполнялась и выводила фразу: "Я переводчик с английского".
//Метод main менять нельзя!

public class L3_4_AbstractClass_2 {
    public static void main(String[] args) throws Exception {
        Translator translator = new Translator();
        System.out.println(translator.translate());
    }

    public static class Translator {
        public String translate() {
            return "Я переводчик с английского";
        }
    }    
}

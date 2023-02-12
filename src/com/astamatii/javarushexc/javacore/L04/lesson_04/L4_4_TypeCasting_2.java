package com.astamatii.javarushexc.javacore.L04.lesson_04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//Давай напишем программу, которая будет давать имена всем котикам, выпускаемым на нашей котофабрике.
//Для этого нужно:
//Считывать строки (параметры) с консоли, пока пользователь не введет пустую строку (Enter).
//Для каждого параметра (имени кота):
// 1. создать объект cat класса Cat, который равен коту из getCatByKey(String параметр).
// 2. вывести на экран cat.toString().

public class L4_4_TypeCasting_2 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
    	    	
    	try(BufferedReader bufreader = new BufferedReader(new InputStreamReader(System.in))){
    	    String line = bufreader.readLine();
    	    
    	    while(!line.equals("")) {
    	    	Cat cat = CatFactory.getCatByKey(line);
    	    	System.out.println(cat.toString());
    	    	line = bufreader.readLine();
    	    }    	    
    	} catch (Exception e) {
    		e.printStackTrace();
    	}
    	
    }

    static class CatFactory {
        static Cat getCatByKey(String key) {
            Cat cat;
            switch (key) {
                case "vaska":
                    cat = new MaleCat("Василий");
                    break;
                case "murka":
                    cat = new FemaleCat("Мурочка");
                    break;
                case "kiska":
                    cat = new FemaleCat("Кисюлька");
                    break;
                default:
                    cat = new Cat(key);
                    break;
            }
            return cat;
        }
    }

    static class Cat {
        private String name;

        protected Cat(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        public String toString() {
            return "Я уличный кот " + getName();
        }
    }

    static class MaleCat extends Cat {
        MaleCat(String name) {
            super(name);
        }

        public String toString() {
            return "Я - солидный кошак по имени " + getName();
        }
    }

    static class FemaleCat extends Cat {
        FemaleCat(String name) {
            super(name);
        }

        public String toString() {
            return "Я - милая кошечка по имени " + getName();
        }
    }
}

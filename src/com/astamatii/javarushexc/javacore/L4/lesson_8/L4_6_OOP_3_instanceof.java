package com.astamatii.javarushexc.javacore.L4.lesson_8;

//Давай напишем программу, которая определит, чем заняться тому или иному человеку.
//Для этого нужно:
//1. Ввести [в цикле] с клавиатуры несколько строк (ключей).
//2. Строки (ключи) могут быть такими: "user", "loser", "coder", "proger".
//3. Ввод окончен, когда строка не совпадает ни с одной из выше указанных.
//
//Для каждой введенной строки нужно:
//1. Создать соответствующий объект [см. Person.java], например,
// 	для строки "user" нужно создать объект класса User.
//2. Передать этот объект в метод doWork.
//3. Написать реализацию метода doWork, который:
//4. Вызывает метод live() у переданного объекта, если этот объект (person) имеет тип User.
//5. Вызывает метод doNothing(), если person имеет тип Loser.
//6. Вызывает метод writeCode(), если person имеет тип Coder.
//7. Вызывает метод enjoy(), если person имеет тип Proger.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class L4_6_OOP_3_instanceof {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;

        //тут цикл по чтению ключей, пункт 1
        String line = reader.readLine();
        while(line.equals("user") || line.equals("loser") 
        		|| line.equals("coder") || line.equals("proger"))
        {        	
            //создаем объект, пункт 2
        	if(line.equals("user"))
        		person = new Person.User();
        	if(line.equals("loser"))
        		person = new Person.Loser();
        	if(line.equals("coder"))
        		person = new Person.Coder();
        	if(line.equals("proger"))
        		person = new Person.Proger();
        	
            doWork(person); //вызываем doWork
            
            line = reader.readLine();
        }
    }

    public static void doWork(Person person) {
        // пункт 3
    	if(person instanceof Person.User) {
    		((Person.User)person).live();
    	}
    	if(person instanceof Person.Loser) {
    		((Person.Loser)person).doNothing();
    	}
    	if(person instanceof Person.Coder) {
    		((Person.Coder)person).writeCode();
    	}
    	if(person instanceof Person.Proger) {
    		((Person.Proger)person).enjoy();
    	}
    } 
}

interface Person {
    class User implements Person {
        void live() {
            System.out.println("I usually just live.");
        }
    }

    class Loser implements Person {
        void doNothing() {
            System.out.println("I usually do nothing.");
        }
    }                            

    class Coder implements Person {
        void writeCode() {
            System.out.println("I usually write code.");
        }
    }

    class Proger implements Person {
        void enjoy() {
            System.out.println("It's a wonderful life!");
        }
    }  

}    

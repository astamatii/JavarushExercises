package com.astamatii.javarushexc.javacore.L09.lesson_11;

//В метод main первым параметром приходит имя файла.
//В этом файле каждая строка имеет следующий вид:
//имя день месяц год
//где [имя] - может состоять из нескольких слов, разделенных пробелами, и имеет тип String.
//[день] - int, [месяц] - int, [год] - int
//данные разделены пробелами.
//
//Заполнить список PEOPLE используя данные из файла.
//Закрыть потоки.
//
//Пример входного файла:
//Иванов Иван Иванович 31 12 1987
//Вася 15 5 2013

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Date;

public class L9_11_06_IOStreams {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) {

    }
}

class Person {
    private String name;
    private Date birthDate;

    public Person(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public Date getBirthDate() {
        return birthDate;
    }
}     
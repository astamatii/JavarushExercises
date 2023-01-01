package com.astamatii.javarushexc.javacore.L7.lesson_10;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//CRUD - Create, Read, Update, Delete.
//
//Программа запускается с одним из следующих наборов параметров:
//-c name sex bd
//-r id
//-u id name sex bd
//-d id
//
//Значения параметров:
//name - имя, String
//sex - пол, "м" или "ж", одна буква
//bd - дата рождения в следующем формате 15/04/1990
//-c - добавляет человека с заданными параметрами в конец allPeople, выводит id (index) на экран
//-r - выводит на экран информацию о человеке с id: name sex (м/ж) bd (формат 15-Apr-1990)
//-u - обновляет данные человека с данным id
//-d - производит логическое удаление человека с id, заменяет все его данные на null
//
//id соответствует индексу в списке.
//Все люди должны храниться в allPeople.
//Используй Locale.ENGLISH в качестве второго параметра для SimpleDateFormat.
//
//Пример параметров:
//-c Миронов м 15/04/1990
//
//Пример вывода для параметра -r:
//Миронов м 15-Apr-1990
//
//Если программа запущена с параметрами, то они попадают в массив args (аргумент метода main - String[] args).
//Например, при запуске программы c параметрами:
//-c name sex bd
//получим в методе main
//args[0] = "-c"
//args[1] = "name"
//args[2] = "sex"
//args[3] = "bd"
//Для запуска кода с параметрами в IDE IntellijIDEA нужно их прописать в поле 
//	Program arguments в меню Run -> Edit Configurations.

public class L7_10_1_Thread {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        //напишите тут ваш код
    }  
}


enum Sex { 
    MALE,
    FEMALE
}  

class Person {
    private String name;
    private Sex sex;
    private Date birthDate;

    private Person(String name, Sex sex, Date birthDate) {
        this.name = name;
        this.sex = sex;
        this.birthDate = birthDate;
    }

    public static Person createMale(String name, Date birthDate) {
        return new Person(name, Sex.MALE, birthDate);
    }

    public static Person createFemale(String name, Date birthDate) {
        return new Person(name, Sex.FEMALE, birthDate);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}   

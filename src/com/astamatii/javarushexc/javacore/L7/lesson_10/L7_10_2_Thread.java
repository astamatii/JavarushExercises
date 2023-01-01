package com.astamatii.javarushexc.javacore.L7.lesson_10;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//CrUD Batch - multiple Creation, Updates, Deletion.
//
//Программа запускается с одним из следующих наборов параметров:
//-c name1 sex1 bd1 name2 sex2 bd2 ...
//-u id1 name1 sex1 bd1 id2 name2 sex2 bd2 ...
//-d id1 id2 id3 id4 ...
//-i id1 id2 id3 id4 ...
//
//Значения параметров:
//name - имя, String
//sex - пол, "м" или "ж", одна буква
//bd - дата рождения в следующем формате 15/04/1990
//-с - добавляет всех людей с заданными параметрами в конец allPeople, выводит id (index) на экран в соответствующем порядке
//-u - обновляет соответствующие данные людей с заданными id
//-d - производит логическое удаление человека с id, заменяет все его данные на null
//-i - выводит на экран информацию о всех людях с заданными id: name sex bd
//
//id соответствует индексу в списке.
//Формат вывода даты рождения 15-Apr-1990
//Все люди должны храниться в allPeople.
//Порядок вывода данных соответствует вводу данных.
//Обеспечить корректную работу с данными для множества нитей (чтоб не было затирания данных).
//Используй Locale.ENGLISH в качестве второго параметра для SimpleDateFormat.
//
//Пример вывода для параметра -і с двумя id:
//Миронов м 15-Apr-1990
//Миронова ж 25-Apr-1997

public class L7_10_2_Thread {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        //start here - начни тут
    }
}

//These classes are already in L7_10_1_Thread.java
//enum Sex {
//    MALE,
//    FEMALE
//}      
//
//class Person {
//    private String name;
//    private Sex sex;
//    private Date birthDate;
//
//    private Person(String name, Sex sex, Date birthDate) {
//        this.name = name;
//        this.sex = sex;
//        this.birthDate = birthDate;
//    }
//
//    public static Person createMale(String name, Date birthDate) {
//        return new Person(name, Sex.MALE, birthDate);
//    }
//
//    public static Person createFemale(String name, Date birthDate) {
//        return new Person(name, Sex.FEMALE, birthDate);
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public Sex getSex() {
//        return sex;
//    }
//
//    public void setSex(Sex sex) {
//        this.sex = sex;
//    }
//
//    public Date getBirthDate() {
//        return birthDate;
//    }
//
//    public void setBirthDate(Date birthDate) {
//        this.birthDate = birthDate;
//    }
//} 

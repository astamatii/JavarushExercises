package com.astamatii.javarushexc.javacore.L07.lesson_10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

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

public class L7_10_01_Thread {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        //напишите тут ваш код
    	Person person = Person.createMale(null, null);
    	
    	String male = "м";
    	String female = "ж";
    	
    	SimpleDateFormat formatIn = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
    	SimpleDateFormat formatOut = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
    	
    	Date date = new Date();
		
    	
    	switch(args[0]) {
    	case "-c":
    		try {
    			date = formatIn.parse(args[3]);
    		} catch (ParseException e) {
    			e.printStackTrace();
    		}
    		
    		if (args[2].equals(male))
    			allPeople.add(person = Person.createMale(args[1], date));
    		else if (args[2].equals(female))
    			allPeople.add(person = Person.createFemale(args[1], date));
    		
    		System.out.println(allPeople.indexOf(person));
    		
    		break;
    		
    	case "-r":
    		person = allPeople.get(Integer.parseInt(args[1]));
    		
    		System.out.println(person.getName() + " " + (person.getSex() == Sex.MALE ? male : (person.getSex() == Sex.FEMALE ? female : null) ) + " " + formatOut.format(person.getBirthDate()));
    		
    		break;
    		
    	case "-u":
    		
    		person = allPeople.get(Integer.parseInt(args[1]));
    		
    		person.setName(args[2]);
    		
    		if (args[3].equals(male))
    			person.setSex(Sex.MALE);
    		else if (args[3].equals(female))
    			person.setSex(Sex.FEMALE);
    		
    		try {
    			date = formatIn.parse(args[4]);
    		} catch (ParseException e) {
    			e.printStackTrace();
    		}
    		
    		person.setBirthDate(date);
    		
    		break;
    		
    	case "-d":
    		
    		person = allPeople.get(Integer.parseInt(args[1]));
    		
    		person.setName(null);
    		person.setSex(null);
    		person.setBirthDate(null);
    		
    		break;
    	}
    	
//    	//Verify:
//    	person = allPeople.get(0);
//		
//		System.out.println(person.getName() + " " + (person.getSex() == Sex.MALE ? male : (person.getSex() == Sex.FEMALE ? female : null) ) + " " + formatOut.format(person.getBirthDate()));
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

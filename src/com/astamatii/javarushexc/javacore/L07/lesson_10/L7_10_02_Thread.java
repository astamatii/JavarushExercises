package com.astamatii.javarushexc.javacore.L07.lesson_10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

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

public class L7_10_02_Thread {
	public static volatile List<Person> allPeople = new ArrayList<Person>();

	static {
		allPeople.add(Person.createMale("Иванов Иван", new Date())); // сегодня родился id=0
		allPeople.add(Person.createMale("Петров Петр", new Date())); // сегодня родился id=1
	}

	public static void main(String[] args) {
		// start here - начни тут
		Person person = Person.createMale(null, null);

		String male = "м";
		String female = "ж";

		SimpleDateFormat formatIn = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
		SimpleDateFormat formatOut = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);

		Date date = new Date();

		switch (args[0]) {
		case "-c":
			synchronized (allPeople) {
				for (int i = 0; i < args.length - 1; i += 3) {
					try {
						date = formatIn.parse(args[3 + i]);
					} catch (ParseException e) {
						e.printStackTrace();
					}

					if (args[2 + i].equals(male))
						allPeople.add(person = Person.createMale(args[1 + i], date));
					else if (args[2 + i].equals(female))
						allPeople.add(person = Person.createFemale(args[1 + i], date));

					System.out.println(allPeople.indexOf(person));
				}
			}

			break;

		case "-u":
			synchronized (allPeople) {
				for (int i = 0; i < args.length - 1; i += 4) {
					person = allPeople.get(Integer.parseInt(args[1 + i]));

					person.setName(args[2 + i]);

					if (args[3 + i].equals(male))
						person.setSex(Sex.MALE);
					else if (args[3 + i].equals(female))
						person.setSex(Sex.FEMALE);

					try {
						date = formatIn.parse(args[4 + i]);
					} catch (ParseException e) {
						e.printStackTrace();
					}

					person.setBirthDate(date);
				}
			}

			break;

		case "-d":
			synchronized (allPeople) {
				for (int i = 0; i < args.length - 1; i++) {
					person = allPeople.get(Integer.parseInt(args[1 + i]));

					person.setName(null);
					person.setSex(null);
					person.setBirthDate(null);
				}
			}

			break;

		case "-i":
			synchronized (allPeople) {
				for (int i = 0; i < args.length - 1; i++) {
					person = allPeople.get(Integer.parseInt(args[i + 1]));
					System.out.println(person.getName() + " "
							+ (person.getSex() == Sex.MALE ? male : (person.getSex() == Sex.FEMALE ? female : null))
							+ " " + formatOut.format(person.getBirthDate()));
				}
			}

			break;
		}

//    	//Verify: (PS: Infinite execution)
//    	System.out.println();
//    	Thread thread1 = new Thread() {
//    		@Override
//    		public void run() {
//    			L7_10_2_Thread.main(new String[] {"-c", "Jopa1", "м", "22/02/2222", "Jopa2", "ж", "02/02/2222"});
//    		}
//    	};
//    	
//    	Thread thread2 = new Thread() {
//    		@Override
//    		public void run() {
//    			L7_10_2_Thread.main(new String[] {"-i", "0", "1", "2", "3"});
//    		}
//    	};
//    	
//    	thread1.start();
//    	thread2.start();

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

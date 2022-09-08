package com.astamatii.javarushexc;

import java.util.HashMap;
import java.util.Map;

public class L4_6_HashMapExc {

	public static HashMap<String, Double> grades = new HashMap<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addStudents();
		System.out.println(grades);
		System.out.println("_________________________\n");
        printStudents();
        System.out.println("\nСредний балл группы: " + getAverageMark());
        System.out.println("_________________________\nStudentsInfo:");
        printStudentsInfo();
        System.out.println("_________________________\n");
        System.out.println(getProgrammingLanguages());
	}

	public static void addStudents() {
		grades.put("Давыдов Олег", 4.3d);
		grades.put("Шульга Николай", 4.1d);
		grades.put("Колос Василий", 4.9d);
		grades.put("Шевченко Тарас", 3.7d);
		grades.put("Марчук Любослав", 3.2d);
	}
	
	public static void printStudents() {
        //напишите тут ваш код
        for(String student : grades.keySet())
            System.out.println(student);
    }
	
	public static Double getAverageMark() {
        //напишите тут ваш код
        Double averageMark = 0.;
        for(Double mark : grades.values()){
            averageMark += mark;
        }

        return averageMark / grades.size();
    }
	
	public static void printStudentsInfo() {
        //напишите тут ваш код
        for (Map.Entry<String, Double> grade : grades.entrySet()) {
            System.out.println(grade.getKey() + " : " + grade.getValue());
        }
    }
	
	public static HashMap<Integer, String> getProgrammingLanguages() {
        //напишите тут ваш код
        HashMap<Integer, String> programmingLanguages = new HashMap<>();
        programmingLanguages.put(0, "Java");
        programmingLanguages.put(1, "Kotlin");
        programmingLanguages.put(2, "Go");
        programmingLanguages.put(3, "Javascript");
        programmingLanguages.put(4, "Typescript");
        programmingLanguages.put(5, "Python");
        programmingLanguages.put(6, "PHP");
        programmingLanguages.put(7, "C++");
        return programmingLanguages;
    }
}

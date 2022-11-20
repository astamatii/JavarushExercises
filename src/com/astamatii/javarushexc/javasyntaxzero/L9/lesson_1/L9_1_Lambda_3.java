package com.astamatii.javarushexc.javasyntaxzero.L9.lesson_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//В классе Solution есть статическое поле mentors, 
// которое заполняется менторами JavaRush (объектами типа JavaRushMentor) в методе main().
//У ментора (класс JavaRushMentor) есть имя (поле name). 
//В программе нужно отсортировать менторов по длине имени в возрастающем порядке (от самого короткого до самого длинного).
//
//Чтобы отсортировать всех менторов в списке mentors 
// используется метод Collections.sort(ArrayList<JavaRushMentor>, Comparator<JavaRushMentor>), 
// в который передается список менторов mentors и компаратор сортировки.
//
//Твоя задача — реализовать этот компаратор. Для этого в классе NameComparator 
// нужно имплементировать интерфейс Comparator<JavaRushMentor> 
// и реализовать метод int compare(JavaRushMentor mentor1, JavaRushMentor mentor2), 
// который возвращает числовое значение со следующими условиями:
//
//отрицательное число, если длина имени ментора mentor1 меньше длины имени ментора mentor2;
//положительное число, если длина имени ментора mentor1 больше длины имени ментора mentor2;
//0, если длины имен менторов mentor1 и mentor2 одинаковы.
//Метод main() не принимает участие в тестировании.

public class L9_1_Lambda_3 {
	public static ArrayList<JavaRushMentor> mentors = new ArrayList<>();

    public static void main(String[] args) {
        Collections.addAll(mentors,
                new JavaRushMentor("Джон Бобров"),
                new JavaRushMentor("Риша"),
                new JavaRushMentor("Эллеонора Керри"),
                new JavaRushMentor("Ханс Нудлс"),
                new JavaRushMentor("Ким"),
                new JavaRushMentor("Хулио Сиеста"),
                new JavaRushMentor("Диего"),
                new JavaRushMentor("Лага Билаабо")
        );

        Collections.sort(mentors, new NameComparator());

        for (JavaRushMentor mentor : mentors) {
            System.out.println(mentor);
        }
    }

}

class NameComparator implements Comparator<JavaRushMentor>{
	//напишите тут ваш код
	@Override
	public int compare(JavaRushMentor o1, JavaRushMentor o2) {
		return o1.getName().length() - o2.getName().length();
	}    
}           

class JavaRushMentor {
    private String name;

    public JavaRushMentor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Ментор по имени - " + name;
    }
}    
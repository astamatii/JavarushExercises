package com.astamatii.javarushexc.javacore.L09.lesson_03;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner; 

//Адаптировать Scanner к PersonScanner.
//Классом-адаптером является PersonScannerAdapter.
//В классе адаптере создать приватное финальное поле Scanner fileScanner. 
//Поле инициализировать в конструкторе с одним аргументом типа Scanner.
//
//Данные в файле хранятся в следующем виде:
//Иванов Иван Иванович 31 12 1950
//Петров Петр Петрович 31 12 1957
//
//В файле хранится большое количество людей, данные одного человека находятся в одной строке. 
//Метод read() должен читать данные только одного человека.

public class L9_3_AdapterReaderWriter_4 {
    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter {

    }
}

interface PersonScanner {
    Person read() throws IOException;

    void close() throws IOException;
}

class Person {
    private String firstName;
    private String middleName;
    private String lastName;
    private Date birthDate;

    public Person(String firstName, String middleName, String lastName, Date birthDate) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s", lastName, firstName, middleName, birthDate.toString());
    }
}    
package com.astamatii.javarushexc.javacore.L09.lesson_03;

import java.util.HashMap;
import java.util.Map; 

//Давай представим ситуацию, что с одной стороны у нас есть некая база данных, в которой хранятся данные. 
//База данных имеет стандартный набор команд (методов) для предоставления данных, 
// они описаны в интерфейсе IncomeData. 
//Примеры представления данных приведены в комментариях около каждого метода.
//С другой стороны есть пользователи, которые хотят получать данные из этой базы, 
// но в каком-то другом (конкретном) формате. 
//Запросы от пользователей представлены методами в интерфейсах Customer и Contact. 
//Там же (в комментариях около каждого метода) есть примеры представления информации в том виде, 
// в котором пользователи хотят ее получать из базы данных.
//
//Твоя задача: написать логику класса адаптера IncomeDataAdapter, который будет по запросам методов 
// из интерфейсов Customer и Contact, обращаться в базу (методы интерфейса IncomeData), получать данные, 
// обрабатывать их, при необходимости изменять представление, и возвращать в виде результата.
//
//Инициализируй countries перед началом выполнения программы. Соответствие кода страны и названия:
//UA Ukraine
//RU Russia
//CA Canada
//
//При необходимости дополни начало телефонного номера (без кода страны) нулями до 10 цифр 
// (смотри примеры в комментарии к соответствующему методу). 
//Обрати внимание на формат вывода телефона, фамилии и имени человека 
// (смотри примеры в комментарии к соответствующему методу).

public class L9_3_AdapterReaderWriter_3 {
    public static Map<String, String> countries = new HashMap<String, String>();

    public static void main(String[] args) {

    }

    public static class IncomeDataAdapter {
    }


    public interface IncomeData {
        String getCountryCode();        //For example: UA

        String getCompany();            //For example: JavaRush Ltd.

        String getContactFirstName();   //For example: Ivan

        String getContactLastName();    //For example: Ivanov

        int getCountryPhoneCode();      //For example: 38

        int getPhoneNumber();           //For example1: 501234567, For example2: 71112233
    }

    public interface Customer {
        String getCompanyName();        //For example: JavaRush Ltd.

        String getCountryName();        //For example: Ukraine
    }

    public interface Contact {
        String getName();               //For example: Ivanov, Ivan

        String getPhoneNumber();        //For example1: +38(050)123-45-67, For example2: +38(007)111-22-33
    } 
}

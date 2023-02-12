package com.astamatii.javarushexc.javacore.L09.lesson_03;

import java.util.HashMap;
import java.util.Map;  

//Адаптировать Customer и Contact к RowItem.
//Классом-адаптером является DataAdapter.
//
//Инициализируй countries перед началом выполнения программы. Соответствие кода страны и названия:
//UA Ukraine
//RU Russia
//CA Canada

public class L9_3_AdapterReaderWriter_5 {
    public static Map<String, String> countries = new HashMap<String, String>();

    public static void main(String[] args) {

    }

    public static class DataAdapter {
        public DataAdapter(Customer customer, Contact contact) {
        }
    }

    public static interface RowItem {
        String getCountryCode();        //For example: UA

        String getCompany();            //For example: JavaRush Ltd.

        String getContactFirstName();   //For example: Ivan

        String getContactLastName();    //For example: Ivanov

        String getDialString();         //For example: callto://+380501234567
    }

    public static interface Customer {
        String getCompanyName();        //For example: JavaRush Ltd.

        String getCountryName();        //For example: Ukraine
    }

    public static interface Contact {
        String getName();               //For example: Ivanov, Ivan

        String getPhoneNumber();        //For example: +38(050)123-45-67 or +3(805)0123-4567 or +380(50)123-4567 or ...
    } 
}

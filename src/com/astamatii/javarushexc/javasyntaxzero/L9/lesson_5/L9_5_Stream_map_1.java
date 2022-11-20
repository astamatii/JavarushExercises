package com.astamatii.javarushexc.javasyntaxzero.L9.lesson_5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

//У учетной записи (класс Account) есть имя (поле name) и электронный ящик (поле email). 
//Нужно, чтобы метод getEmails(ArrayList<Account>) в классе Solution 
// возвращал поток электронных ящиков всех учетных записей из списка, полученного в качестве входящего аргумента.
//
//Подсказка:
//Для преобразования потока данных одного типа в другой используй метод map() объекта типа Stream<Account>.
//
//Метод main() не принимает участие в тестировании.

public class L9_5_Stream_map_1 {
    public static void main(String[] args) {
        var accounts = new ArrayList<Account>();
        Collections.addAll(accounts,
                new Account("Elly", "elly@yandex.ru"),
                new Account("Jocker", "jocker@gmail.com"),
                new Account("Neo", "neo@yahoo.com"));

        Stream<String> emails = getEmails(accounts);
        emails.forEach(System.out::println);
    }

    public static Stream<String> getEmails(ArrayList<Account> accounts) {
        //напишите тут ваш код
        return accounts.stream().map(x -> x.getEmail()); 
    }
}

class Account {
    private String name;
    private String email;

    public Account(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }   
}
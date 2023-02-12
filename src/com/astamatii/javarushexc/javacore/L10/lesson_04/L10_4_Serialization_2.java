package com.astamatii.javarushexc.javacore.L10.lesson_04;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;  
import java.util.Date; 


//Сделай так, чтобы сериализация класса JavaRush была возможной.

public class L10_4_Serialization_2 {
    public static class JavaRush {
        public List<User> users = new ArrayList<>();
    }

    public static void main(String[] args) {

    }
}

class User {
    private String firstName;
    private String lastName;
    private Date birthDate;
    private boolean isMale;
    private Country country;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public enum Country {
        UKRAINE("Ukraine"),
        RUSSIA("Russia"),
        OTHER("Other");

        private String name;

        Country(String name) {
            this.name = name;
        }

        public String getDisplayName() {
            return this.name;
        }
    }
}
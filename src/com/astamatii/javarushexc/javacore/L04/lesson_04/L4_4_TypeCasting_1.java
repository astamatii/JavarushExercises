package com.astamatii.javarushexc.javacore.L04.lesson_04;

//В этой задаче тебе нужно:
//Правильно расставить наследование между Building (здание) и School (здание школы).
//Подумать, объект какого класса должны возвращать методы getSchool и getBuilding.
//Изменить null на объект класса Building или School.
//Сигнатуры методов getSchool() и getBuilding() не меняй.

public class L4_4_TypeCasting_1 {
    public static void main(String[] args) {
        Building school = getSchool();
        Building shop = getBuilding();

        System.out.println(school);
        System.out.println(shop);
    }

    public static Building getSchool() {
        //измените null на объект класса Building или School
        return new School();
    }

    public static Building getBuilding() {
        //измените null на объект класса Building или School
        return new Building();
    }

    static class School extends Building /*Добавьте сюда ваш код*/ {
        @Override
        public String toString() {
            return "School";
        }
    }

    static class Building /*Добавьте сюда ваш код*/ {
        @Override
        public String toString() {
            return "Building";
        }         
    }
}

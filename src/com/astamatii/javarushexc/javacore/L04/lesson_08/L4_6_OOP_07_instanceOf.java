package com.astamatii.javarushexc.javacore.L04.lesson_08;

//В этой задаче тебе нужно:
//1. Реализовать метод cleanAllApartments().
//2. Пройтись по списку объектов apartments:
//	2.1. для однокомнатных квартир (OneRoomApt) вызвать метод clean1Room();
//	2.2. для двухкомнатных квартир (TwoRoomApt) вызвать метод clean2Rooms();
//	2.3. для трехкомнатных квартир (ThreeRoomApt) вызвать метод clean3Rooms().
//3. Использовать instanceof.

import java.util.ArrayList;
import java.util.List;

public class L4_6_OOP_07_instanceOf {
    public static void main(String[] args) {
        List<Apartment> apartments = new ArrayList<Apartment>();
        apartments.add(new OneRoomApt());
        apartments.add(new TwoRoomApt());
        apartments.add(new ThreeRoomApt());

        cleanAllApartments(apartments);
    }

    public static void cleanAllApartments(List<Apartment> apartments) {
        //написать тут вашу реализацию пунктов 1-4
    	apartments.forEach(x -> {
    	if(x instanceof OneRoomApt)
    		((OneRoomApt)x).clean1Room();
    	if(x instanceof TwoRoomApt)
    		((TwoRoomApt)x).clean2Rooms();
    	if(x instanceof ThreeRoomApt)
    		((ThreeRoomApt)x).clean3Rooms();
    	});
    }

    static interface Apartment {
    }

    static class OneRoomApt implements Apartment {
        void clean1Room() {
            System.out.println("1 room is cleaned");
        }
    }

    static class TwoRoomApt implements Apartment {
        void clean2Rooms() {
            System.out.println("2 rooms are cleaned");
        }
    }

    static class ThreeRoomApt implements Apartment {
        void clean3Rooms() {
            System.out.println("3 rooms are cleaned");
        }
    } 
}

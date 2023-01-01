package com.astamatii.javarushexc.javacore.L7.lesson_4;

//И снова Singleton паттерн - синхронизация в статическом блоке.
//Внутри класса OurPresident в статическом блоке создай синхронизированный блок.
//Внутри синхронизированного блока инициализируй president.

public class L7_4_sinchronized_4 {
	public static void main(String[] args) {
        OurPresident expectedPresident = OurPresident.getOurPresident();
        OurPresident ourPresident = OurPresident.getOurPresident();
        System.out.println(expectedPresident == ourPresident);
    } 
}

class OurPresident {
    private static OurPresident president;

    private OurPresident() {
    }

    public static OurPresident getOurPresident() {
        return president;
    }
} 
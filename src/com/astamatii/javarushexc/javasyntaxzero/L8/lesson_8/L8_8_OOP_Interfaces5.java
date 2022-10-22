package com.astamatii.javarushexc.javasyntaxzero.L8.lesson_8;

import java.util.ArrayList;
import java.util.List;

//В деревне Вилларибо есть струнный оркестр, а в деревне Виллабаджо — клавишный.
//Как-то раз повозки с музыкантами из двух деревень столкнулись на перекрестке, и все смешалось в кучу.
//Помоги артистам разобрать свои инструменты. И естественно, после этого оба оркестра должны дать концерт.
//
//Для этого:
//
// 1. в методе createKeyboardOrchestra() добавь в список orchestra один орган и три пианино;
// 2. в методе createStringedOrchestra() добавь в список orchestra две скрипки и одну гитару;
// 3. метод playOrchestra() должен вызывать метод play() у всех элементов списка orchestra.

public class L8_8_OOP_Interfaces5 {

	static List<MusicalInstrument> orchestra = new ArrayList<>();

    public static void main(String[] args) {
        createKeyboardOrchestra();
        createStringedOrchestra();
        playOrchestra();
    }

    public static void createKeyboardOrchestra() {
        //напишите тут ваш код
    	orchestra.add(new Organ());
    	orchestra.add(new Piano());
    	orchestra.add(new Piano());
    	orchestra.add(new Piano());
    }

    public static void createStringedOrchestra() {
        //напишите тут ваш код
    	orchestra.add(new Violin());
    	orchestra.add(new Violin());
    	orchestra.add(new Guitar());
    }

    public static void playOrchestra() {
        //напишите тут ваш код
    	for(MusicalInstrument instrument: orchestra)
    		instrument.play();
    }
	
}

interface MusicalInstrument {
    void play();
}

class Violin implements MusicalInstrument {
    @Override
    public void play() {
        System.out.println("Играет скрипка.");
    }
}

class Organ implements MusicalInstrument {
    @Override
    public void play() {
        System.out.println("Играет орган.");
    }
}

class Guitar implements MusicalInstrument {
    @Override
    public void play() {
        System.out.println("Играет гитара.");
    }
}

class Piano implements MusicalInstrument {
    @Override
    public void play() {
        System.out.println("Играет пианино.");
    }
}






package com.astamatii.javarushexc.javacore.L07.lesson_04;

import java.util.ArrayList;
import java.util.List;

//1. Класс Note будет использоваться нитями. Поэтому сделай так, чтобы обращения к листу notes блокировали мьютекс notes, 
//	не this
//2. Все System.out.println не должны быть заблокированы (синхронизированы), т.е. не должны находиться в блоке synchronized

public class L7_4_sinchronized_1 {

    public static void main(String[] args) {
    	
//    	TestThread testThread = new TestThread();
//    	TestThread testThread2 = new TestThread();
//    	TestThread testThread3 = new TestThread();
//    	
//    	testThread.start();
//    	testThread2.start();
//    	testThread3.start();

    }

    public static class Note {

        public final List<String> notes = new ArrayList<String>();

        public void addNote(int index, String note) {
            System.out.println("Сейчас будет добавлена заметка [" + note + "] На позицию " + index);
            
            synchronized(notes) {
            	notes.add(index, note);
            }
            
            System.out.println("Уже добавлена заметка [" + note + "]");
        }

        public void removeNote(int index) {
            System.out.println("Сейчас будет удалена заметка с позиции " + index);
            String note;
            
            synchronized(notes) {
            	note = notes.remove(index);
            }
            
            System.out.println("Уже удалена заметка [" + note + "] с позиции " + index);
        }
    }
    
//    public static class TestThread extends Thread {
//    	public Note note = new Note();
//    	
//    	@Override
//    	public void run() {
//    		note.addNote(0, "Hello - " + getName());
//    		note.removeNote(0);
//    	}
//    }
}

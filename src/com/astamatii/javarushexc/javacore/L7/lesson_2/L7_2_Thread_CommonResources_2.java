package com.astamatii.javarushexc.javacore.L7.lesson_2;

import java.util.ArrayList;
import java.util.List;

//1. Разберись, что и как работает.
//2. Создай public static нить SortThread, которая в методе run отсортирует статический массив testArray 
//	используя метод sort.

public class L7_2_Thread_CommonResources_2 {

    public static void main(String[] args) {

    }

    public static class Note {

        public final List<String> notes = new ArrayList<String>();

        public void addNote(int index, String note) {
            System.out.println("Сейчас будет добавлена заметка [" + note + "] На позицию " + index);
            notes.add(index, note);
            System.out.println("Уже добавлена заметка [" + note + "]");
        }

        public void removeNote(int index) {
            System.out.println("Сейчас будет удалена заметка с позиции " + index);
            String note = notes.remove(index);
            System.out.println("Уже удалена заметка [" + note + "] с позиции " + index);
        }
    } 
}

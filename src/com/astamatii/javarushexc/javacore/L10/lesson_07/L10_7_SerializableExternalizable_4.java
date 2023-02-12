package com.astamatii.javarushexc.javacore.L10.lesson_07;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

//Сериализуй класс Solution.
//Подумай, какие поля не нужно сериализовать, пометь ненужные поля модификатором transient.
//Объект всегда должен содержать актуальные итоговые данные.
//Метод main не участвует в тестировании.
//
//Написать код проверки самостоятельно в методе main:
//1) создать файл, открыть поток на чтение (input stream) и на запись(output stream);
//2) создать экземпляр класса Solution - savedObject;
//3) записать в поток на запись savedObject (убедитесь, что они там действительно есть);
//4) создать другой экземпляр класса Solution с другим параметром;
//5) загрузить из потока на чтение объект - loadedObject;
//6) проверить, что savedObject.string равна loadedObject.string;
//7) обработать исключения.

public class L10_7_SerializableExternalizable_4 {
    public static void main(String[] args) {
        System.out.println(new L10_7_SerializableExternalizable_4(4));
    }

    private final String pattern = "dd MMMM yyyy, EEEE";
    private Date currentDate;
    private int temperature;
    String string;

    public L10_7_SerializableExternalizable_4(int temperature) {
        this.currentDate = new Date();
        this.temperature = temperature;

        string = "Today is %s, and the current temperature is %s C";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        this.string = String.format(string, format.format(currentDate), temperature);
    }

    @Override
    public String toString() {
        return this.string;
    }
}

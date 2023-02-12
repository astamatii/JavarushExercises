package com.astamatii.javarushexc.javacore.L10.lesson_07;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//Сделайте (переопределите метод readObject) так, чтобы после инициализации 
// объекта типа Solution посредством десериализации нить runner запускалась автоматически.
//Ключевые слова объекта runner менять нельзя.
//
//Подсказка: конструктор не вызывается при десериализации, только инициализируются все поля.

public class L10_7_SerializableExternalizable_5 implements Runnable {
    private Thread runner;
    private int speed;

    public L10_7_SerializableExternalizable_5(int speed) {
        this.speed = speed;
        runner = new Thread(this);
        runner.start();
    }

    public void run() {
        // do something here, doesn't matter what
    }

    /**
     * Переопределяем сериализацию.
     * Для этого необходимо объявить методы:
     * private void writeObject(ObjectOutputStream out) throws IOException
     * private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException
     * Теперь сериализация/десериализация пойдет по нашему сценарию :)
     */
    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
    }

    public static void main(String[] args) {

    }
}

package com.astamatii.javarushexc.javacore.L07.lesson_10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Реализуй интерфейс Runnable в классах Apteka и Person.
//Все нити должны работать пока не isStopped.
//Логика для Apteka: drugsController должен сделать продажу (вызвать метод void sell(Drug drug, int count)) 
//	случайного лекарства (getRandomDrug) в количестве (getRandomCount) и подождать 300 мс.
//Логика для Person: drugsController должен сделать покупку (вызвать метод void buy(Drug drug, int count)) 
//	случайного лекарства (getRandomDrug) в количестве (getRandomCount) и подождать 100 мс.
//Расставь synchronized там, где это необходимо.

public class L7_10_06_Thread {
    public static DrugsController drugsController = new DrugsController();
    public static boolean isStopped = false;

    public static void main(String[] args) throws InterruptedException {
        Thread apteka = new Thread(new Apteka(), "Apteka");
        Thread man = new Thread(new Person(), "Мужчина");
        Thread woman = new Thread(new Person(), "Женщина");

        apteka.start();
        man.start();
        woman.start();

        Thread.sleep(1000);
        isStopped = true;
    }

    public static class Apteka implements Runnable {

		@Override
		public void run() {
			while(!isStopped) {
				drugsController.sell(getRandomDrug(), getRandomCount());
				
				waitAMoment();
				waitAMoment();
				waitAMoment();
			}
		}

    }

    public static class Person implements Runnable {

		@Override
		public void run() {
			while (!isStopped) {
				drugsController.buy(getRandomDrug(), getRandomCount());
				
				waitAMoment();
			}
		}

    }

    public static int getRandomCount() {
        return (int) (Math.random() * 3) + 1;
    }

    public static Drug getRandomDrug() {
        int index = (int) ((Math.random() * 1000) % (DrugsController.allDrugs.size()));
        List<Drug> drugs = new ArrayList<>(DrugsController.allDrugs.keySet());
        return drugs.get(index);
    }

    private static void waitAMoment() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
        }
    } 
}

class Drug {
    private String name;
    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}  

class DrugsController {
    public static Map<Drug, Integer> allDrugs = new HashMap<Drug, Integer>();   // <Лекарство, Количество>

    static {
        Drug panadol = new Drug();
        panadol.setName("Панадол");
        allDrugs.put(panadol, 5);

        Drug analgin = new Drug();
        analgin.setName("Анальгин");
        allDrugs.put(analgin, 18);

        Drug placebo = new Drug();
        placebo.setName("Плацебо");
        allDrugs.put(placebo, 1);
    }

    public synchronized void buy(Drug drug, int count) {
        String name = Thread.currentThread().getName();
        if (!allDrugs.containsKey(drug)) {
            System.out.println("Нет в наличии");
        }
        Integer currentCount = allDrugs.get(drug);
        if (currentCount < count) {
            System.out.println(String.format("%s хочет %s %d шт. В наличии - %d", name, drug.getName(), count, currentCount));
        } else {
            allDrugs.put(drug, (currentCount - count));
            System.out.println(String.format("%s купил(а) %s %d шт. Осталось - %d", name, drug.getName(), count, (currentCount - count)));
        }
    }

    public synchronized void sell(Drug drug, int count) {
        System.out.println(Thread.currentThread().getName() + " Закупка " + drug.getName() + " " + count);
        if (!allDrugs.containsKey(drug)) {
            allDrugs.put(drug, 0);
        }
        Integer currentCount = allDrugs.get(drug);
        allDrugs.put(drug, (currentCount + count));
    }
}      
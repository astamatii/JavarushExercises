package com.astamatii.javarushexc.javasyntaxzero.L9.lesson_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

//Современный мир отказывается от двигателей внутреннего сгорания, и эра электрокаров не за горами. 
//Нужно, чтобы наша программа могла отфильтровать электрокары от всех остальных автомобилей.
//
//Для этих целей есть метод onlyElectricCars(ArrayList<Car>), 
// который фильтрует список автомобилей, получаемых в качестве входящего параметра.
//
//Этот метод возвращает поток отфильтрованных данных, а именно — поток автомобилей,
// у которых поле isElectric равно true. В этом тебе поможет метод filter() объекта типа Stream<Car>.
//
//Метод main() не принимает участие в тестировании.

public class L9_4_Stream_2 {
    public static void main(String[] args) {
        var cars = new ArrayList<Car>();
        Collections.addAll(cars,
                new Car("Range Rover", false),
                new Car("Model S", true),
                new Car("Navigator", false),
                new Car("Model 3", true),
                new Car("Camaro", false),
                new Car("Escalade", false),
                new Car("Mustang", false),
                new Car("Model X", true),
                new Car("X5", false),
                new Car("Model Y", true));

        var carStream = onlyElectricCars(cars);
        carStream.forEach(System.out::println);
    }

    public static Stream<Car> onlyElectricCars(ArrayList<Car> cars) {
        //напишите тут ваш код
        return cars.stream().filter(x -> x.isElectric());
    }
}

class Car {
    private String model;
    private boolean isElectric;

    public Car(String model, boolean isElectric) {
        this.model = model;
        this.isElectric = isElectric;
    }

    public String getModel() {
        return model;
    }

    public boolean isElectric() {
        return isElectric;
    }

    @Override
    public String toString() {
        return "Car " + model + ", electric - " + isElectric;
    }        
}
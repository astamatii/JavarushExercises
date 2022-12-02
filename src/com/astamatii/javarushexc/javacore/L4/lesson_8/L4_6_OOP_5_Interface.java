package com.astamatii.javarushexc.javacore.L4.lesson_8;

//Давай соберем компьютер. Вот что тебе нужно сделать:
//1. Создай интерфейс CompItem.
//2. Добавь в него метод String getName().
//3. Создай классы Keyboard, Mouse, Monitor, которые реализуют интерфейс CompItem.
//4. Метод getName() должен возвращать имя класса, например, для класса Keyboard будет "Keyboard".
//5. Создай класс Computer.
//6. В класс Computer добавь приватное поле keyboard типа Keyboard.
//7. В класс Computer добавь приватное поле mouse типа Mouse.
//8. В класс Computer добавь приватное поле monitor типа Monitor.
//9. Создай конструктор с тремя параметрами в классе Computer 
// 	используя комбинацию клавиш Alt+Insert (для Windows) внутри класса (команда Constructor).
//10. Внутри конструктора инициализируйте все три поля (переменных) класса 
// 	в соответствии с переданными параметрами.
//11. Создай геттеры для полей класса Computer 
// 	(в классе используй комбинацию клавиш Alt+Insert (для Windows) и выбери команду Getter).
//12. Все созданные классы и интерфейс должны быть в отдельных файлах.

public class L4_6_OOP_5 {
    public static void main(String[] args) {
        Computer computer = new Computer(new Keyboard(), new Mouse(), new Monitor());
        if (isWork(computer.getKeyboard()) &&
                isWork(computer.getMonitor()) &&
                isWork(computer.getMouse())) {
            System.out.println("Work!");
        }
    }

    public static boolean isWork(CompItem item) {
        System.out.println(item.getName());
        return item.getName() != null && item.getName().length() > 4;
    }    
}

interface CompItem {
	String getName();
}

class Keyboard implements CompItem {

	@Override
	public String getName() {
		return "Keyboard";
	}	
}

class Mouse implements CompItem {

	@Override
	public String getName() {
		return "Mouse";
	}	
}

class Monitor implements CompItem {

	@Override
	public String getName() {
		return "Monitor";
	}	
}

class Computer {
	private Keyboard keyboard;
	private Mouse mouse;
	private Monitor monitor;

	public Computer(Keyboard keyboard, Mouse mouse, Monitor monitor) {
		this.keyboard = keyboard;
		this.mouse = mouse;
		this.monitor = monitor;
	}

	public Keyboard getKeyboard() {
		return keyboard;
	}

	public Mouse getMouse() {
		return mouse;
	}
	
	public Monitor getMonitor() {
		return monitor;
	}
}


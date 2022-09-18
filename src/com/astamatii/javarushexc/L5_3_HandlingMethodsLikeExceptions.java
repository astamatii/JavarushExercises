package com.astamatii.javarushexc;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class L5_3_HandlingMethodsLikeExceptions {

	public static final String INPUT_NAME = "\nВведите имя: ";
	public static final String INPUT_AGE = "Введите возраст пользователя '%s': ";

	public static final String CANNOT_BE_NULL = "Имя не может быть null.";
	public static final String CANNOT_BE_EMPTY = "Имя не может быть пустым.";
	public static final String CANNOT_CONTAIN_DIGIT = "Имя не может содержать цифры.";
	public static final String CANNOT_BE_NEGATIVE = "Возраст не может быть меньше 0.";
	public static final String CANNOT_BE_TOO_BIG = "Возраст не может быть больше 150.";
	public static final String UNKNOWN_ERROR = "Неизвестная ошибка.";

	public static final String FOUND = "\nПользователь '%s' найден под индексом %d.\n";
	public static final String NOT_FOUND = "\nПользователь '%s' не найден.\n";

	static List<User> users = new ArrayList<>();
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			addUser(new User());
		}

		User userToSearch = new User();
		userToSearch.setName("Рафаэль");

		findUserIndex(userToSearch);
	}

	static void addUser(User user) {
		System.out.print(INPUT_NAME);
		String name = scanner.nextLine();

		System.out.printf(INPUT_AGE, name);
		int age = Integer.parseInt(scanner.nextLine());

		// напишите тут ваш код
		int codeSetName = user.setName(name);
		if (codeSetName == -1) {
			System.out.printf(CANNOT_BE_NULL);
		} else if (codeSetName == -2) {
			System.out.printf(CANNOT_BE_EMPTY);
		} else if (codeSetName == -3) {
			System.out.printf(CANNOT_CONTAIN_DIGIT);
		} else if (codeSetName != 0) {
			System.out.printf(UNKNOWN_ERROR);
		}

		int codeSetAge = user.setAge(age);
		if (codeSetAge == -1) {
			System.out.printf(CANNOT_BE_NEGATIVE);
		} else if (codeSetAge == -2) {
			System.out.printf(CANNOT_BE_TOO_BIG);
		} else if (codeSetAge != 0) {
			System.out.printf(UNKNOWN_ERROR);
		}
				
		users.add(user);
	}

	static void findUserIndex(User user) {
		// напишите тут ваш код
		if (users.indexOf(user) == -1)
			System.out.printf(NOT_FOUND, user.getName());
		else
			System.out.printf(FOUND, user.getName(), users.indexOf(user));
	}
}

class User {

	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public int setName(String name) {
		if (name == null) {
			return -1;
		} else if (name.isEmpty()) {
			return -2;
		} else if (name.matches(".*\\d.*")) {
			return -3;
		} else {
			this.name = name;
			return 0;
		}
	}

	public int getAge() {
		return age;
	}

	public int setAge(int age) {
		if (age < 0) {
			return -1;
		} else if (age > 150) {
			return -2;
		} else {
			this.age = age;
			return 0;
		}
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof User)) {
			return false;
		}
		User user = (User) o;
		return Objects.equals(getName(), user.getName());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getName());
	}
}

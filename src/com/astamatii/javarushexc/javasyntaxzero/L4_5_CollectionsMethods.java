package com.astamatii.javarushexc.javasyntaxzero;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class L4_5_CollectionsMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// I
		System.out.println("I._________________________\naddAll(list, String...)");

		ArrayList<String> list = new ArrayList<>();
		addAll(list, "hi", "hello", "Greetings");
		print(list);

		System.out.println("_________________________\ncopy(to list2, from list)");
		ArrayList<String> list2 = new ArrayList<>();
		Collections.addAll(list2, null, null, null);
		copy(list2, list);
		print(list2);

		System.out.println("_________________________\nreplaceAll ('hi' with 'hey')");
		replaceAll(list, "hi", "hey");
		print(list);

		// II
		System.out.println("\nII._________________________\nInitial");
		ArrayList<Integer> list3 = new ArrayList<>();
		Collections.addAll(list3, 45, -23, 34, -34, 0);
		print(list3);

		System.out.println("_________________________\nreverse(list3)");
		reverse(list3);
		print(list3);

		System.out.println("_________________________\nsort(list3)");
		sort(list3);
		print(list3);

		System.out.println("_________________________\nrotate(list3,dimension)");
		rotate(list3, 3);
		print(list3);

		System.out.println("_________________________\nshuffle(list3)");
		shuffle(list3);
		print(list3);

		// III
		System.out.println("\nIII_________________________\nmin(list3)");
		System.out.println(min(list3));

		System.out.println("_________________________\nmin(list3)");
		System.out.println(max(list3));

		System.out.println("_________________________\nfrequency(list3, number 0)");
		System.out.println(frequency(list3, 0));

		System.out.println("_________________________\nbinarySearch(list, number 0)");
		sort(list3);
		System.out.println(binarySearch(list3, 0));
	}

	// I
	public static void copy(ArrayList<String> destination, ArrayList<String> source) {
		Collections.copy(destination, source);
	}

	public static void addAll(ArrayList<String> list, String... strings) { // String... - posibility to enumerate via
																			// comma: "string1", "string2", "string3"...
		Collections.addAll(list, strings);
	}

	public static void replaceAll(ArrayList<String> list, String oldValue, String newValue) {
		Collections.replaceAll(list, oldValue, newValue);
	}

	// II
	public static void reverse(ArrayList<Integer> list) {
		Collections.reverse(list);
	}

	public static void sort(ArrayList<Integer> list) {
		Collections.sort(list);
	}

	public static void rotate(ArrayList<Integer> list, int distance) {
		Collections.rotate(list, distance);
	}

	public static void shuffle(ArrayList<Integer> list) {
		Collections.shuffle(list);
	}

	// print ArrayList
	public static <T> void print(ArrayList<T> words) {
		Iterator<T> it = words.iterator();

		while (it.hasNext())
			System.out.println(it.next());
	}

	// III
	public static Integer min(ArrayList<Integer> list) {
		return Collections.min(list);
	}

	public static Integer max(ArrayList<Integer> list) {
		return Collections.max(list);
	}

	public static int frequency(ArrayList<Integer> list, Integer element) {
		return Collections.frequency(list, element);
	}

	public static int binarySearch(ArrayList<Integer> list, Integer key) {
		return Collections.binarySearch(list, key);
	}
}

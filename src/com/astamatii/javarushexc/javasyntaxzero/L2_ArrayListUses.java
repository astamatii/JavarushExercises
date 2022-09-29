package com.astamatii.javarushexc.javasyntaxzero;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class L2_ArrayListUses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arrayList = new ArrayList<>() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			{
				add(5);
				add(4);
				add(3);
				add(2);
				add(1);
				add(0);
			}
		};

		arrayList.remove(3);

		for (Integer i : arrayList) {
			System.out.println(i);
		}

		System.out.println("__________________");

		int[][][] arr1 = new int[][][] { { { 1, 1 }, { 1, 1 }, { 1, 1 } }, { { 1, 1 }, { 1, 1 }, { 1, 1 } },
				{ { 1, 1 }, { 1, 1 }, { 1, 1 } } };
		int[][][] arr2 = new int[][][] { { { 1, 1 }, { 1, 1 }, { 1, 1 } }, { { 1, 1 }, { 1, 1 }, { 1, 1 } },
				{ { 1, 1 }, { 1, 1 }, { 1, 1 } } };

		Integer[] arr3 = new Integer[] { 1, 2, 3 };
		Integer[] arr4 = new Integer[] { 1, 2, 4 };

		System.out.println(Arrays.equals(arr3, arr4));
		System.out.println(Arrays.deepEquals(arr3, arr4));

		System.out.println(Arrays.equals(arr1, arr2));
		System.out.println(Arrays.deepEquals(arr1, arr2));

		ArrayList<Integer> list = new ArrayList<Integer>();
		Collections.addAll(list, 11, 2, 23, 5, 15, 4, 2, 4);

		Collections.sort(list); // 2, 2, 4, 4, 5, 11, 15, 23

		int index = Collections.binarySearch(list, 11);
		System.out.println(index);

		System.out.println("__________________");

		List<String> names = Arrays.asList("John", "Sara", "Jack");
		for (Iterator i = names.iterator(); /* continue if */ i.hasNext(); /* skip increment */) {
			String name = (String) i.next();
			System.out.println("Name = " + name);
		}

		System.out.println("__________________");
		Iterator<Integer> it = arrayList.iterator();
		System.out.println(it.next() + " - removing using iterator it.remove()");
		it.remove();
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println("After removing, printing the list again:");
		for (Integer i : arrayList) {
			System.out.println(i);
		}

		System.out.println("__________________");
		names = new ArrayList<>(names); // - THAT`S IMMUTABLE, FIXED-SIZE LIST
		Iterator<String> iterator = names.iterator();
		// names.add("modcount++"); // - THIS WON`T WORK!!!
		System.out.println(iterator.next()); // First value
		iterator.remove(); // - THIS WILL WORK
		iterator = names.iterator(); // Start the iterator again
		System.out.println(iterator.next()); // First value

		System.out.println("__________________");
		Iterator<String> iterator1 = names.iterator();
		Iterator<String> iterator2 = names.iterator();
		iterator1.next();
		iterator1.remove();
		// System.out.println(iterator2.next()); //- THIS WON`T WORK!!!

		// HOW LAMBDA WORKS:
		System.out.println("__________________");
		Consumer consumerExtend = new Consumer() { // CONSUMER (LIKE DELEGATE FUNCTION FOR EACH ELEMENT IN COLLECTION)
			@Override
			public void accept(Object o) {
				System.out.println(o);
			}
		};
		// OR by LAMBDA EXPR:
		Consumer consumer = /* INPUT: */(obj) -> /* OUTPUT: */System.out.println(obj);
		arrayList.forEach(consumer);

		System.out.println("__________________");
		names = Arrays.asList("John", "Sara", "Jack");
		names = new ArrayList(names);
		Predicate predicate = (obj) -> obj.equals("John"); // PREDICATE (LIKE DELEGATE FUNCTION FOR ONE ELEMENT IN
															// COLLECTION)
		names.removeIf(predicate); // DELETE "John"
		names.forEach(consumer);

		// Let`s code THIS
		System.out.println("__________________");
		names = Arrays.asList("John", "Sara", "Jack");
		names = new ArrayList(names);
		iterator = names.iterator();
		iterator.next(); // Курсор на John
		while (iterator.hasNext()) {
			iterator.next(); // Следующий элемент
			iterator.remove(); // Удалили его
		}
		System.out.println(names);

		// OR with LAMBDA EXPR
		names = Arrays.asList("John", "Sara", "Jack");
		names = new ArrayList(names);
		Iterator<String> iterato = names.iterator();
		iterato.next(); // Курсор на John
		// iterato.forEachRemaining(obj -> iterato.remove()); // - THIS WON`T WORK
		// BECAUSE OF Java 8 problem. It is SOLVED in Java 9.
		System.out.println(names);

		// OR using STREAM API:
		System.out.println("__________________\nUsing Stream API:");
		names = new ArrayList(Arrays.asList("John", "Sara", "Jack"));
		Stream<String> stream = names.stream();
		stream.forEach(obj -> System.out.println(obj));

	}

}

package com.astamatii.javarushexc.javasyntaxzero.L4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class L4_4_CollectionsForForEachIterator {

	public static void main(String[] args) {
		// I
		System.out.println("I.__________________________________");
		HashSet<String> wordsHS = new HashSet<>(Arrays.asList("Программированию обычно учат на примерах.".split(" ")));
		print(wordsHS);
		System.out.println("\nII.__________________________________");

		// II
		String[] wordsArray = "Думаю, это будет новой фичей. Только не говорите никому, что она возникла случайно."
				.split(" ");
		ArrayList<String> wordsList = new ArrayList<>(Arrays.asList(wordsArray));
		HashSet<String> wordsHashSet = new HashSet<>(wordsList);
		printList(wordsList);
		System.out.println("__________________________________");
		printHashSet(wordsHashSet);
		System.out.println("\nIII.__________________________________");

		// III
		ArrayList<String> words = new ArrayList<>();
		Collections.addAll(words, new String[] { "Hello world!", "Amigo", "Elly", "Kerry", "Bug", "bug", "bUG", "bug",
				"Easy ug", "Risha" });

		ArrayList<String> copyWordsFirst = new ArrayList<>(words);
		ArrayList<String> copyWordsSecond = new ArrayList<>(words);
		ArrayList<String> copyWordsThird = new ArrayList<>(words);

		removeBugWithFor(copyWordsFirst);
		removeBugWithWhile(copyWordsSecond);
		removeBugWithCopy(copyWordsThird);

		String line = "_________________________";

		printList(words);
		System.out.println(line);
		copyWordsFirst.forEach(System.out::println);
		System.out.println(line);
		copyWordsSecond.forEach(System.out::println);
		System.out.println(line);
		copyWordsThird.forEach(System.out::println);
		System.out.println(line);
	}

	// I
	// print hashset by iterator
	public static void print(HashSet<String> words) {
		Iterator<String> it = words.iterator();

		while (it.hasNext())
			System.out.println(it.next());
	}

	// II
	// print arraylist using for-each
	public static void printList(ArrayList<String> words) {
		for (String word : words) {
			System.out.println(word);
		}
	}

	// print hashset using for-each
	public static void printHashSet(HashSet<String> words) {
		for (String word : words) {
			System.out.println(word);
		}
	}

	// III
	public static ArrayList<String> bugs = new ArrayList<>() {
		{
			add("bug");
			add("Bug");
			add("bUg");
			add("buG");
			add("BUg");
			add("bUG");
			add("BUG");
		}
	};

	public static String bug = "bug";

	// remove bug using for loop
	public static void removeBugWithFor(ArrayList<String> list) {
		// напишите тут ваш код
		for (int i = 0; i < list.size(); i++) {
			if (bug.equalsIgnoreCase(list.get(i))) {
				list.remove(i);
				i--;
			}
		}
	}

	// remove bug using while loop and iterator
	public static void removeBugWithWhile(ArrayList<String> list) {
		// напишите тут ваш код
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			if (bugs.contains(it.next()))
				it.remove();
		}
	}

	// remove bug using for-each and copy of array list
	public static void removeBugWithCopy(ArrayList<String> list) {
		// напишите тут ваш код
		ArrayList<String> listcopy = new ArrayList<>(list);
		for (String s : listcopy) {
			if (bugs.contains(s))
				list.remove(s);
		}

	}

}

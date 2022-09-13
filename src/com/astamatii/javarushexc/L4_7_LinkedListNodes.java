package com.astamatii.javarushexc;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class L4_7_LinkedListNodes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringsLinkedList stringsLinkedList = new StringsLinkedList();
		stringsLinkedList.add("1");
		stringsLinkedList.add("2");
		stringsLinkedList.add("3");
		stringsLinkedList.add("4");
		stringsLinkedList.add("5");
		stringsLinkedList.add("6");
		stringsLinkedList.add("7");
		stringsLinkedList.add("8");
		stringsLinkedList.add("9");
		stringsLinkedList.printAll();

		System.out.println("-1. " + stringsLinkedList.get(-1));
		System.out.println("0. " + stringsLinkedList.get(0));
		System.out.println("1. " + stringsLinkedList.get(1));
		System.out.println("4. " + stringsLinkedList.get(4));
		System.out.println("8. " + stringsLinkedList.get(8));
		System.out.println("9. " + stringsLinkedList.get(9));
		System.out.println("10. " + stringsLinkedList.get(10));
		System.out.println("15. " + stringsLinkedList.get(15));

//		System.gc();
//		System.out.println();
//		System.out.println("LinkedList vs ArrayList (adding to the center of list):");
//		List<Integer> list = new LinkedList<>();
//
//		for (int i = 0; i < 5_000_000; i++) {
//			list.add(new Integer(i));
//		}
//
//		long start = System.currentTimeMillis();
//
//		for (int i = 0; i < 100; i++) {
//			list.add(2_000_000, new Integer(Integer.MAX_VALUE));
//		}
//		System.out.println("Время работы для LinkedList (в милисекундах) = " + (System.currentTimeMillis() - start));
//
//		System.gc();
//		List<Integer> list2 = new ArrayList<>();
//
//		for (int i = 0; i < 5_000_000; i++) {
//			list2.add(new Integer(i));
//		}
//
//		long start2 = System.currentTimeMillis();
//
//		for (int i = 0; i < 100; i++) {
//			list2.add(2_000_000, new Integer(Integer.MAX_VALUE));
//		}
//		System.out.println("Время работы для ArrayList (в милисекундах) = " + (System.currentTimeMillis() - start2));

		System.out.println();
		System.out.println("Adding to the first position:");
		System.out.print("Arraylist - ");
		System.gc();
		getTimeMsOfInsertFirst(new ArrayList());
		System.out.print("Linkedlist - ");
		System.gc();
		getTimeMsOfInsertFirst(new LinkedList());
		
		System.out.println();
		System.out.println("Adding to the central position :");
		
		System.out.print("Arraylist - ");
		System.gc();		
		getTimeMsOfInsertCenter(new ArrayList());
		System.out.print("Linkedlist - ");
		System.gc();
		getTimeMsOfInsertCenter(new LinkedList());

	}

	public static long getTimeMsOfInsertCenter(List list) {
		// напишите тут ваш код
		for (int i = 0; i < 5_000_000; i++) {
			list.add(new Integer(i));
		}
		Date currentTime = new Date();
		for (int i = 0; i < 100; i++) {
			list.add(2_000_000, new Integer(Integer.MAX_VALUE));
		}
		Date newTime = new Date();
		long msDelay = newTime.getTime() - currentTime.getTime(); // вычисляем разницу
		System.out.println("Результат в миллисекундах: " + msDelay);
		return msDelay;

	}
	
	public static long getTimeMsOfInsertFirst(List list) {
		// напишите тут ваш код
		Date currentTime = new Date();
		for (int i = 0; i < 100000; i++) {
			list.add(0, new Object());
		}
		Date newTime = new Date();
		long msDelay = newTime.getTime() - currentTime.getTime(); // вычисляем разницу
		System.out.println("Результат в миллисекундах: " + msDelay);
		return msDelay;

	}
}

class StringsLinkedList {
	private Node first = new Node();
	private Node last = new Node();

	public void printAll() {
		Node currentElement = first.next;
		while ((currentElement) != null) {
			System.out.println(currentElement.value);
			currentElement = currentElement.next;
		}
	}

	public void add(String value) {
		// напишите тут ваш код
		Node node = new Node();
		node.value = value;
		if (first.next == null) {
			node.prev = first;
			first.next = node;
			node.next = last;
			last.prev = node;
		} else {
			last.prev.next = node;
			node.prev = last.prev;
			last.prev = node;
		}
	}

	public String get(int index) {
		// напишите тут ваш код
		Node node = new Node();
		if (index >= 0) {
			node = first.next;
			int i = 0;
			while (i < index) {
				if (node.next != null)
					node = node.next;
				else {
					node = last;
					break;
				}
				i++;
			}
		}

		return node.value;

	}

	public static class Node {
		private Node prev;
		private String value;
		private Node next;
	}
}
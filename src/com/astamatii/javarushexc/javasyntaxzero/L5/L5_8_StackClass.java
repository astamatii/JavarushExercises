package com.astamatii.javarushexc.javasyntaxzero.L5;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;


public class L5_8_StackClass {

	public static void main(String[] args) {
		// Real stack (Push is adding at last queue position)
		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		System.out.println("Real Stack: " + stack.toString());
		System.out.println("2 x stack.pop() : " + stack.pop() + ", " + stack.pop());
		System.out.println("Stack after pop: " + stack.toString());
		
		// MyStack (Push is adding at first queue position)
		MyStack myStack = new MyStack();
		myStack.push("abc");
		myStack.push("def");
		myStack.push("ghi");
		myStack.push("klm");
		System.out.println("\nMyStack: " + myStack.toString());	
		System.out.println("Search ghi: " + myStack.search("ghi"));
		System.out.println("Search hi: " + myStack.search("hi"));
		System.out.println("2 x stack pop() : " + myStack.pop() + ", " + myStack.pop());
		System.out.println("Stack after pop: " + myStack.toString());
		System.out.println("myStack.empty(): " + myStack.empty());
	}
		

}

class MyStack {

    private final List<String> storage = new LinkedList<>();

    public void push(String s) {
        //напишите тут ваш код
    	this.storage.add(0, s);
    }

    public String pop() {
        //напишите тут ваш код
    	return this.storage.remove(0);
    }

    public String peek() {
        //напишите тут ваш код
    	return this.storage.get(0);
    }

    public boolean empty() {
        //напишите тут ваш код
    	return this.storage.isEmpty();
    }

    public int search(String s) {
        //напишите тут ваш код
    	return this.storage.indexOf(s);
    }
    
    @Override
    public String toString() {
    	return this.storage.toString();
    }
}
































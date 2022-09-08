package com.astamatii.javarushexc;

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
        //напишите тут ваш код        
        Node node = new Node();  
        node.value = value;
        if(first.next == null){
            node.prev = first;
            first.next = node;
            node.next = last;
            last.prev = node;           
        }
        else {
            last.prev.next = node; 
            node.prev = last.prev; 
            last.prev = node; 
        }                    
    }
    
    public String get(int index) {
        //напишите тут ваш код
    	Node node = new Node();
    	if(index >= 0) {
    		node = first.next;
        	int i = 0;
        	while (i < index) {
        		if(node.next != null)
        			node = node.next;
        		else {node = last; break;}
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
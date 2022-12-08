package com.astamatii.javarushexc.javacore.L5;

import com.astamatii.javarushexc.javacore.L5.Child.OOP_Child;
import com.astamatii.javarushexc.javacore.L5.Parent.OOP_Parent;

public class OOP_Experiments {
//	public static void print(long n) {
//		System.out.println("long");
//	}

//	public static void print(short n) {
//		System.out.println("short");
//	}

	public static void print(Integer n) {
		System.out.println("Integer");
	}
	
	public static void print(Long n) {
		System.out.println("Long");
	}
	
//	public static void print(float n) {
//		System.out.println("float");
//	}
	
//	public static void print(double n) {
//		System.out.println("double");
//	}
	
//	public static void print(Double n) {
//		System.out.println("Double");
//	}
	
	public static void print(Float n) {
		System.out.println("Float");
	}

	public static void print(String s) {
		System.out.println("String");
	}

	public static void main(String[] args) {
		//в процессе определения метода, который нужно вызвать, типы могут только расширяться, но не сужаться.
		//OOP_Experiments.print(1);			//print(int n)
		//OOP_Experiments.print((short)1); 	//print(short n)
		OOP_Experiments.print("1");			//print(String n)
		//OOP_Experiments.print(null); 		//ambiguous(неопределенность)
		OOP_Experiments.print((Integer)null); //or (String null)
		OOP_Experiments.print(2.3f);
		
		Methods.print((byte) 1);	//print(short)
		Methods.print(1);  			//print(Integer) - преобразование из int в Integer (потому что не разрешено ссужение)
		
		//Shorty.print(1);  //ERROR! int values cannot be applicable to short arguments (auto downcast in restricted here)
		
		Refs.print(1);		//print(Object o) - Upcast from int to Integer, then to Object
		Refs.print(null);	//print(String s)
		
		//OOP Child and Parent: Downcasting type of the parent method in child class
		OOP_Child kid = new OOP_Child();
		OOP_Parent dad = new OOP_Child();
		 dad.setMyParent(kid); //Easily using downcasted value (kid) for argument
		OOP_Parent  dad2 = dad.getMyParent(); //Easily assigned downcasted value (kid) to a parent object
				
		//OOP Child and Parent: method visibility changing:
		OOP_Parent parent = new OOP_Parent();
		 //parent.getName(); 	//ERROR! Method is not visible.
		OOP_Child child = new OOP_Child(); //Visibility is taken from OOP_Child
		 child.getName(); 		//Is visible everywhere, because of public
		 OOP_Parent parent2 = new OOP_Child(); //Visibility is taken from OOP_Parent
		 //parent2.getName();		//ERROR! Method is not visible
		 
		 //OOP Child and Parent: constructor order
		 System.out.println("\nTesting parent and child constructor:");
		 OOP_Child test = new OOP_Child(1);
		 System.out.println(test.hi); // It anyway will run parent constructor 
		 
		 //Method overloading in OOP_Child
		 test.print(new OOP_Child());
		 test.print(new OOP_Parent());
		 test.print(new Object());

	}
}

class Refs {
	 public static void print(Object o)
	 {
	  System.out.println("Object");
	 }
	 public static void print(String s)
	 {
	  System.out.println("String");
	 }
}

class Shorty {
	public static void print(short n) {
		System.out.println("short");
	}
}

class Methods {
	public static void print(short n) {
		System.out.println("short");
	}

	public static void print(Integer n) {
		System.out.println("Integer");
	}	
}
package com.astamatii.javarushexc.javacore.L5;

public class InitializingOrder {

	public static void main(String[] args) {
		new A().print();
		A.sprint();
		//System.out.println(A.str1);
		System.out.println();
		
		new B().print();
		
	}

}

class B {
	String str = "Instance field B";
	
	static String str1 = "Static field B";
	
	static {
		String str2 = "Field in static block before constructor B";
		System.out.println(str2);
	}
	
	{
		String str3 = "Field in instance block before constructor B";
		System.out.println(str3);
	}
	
	B() {
		System.out.println("Constructor B()");
	}
	
	static {
		String str2 = "Field in static block after constructor B";
		System.out.println(str2);
	}
	
	{
		String str3 = "Field in instance block after constructor B";
		System.out.println(str3);
	}
	
	static void sprint() {
		System.out.println("Static Method B");
	}
	
	void print() {
		System.out.println("Instance Method B");
	}
}

class A extends B {
	
	String str = "Instance field A";
	
	static String str1 = "Static field A";
	
	static {
		String str2 = "Field in static block before constructor A";
		System.out.println(str2);
	}
	
	{
		String str3 = "Field in instance block before constructor A";
		System.out.println(str3);
	}
	
	A() {
		System.out.println("Constructor A()");
	}
	
	static {
		String str2 = "Field in static block after constructor A";
		System.out.println(str2);
	}
	
	{
		String str3 = "Field in instance block after constructor A";
		System.out.println(str3);
	}
	
	static void sprint() {
		System.out.println("Static Method A");
	}
	
	void print() {
		System.out.println("Instance Method A");
	}
	
	
}
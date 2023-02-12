package com.astamatii.javarushexc.javacore.L05;

public class InitializingOrder {

	public static void main(String[] args) {
//		System.out.println("\n----------------A.str1----------------");
//		
//		System.out.println(A.str1 + " from main()");
		
		System.out.println("\n----------------new A().str----------------");
		
		System.out.println(new A().str + " from main()");
		
		System.out.println("\n----------------new A().print()----------------");
		
		new A().print("from main()");
		
		System.out.println("\n----------------A.sprint()----------------");
		
		A.sprint("from main()");
		
		//System.out.println("\n----------------C.str1----------------");
		
		//System.out.println(C.str1 + " from main()");
		
		System.out.println("\n----------------new C().print()----------------");
		
		new C().print("from main()");
		
	}

}

abstract class B {
	String str = "Instance field B";
	
	static String str1 = "Static field B";
	
	static {
		String str2 = "Field in static block before constructor B";
		System.out.println(str1);
	}
	
	{
		String str3 = "Field in instance block before constructor B";
		System.out.println(str);
	}
	
	B() {
		System.out.println("Constructor B()");
		print(str);
		sprint("from constructor B");
		
		System.out.println();
		
	}
	
	static {
		String str2 = "Field in static block after constructor B";
		System.out.println(str2);
	}
	
	{
		String str3 = "Field in instance block after constructor B";
		System.out.println(str3);
	}
	
	//!!! private static method
	static void sprint(String str) {
		System.out.println("Static Method B " + str);
	}
	
	//!!! private instance method
	private void print(String str) {
		System.out.println("Instance Method B " + str);
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
		print("from constructor A");
		sprint("from constructor A");
		
		System.out.println();
	}
	
	static {
		String str2 = "Field in static block after constructor A";
		System.out.println(str2);
	}
	
	{
		String str3 = "Field in instance block after constructor A";
		System.out.println(str3);
	}
	
	static void sprint(String str) {
		System.out.println("Static Method A " + str);
	}
	
	void print(String str) {
		System.out.println("Instance Method A " + str);
	}	
}

class C extends A {
	
	String str = "Instance field C";
	
	static String str1 = "Static field C";
	
	static {
		String str2 = "Field in static block before constructor C";
		System.out.println(str2);
	}
	
	{
		String str3 = "Field in instance block before constructor C";
		System.out.println(str3);
	}
	
	C() {
		System.out.println("Constructor C()");
		print("from constructor C");
		sprint("from constructor C");
		
		System.out.println();
	}
	
	static {
		String str2 = "Field in static block after constructor C";
		System.out.println(str2);
	}
	
	{
		String str3 = "Field in instance block after constructor C";
		System.out.println(str3);
	}
	
	static void sprint(String str) {
		System.out.println("Static Method C " + str);
	}
	
	void print(String str) {
		System.out.println("Instance Method C " + str);
	}	
}
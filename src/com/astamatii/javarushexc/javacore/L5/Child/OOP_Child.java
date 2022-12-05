package com.astamatii.javarushexc.javacore.L5.Child;

import com.astamatii.javarushexc.javacore.L5.Parent.OOP_Parent;

public class OOP_Child extends OOP_Parent{
//	public Object getMyParent() //UpCast is not working ERROR!
//	 {
//	  if (this.parent != null)
//	   return this.parent;
//	  else
//	   return "Null value";
//	 }
	
	public OOP_Child() {}
	
	public OOP_Child(int a) {
		a = 3 + 2;
		System.out.println("Child Constructor");
	}
	
	public OOP_Child getMyParent() //DownCast WORKS!
	 {
		return (OOP_Child) this.parent;
	 }
	
	@Override
	public String getName() //Rising scope of the method from protected to public
	 {
	  return "Child";
	 }
	
	//Order for methods and fields:
	public int getSum() {
		return this.a + this.b;
	}
	
	public void printSum(int a, int b) { 	//No problems when fields are defined after methods
		System.out.println(getSum()); 		//There`s no matter in what order methods are defined
	}
	
	int a = 5;
	int b = a + 3;
//	int c = 3 + d;	// c doesn`t see d because it`s not defined before c
	int d = 2;
	
	//Experiments with internal class and modifiers:
	private void testInside() {
//		x = 12; 						//ERROR! default modifier variables are unreachable in child class in another package
//		i.i = 12; 						//ERROR! object declared in parent class from a private internal class 
										//is unreachable in child class
		i = null;						//but the variable is visible by its own;
//		OOP_Parent.Inside.static_i = 4; //ERROR! static variables of private internal class from parent class
										//is unreachable in child class
//		Inside2.static_i = 12; 			//ERROR! private variables of protected internal class from parent class
										//is unreachable in child class
//		Inside2 in = new Inside2();		//ERROR! protected constructor inside the protected internal class 
										//from parent class in unreachable in child class 
		int a = Inside2.g;				//public static fieds inside the protected internal class 
										//from parent class are reachable in child class
		Inside2 ins = new Inside2("");	//public constructor field inside the protected internal class 
										//from parent class are reachable in child class

	}
	
}

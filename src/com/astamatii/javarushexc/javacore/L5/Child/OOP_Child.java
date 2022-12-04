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
	
	//Order for methods and fields
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
	
	
}

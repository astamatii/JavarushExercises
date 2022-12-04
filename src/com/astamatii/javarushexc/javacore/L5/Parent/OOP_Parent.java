package com.astamatii.javarushexc.javacore.L5.Parent;

public class OOP_Parent {
	public OOP_Parent parent;

	public String hi;
	
	public OOP_Parent () {
		this.hi = "Hi!";
		System.out.println("Parent Constructor");
	}
	
	public OOP_Parent getMyParent() {
		return this.parent;
	}

	public void setMyParent(OOP_Parent parent) {
		this.parent = parent;
	}

	protected String getName() {
		return "Parent";
	}
}

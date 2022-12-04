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
	
	//Experiments with modifiers of internal class
	private void testInside() {
		i = new Inside(); 		//internal private class constructor is reachable
		i.i = 4;				//private object fields of internal private class are reachable
		Inside.static_i = 10; 	//private static fields of internal private class are reachable
	}
	
	protected Inside i = new Inside(); 	//internal private class constructor is reachable
										//it`s visible in OOP_Child, but all internal fields are unreachable
	int x = i.i; 				//private object fields of internal private class are reachable
								//x is not visible in OOP_Child because of default modifier
	
	private class Inside {		//All internal objects inside are not visible in OOP_Child!
		private int i = 10;
		public int j = 10;
		private static int static_i = 20;
	}
	protected class Inside2 {
		protected Inside2() {}		//it`s not visible in OOP_Child!
		public Inside2(String a) {} //to be visible in OOP_Child it should be public 
		protected int i = 10;
		public int j = 10;
		private static int static_i = 20;
		public static int g = 30;
	}
}

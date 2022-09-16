package com.astamatii.javarushexc;

public class L2_CharCompareCrazy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		compare('a', 'a');
		compare('а','б');
		compare('ы','я');
		compare('ы','ы');
		compare('ы','ы');
	}

	public static void compare(Character first, Character second) {
		if(first.equals(second))
			System.out.println("Equal");
		else if(first < second)
			System.out.println("Less");
		else if(first > second)
			System.out.println("Bigger");
		else
			System.out.println("wtf?");
	}

}

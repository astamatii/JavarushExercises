package com.astamatii.javarushexc;

import java.util.ArrayList;

public class L2_ArrayListUses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arrayList = new ArrayList<>()
				{/**
					 * 
					 */
					private static final long serialVersionUID = 1L;

				{
					add(5);
					add(4);
					add(3);
					add(2);
					add(1);
					add(0);
				}};
				
		arrayList.remove(3);
		
		for(Integer i : arrayList) {
			System.out.println(i);
		}
		

	}

}

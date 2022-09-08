package com.astamatii.javarushexc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

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
		
		System.out.println("__________________");
		
		int [][][] arr1 = new int[][][] {{{1,1},{1,1},{1,1}},{{1,1},{1,1},{1,1}},{{1,1},{1,1},{1,1}}};
		int [][][] arr2 = new int[][][] {{{1,1},{1,1},{1,1}},{{1,1},{1,1},{1,1}},{{1,1},{1,1},{1,1}}};
		
		Integer [] arr3 = new Integer[] {1,2,3};
		Integer [] arr4 = new Integer[] {1,2,4};
		
		System.out.println(Arrays.equals(arr3, arr4));
		System.out.println(Arrays.deepEquals(arr3, arr4));
		
		System.out.println(Arrays.equals(arr1, arr2));
		System.out.println(Arrays.deepEquals(arr1, arr2));
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		Collections.addAll(list, 11, 2, 23, 5, 15, 4, 2, 4);

		//Collections.sort(list);  // 2, 2, 4, 4, 5, 11, 15, 23

		int index = Collections.binarySearch(list, 11);    
		System.out.println(index);
		

	}

}

package com.astamatii.javarushexc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;


public class Main {

	public static void main(String[] args) {
		
		String[] names = {"John","Sara","Jack"};
		for (int i = 0; i < names.length; ++i) {
			System.out.println(names[i]);
		}
		System.out.println();
		for (int i = 0; i < names.length;) {
			System.out.println(names[i++]);
		}
	}

}

package com.astamatii.javarushexc.javacore.L05.lesson_12;

//Чтобы решить эту задачу:
//1. Создай 4 конструктора с разными модификаторами доступа в классе Solution.
//2. В отдельном файле создай класс SubSolution и сделай его потомком класса Solution.
//3. Внутри класса SubSolution создай конструкторы командой Alt+Insert -> Constructors.
//4. Исправь модификаторы доступа конструкторов в SubSolution так, чтобы получилось 3 разных (все, кроме private).

public class L5_12_OOP_08 {
    public static void main(String[] args) {

    }
}

class Solution {
	public Solution() {}
	protected Solution(int x) {}
	Solution(String s) {}
	private Solution(Solution s) {}
}

class SubSolution extends Solution {

	public SubSolution() {
		super();
	}

	protected SubSolution(int x) {
		super(x);
	}

	SubSolution(String s) {
		super(s);
	}
	
}

package com.astamatii.javarushexc.javacore.L5.lesson_4;

//Перегрузи метод printMatrix() 8 различными способами, 
//	чтобы в итоге у тебя получилось 10 различных методов printMatrix().

public class L5_4_MethodOverloading_2 {
    public static void main(String[] args) {
        printMatrix(2, 3, "8");
    }

    public static void printMatrix(int m, int n, String value) {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }     
}

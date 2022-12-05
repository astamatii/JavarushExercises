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
    
    public static void printMatrix(int m, int n, Integer value) {
        System.out.println("Заполняем объектами Integer");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, Double value) {
        System.out.println("Заполняем объектами Double");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, Boolean value) {
        System.out.println("Заполняем объектами Boolean");
        printMatrix(m, n, (Object) value);
    }
    
    public static void printMatrix(int m, int n, Float value) {
        System.out.println("Заполняем объектами Float");
        printMatrix(m, n, (Object) value);
    }
    
    public static void printMatrix(int m, int n, Short value) {
        System.out.println("Заполняем объектами Short");
        printMatrix(m, n, (Object) value);
    }
    
    public static void printMatrix(int m, int n, Long value) {
        System.out.println("Заполняем объектами Long");
        printMatrix(m, n, (Object) value);
    }
    
    public static void printMatrix(int m, int n, Character value) {
        System.out.println("Заполняем объектами Character");
        printMatrix(m, n, (Object) value);
    }
    
    public static void printMatrix(int m, int n, Byte value) {
        System.out.println("Заполняем объектами Byte");
        printMatrix(m, n, (Object) value);
    }
}

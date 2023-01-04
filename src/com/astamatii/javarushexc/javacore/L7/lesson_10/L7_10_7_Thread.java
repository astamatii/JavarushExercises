package com.astamatii.javarushexc.javacore.L7.lesson_10;

//Установить модификатор synchronized только тем методам, которым необходимо.
//Объект класса Solution будет использоваться нитями.

public class L7_10_7_Thread {
    private double param = Math.random();
    private StringBuilder sb = new StringBuilder();

    private void method0() {
        Double d = method3();
    }

    protected synchronized void method1(String param1) {
    	L7_10_7_Thread solution = new L7_10_7_Thread(); // Solution solution = new Solution();
        solution.method0();
    }

    public synchronized void method2(int param1) {
        param1++;
    }

    synchronized double method3() {
        double random = Math.random();
        param += 40.7;
        return random + param;
    }

    private void method4() {
        sb.append(1).append(1).append(1).append(1);
    }

    protected synchronized void method5(String param2) {
        new StringBuffer().append(param2).append(param2).append(param2);
    }

    public synchronized String method6(int param2) {
        System.out.println("Thinking....");
        method7(5e-2);
        sb = new StringBuilder("Got it!.");
        return sb.toString();
    }

    synchronized String method7(double param2) {
        return "" + param2;
    }

    public synchronized static void main(String[] args) {

    }  
}

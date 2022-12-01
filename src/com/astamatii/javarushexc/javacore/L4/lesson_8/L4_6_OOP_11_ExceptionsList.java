package com.astamatii.javarushexc.javacore.L4.lesson_8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

//Заполни список exceptions десятью различными исключениями.
//Первое исключение уже реализовано в методе initExceptions.

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Set;

public class L4_6_OOP_11_ExceptionsList {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();
        
        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        //напишите тут ваш код
        //2
        try {
        	float i = 1 / new int[] {1, 2, 3}[4];
        	
        } catch (ArrayIndexOutOfBoundsException e) {
        	exceptions.add(e);
        }
        //3
        try {
        	FileInputStream file = new FileInputStream("trulala");
        	file.close();
        	byte x = (byte) file.read();
        	
        } catch (FileNotFoundException e) {
        	exceptions.add(e);
        } catch (IOException e) {
        	exceptions.add(e);
        } 
        //4
        try {
        	String[] array = null;
        	System.out.println("Hi" + array.length);
        } catch (NullPointerException e) {
        	exceptions.add(e);
        } 
        //5
        try {
        	int i = Integer.parseInt("");
        } catch (NumberFormatException e) {
        	exceptions.add(e);
        }        
        //6
        try {
        	System.out.println(new URL("https://asdasdasddwqc").openConnection().getInputStream().read());
        } catch (UnknownHostException e) {
        	exceptions.add(e);
        } catch (MalformedURLException e) {
        	exceptions.add(e);
		} catch (IOException e) {
			exceptions.add(e);
		}
        //7
        try {
        	Scanner scan = new Scanner("hi");
        	scan.close();
        	String x = scan.nextLine();
        } catch (IllegalStateException e) {
        	exceptions.add(e);
        }  
        
        //7
        try {
            List names = new ArrayList<>();
            names.add("Eric");
            names.add("Sydney");

            Iterator iterator = names.iterator();

            while (iterator.hasNext()) {
              iterator.remove();
            }
        } catch (IllegalStateException e) {
        	exceptions.add(e);
        }
        //8
        try {
        	String a = "Hi!";
        	char c = a.charAt(5);
        } catch (StringIndexOutOfBoundsException e) {
        	exceptions.add(e);
        }
        //9
        try {
        	Set exampleleSet = new HashSet();
        	 
            Hashtable exampleTable = new Hashtable();
     
            exampleleSet.iterator().next();
           
            exampleTable.elements().nextElement();
        } catch (NoSuchElementException e) {
        	exceptions.add(e);
        }
        //10
        try{
            Class.forName("Class1");   // Class1 is not defined
        }
        catch(ClassNotFoundException e){
        	exceptions.add(e);
        }
        

    }    
}

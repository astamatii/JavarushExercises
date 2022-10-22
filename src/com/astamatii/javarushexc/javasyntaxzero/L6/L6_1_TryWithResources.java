package com.astamatii.javarushexc.javasyntaxzero.L6;

import java.io.FileOutputStream;
import java.io.IOException;

public class L6_1_TryWithResources {

	public static final String PATH = "C:\\Users\\Public\\Documents\\test.txt";
	
	public static void main(String[] args) {
		
		tryCatchFinally(PATH, 1);
		tryWithResources(PATH, 2);
		 
	}

	public static void tryCatchFinally(String path, int number) {
		FileOutputStream output = null;

		try {
			output = new FileOutputStream(path);
			output.write(number);
		} catch (IOException e) {
			System.out.println("tryCatchFinally() Exception: " + e);
		} finally {
			try {
				output.close();
				System.out.println("Try-Catch-Finally. (Finally Bloc)");
			} catch (NullPointerException | IOException e) {
				System.out.println("tryCatchFinally() Exception: " + e);
				e.printStackTrace();
			}							
		}
	}
	
	public static void tryWithResources(String path, int number) {
		try(FileOutputStream output = new FileOutputStream(path))
		{
		   output.write(number);
		} catch (IOException e) {
			System.out.println("tryWithResources() Exception: " + e);
		} finally {
			System.out.println("Try-With-Resources. (Finally Bloc)");
		}
	}

}

package com.astamatii.javarushexc;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class L6_1_TryWithMultipleResources {

	public static void main(String[] args) {
		String src = "c:\\projects\\log.txt";
		String dest = "c:\\projects\\copy.txt";

		// Try-With-Resources BEST FOR MULTIPLE RESOURCES
		try (FileInputStream input = new FileInputStream(src); FileOutputStream output = new FileOutputStream(dest)) {
			byte[] buffer = input.readAllBytes();
			output.write(buffer);
		} catch (IOException e) {
			System.out.println("Exception: " + e);
		}

		FileInputStream input = null;
		FileOutputStream output = null;

		// Try-Catch-Finally
		try {
			input = new FileInputStream(src);
			output = new FileOutputStream(dest);

			byte[] buffer = input.readAllBytes();
			output.write(buffer);
		} catch (IOException e) {
			System.out.println("Exception: " + e);
		} finally {
			try {
				input.close();
			} catch (NullPointerException | IOException e) {
				System.out.println("Exception: " + e);
			}
			try {
				output.close();
			} catch (NullPointerException | IOException e) {
				System.out.println("Exception: " + e);
			}
		}

	}

}

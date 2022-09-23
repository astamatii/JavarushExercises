package com.astamatii.javarushexc;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class L6_1_ConvertTryWithMultipleResources {

	public static void main(String[] args) {
		
		// AFTER
		try ( Scanner scanner = new Scanner(System.in); BufferedReader bufferedReader = Files.newBufferedReader(Path.of(scanner.nextLine()))) {
			String line;
			while ((line = bufferedReader.readLine()) != null) {
			    System.out.println(line);
			}
		} catch (IOException e) {
			System.out.println("Something went wrong : " + e);
		}
		
        // BEFORE
		Scanner scanner = null;
        BufferedReader bufferedReader = null;
        try {
            scanner = new Scanner(System.in);
            String fileName = scanner.nextLine();
            bufferedReader = Files.newBufferedReader(Path.of(fileName));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Something went wrong : " + e);
        } finally {
            if (scanner != null) {
                scanner.close();
            }
            if (bufferedReader != null) {
                try {
					bufferedReader.close();
				} catch (IOException e) {
					System.out.println("Something went wrong : " + e);
				}
            }
        }

	}

}

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
                 
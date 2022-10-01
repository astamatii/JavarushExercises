package com.astamatii.javarushexc.javasyntaxzero;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

public class L6_8_FileISVsBufferedIS {

	public static void main(String[] args) throws IOException {
		Date date = new Date();
		FileInputStream fileInputStream = new FileInputStream("D:\\Development\\Javarush\\file.txt");
		BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

		int i;

		while ((i = bufferedInputStream.read()) != -1) {

			System.out.print((char) i);
		}

		Date date1 = new Date();
		System.out.println("\n" + (date1.getTime() - date.getTime()));
		bufferedInputStream.close();

		System.out.println();

		Date date3 = new Date();
		FileInputStream fileInputStream2 = new FileInputStream("D:\\Development\\Javarush\\file.txt");

		while ((i = fileInputStream2.read()) != -1) {

			System.out.print((char) i);
		}

		Date date4 = new Date();
		System.out.println("\n" + (date4.getTime() - date3.getTime()));
		fileInputStream2.close();
	}

}

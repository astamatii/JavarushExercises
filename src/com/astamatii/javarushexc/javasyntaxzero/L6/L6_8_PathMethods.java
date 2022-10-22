package com.astamatii.javarushexc.javasyntaxzero.L6;

import java.nio.file.Path;
import java.nio.file.Paths;

public class L6_8_PathMethods {

	public static void main(String[] args) {
		Path testFilePath = Paths.get("C:\\Users\\Username\\Desktop\\testFile.txt");

		Path fileName = testFilePath.getFileName();
		System.out.println(fileName);

		Path parent = testFilePath.getParent();
		System.out.println(parent);

		Path root = testFilePath.getRoot();
		System.out.println(root);

		boolean endWithTxt = testFilePath.endsWith("Desktop\\testFile.txt");
		System.out.println(endWithTxt);

		boolean startsWithString = testFilePath.startsWith("estFile.txt");
		System.out.println(startsWithString);

	}

}

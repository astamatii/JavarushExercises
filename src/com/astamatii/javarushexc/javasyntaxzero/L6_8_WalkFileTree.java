package com.astamatii.javarushexc.javasyntaxzero;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;

public class L6_8_WalkFileTree {

	public static void main(String[] args)  throws IOException  {
		
		Files.walkFileTree(Paths.get("D:\\1"), new MyFileVisitor());

	}

}

class MyFileVisitor extends SimpleFileVisitor<Path> {

   @Override
   public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {

       List<String> lines = Files.readAllLines(file);
       for (String s: lines) {
           if (s.contains("This is the file we need")) {
               System.out.println("Нужный файл обнаружен!");
               System.out.println(file.toAbsolutePath());
               //return FileVisitResult.TERMINATE;   //to finish searching in the tree
               break; 
           }
       }

       return FileVisitResult.CONTINUE; //continues to search in the tree to the next file
   }
}
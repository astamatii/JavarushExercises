package com.astamatii.javarushexc.javacore.L5.lesson_12;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

//Для решения этой задачи:
//Инициализируй переменную Statics.FILE_NAME полным путем к файлу с данными, который содержит несколько строк.
//В статическом блоке считай из файла с именем Statics.FILE_NAME все строки и добавь их по отдельности в List lines.

public class L5_12_OOP_10 {
    public static List<String> lines = new ArrayList<String>();

    static {
    	try (FileReader fileReader = new FileReader (Statics.FILE_NAME);
    			BufferedReader bufReader = new BufferedReader(fileReader)){
    		while (bufReader.ready()) {
    			lines.add(bufReader.readLine());
    		}
    	} catch (FileNotFoundException e) {
    		e.printStackTrace();
    	} catch (IOException e) {
    		e.printStackTrace();
    	} 
    }
    
//    static {
//        String line;
//        try {
//            FileReader fr = new FileReader(Statics.FILE_NAME);
//            BufferedReader br = new BufferedReader(fr);
//            while ((line = br.readLine()) != null) {
//                lines.add(line);
//            }
//            br.close();
//            fr.close();
//        } catch (FileNotFoundException fN) {
//            fN.printStackTrace();
//        } catch (IOException e) {
//            System.out.println(e);
//        }
//    } 
    
    public static void main(String[] args) {
        System.out.println(lines);
    }
}

class Statics {
	public static String FILE_NAME = "AnyFileName.txt"; /* add the path to your source file here */;;
	
//	static {
//		try (BufferedReader bufReader = new BufferedReader(new InputStreamReader(System.in))) {
//			
//			FILE_NAME = bufReader.readLine();     
//	    
//		} catch (IOException e) {
//			e.printStackTrace();		
//		}
//	}
	
    
}   
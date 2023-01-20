package com.astamatii.javarushexc.javacore.L8.lesson_11;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Читайте с консоли имена файлов, пока не будет введено слово "exit".
//Передайте имя файла в нить ReadThread.
//Нить ReadThread должна найти байт, который встречается в файле максимальное число раз 
//	(если таких байтов несколько, выбрать наименьший), и добавить его в словарь resultMap,
//где параметр String - это имя файла, параметр Integer - это искомый байт.
//Закрыть потоки.

public class L7_8_11_IOStreams {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) {
    	BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
    	String fileName;
    	ReadThread readThread;
    	
    	try {
			while(!(fileName = console.readLine()).equals("exit")) {
				readThread = new ReadThread(fileName);
				readThread.start();
				readThread.join();
			}
			
			console.close();
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
    	
    }

    public static class ReadThread extends Thread {
        String fileName;
    	
    	public ReadThread(String fileName) {
            //implement constructor body
        	this.fileName = fileName;
        }
    	
        // implement file reading here - реализуйте чтение из файла тут
    	
    	@Override
    	public void run() {
    		
    		List<Byte> bytes = new ArrayList<>();
    		
    		try(FileInputStream fileStream = new FileInputStream(fileName)){
    			byte[] buffer = new byte[10];
    			while(fileStream.available() > 0) {
    				int length = fileStream.read(buffer);
    				
    				for (int i = 0; i < length; i++)
    					bytes.add(buffer[i]);
    			}    			
    			
    			fileStream.close();
    		} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
    		
    	}
    	
    } 
}

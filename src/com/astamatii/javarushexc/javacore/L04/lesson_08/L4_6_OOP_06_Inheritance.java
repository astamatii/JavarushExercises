package com.astamatii.javarushexc.javacore.L04.lesson_08;

//У нас есть кинофабрика, но она работает не в полную силу.
//Давай расширим ее функционал по аналогии с тем, что уже есть, и добавим чтение с консоли.
//Вот что тебе нужно сделать для успешного решения:
//1. Разобраться, что программа умеет делать.
//2. Все классы должны быть внутри класса Solution.
//3. Добавить классы Cartoon, Thriller.
//4. Разобраться, как мы получаем объект класса SoapOpera по ключу "soapOpera".
//5. Аналогично получению объекта SoapOpera сделать:
//	4.1. добавить в MovieFactory.getMovie получение объекта Cartoon для ключа "cartoon".
//	4.2. добавить в MovieFactory.getMovie получение объекта Thriller для ключа "thriller".
//6. Считать с консоли несколько ключей (строк).
//7. Важно: ввод заканчивается, как только вводится строка не совпадающая с одной из: 
//	"cartoon", "thriller", "soapOpera".
//8. Создать переменную movie типа Movie и для каждой введенной строки (ключа):
//	8.1. получить объект используя MovieFactory.getMovie и присвоить его переменной movie.
//	8.2. вывести на экран movie.getClass().getSimpleName().

import java.io.BufferedReader;
import java.io.InputStreamReader;  

public class L4_6_OOP_06_Inheritance {
    public static void main(String[] args) throws Exception {
        //ввести с консоли несколько ключей (строк), пункт 7
    	BufferedReader bufreader = new BufferedReader(new InputStreamReader(System.in));
    	
    	String line = bufreader.readLine();
    	while ("cartoon".equals(line) || "soapOpera".equals(line) 
    			|| "thriller".equals(line)) {
			/*
			 8 Создать переменную movie класса Movie и для каждой введенной строки(ключа):
			 	8.1 получить объект используя MovieFactory.getMovie и присвоить его
			  		переменной movie. 
			 	8.2 вывести на экран movie.getClass().getSimpleName().
			 */
    		
    		Movie movie = MovieFactory.getMovie(line);
    		System.out.println(movie.getClass().getSimpleName());
    		line = bufreader.readLine();
    		if(!("cartoon".equals(line) || "soapOpera".equals(line) 
    			|| "thriller".equals(line))) {
    			movie = MovieFactory.getMovie(line);
    		}
    	}
    	
    	//Javarush answer:
//        String key = null;
//        while ((key = bufreader.readLine()) != null) {
//            Movie movie = MovieFactory.getMovie(key);
//            if (movie == null) {
//                return;
//            }    
    	
    	bufreader.close();
    }

    static class MovieFactory {

        static Movie getMovie(String key) {
            Movie movie = null;

            //создание объекта SoapOpera (мыльная опера) для ключа "soapOpera"
            if ("soapOpera".equals(key)) {
                movie = new SoapOpera();
            }
            //напишите тут ваш код, пункты 5,6
            if ("cartoon".equals(key)) {
                movie = new Cartoon();
            }
            if ("thriller".equals(key)) {
                movie = new Thriller();
            } 

            

            return movie;
        }
    }

    static abstract class Movie {
    }

    static class SoapOpera extends Movie {
    }

    //Напишите тут ваши классы, пункт 3 
    static class Cartoon extends Movie {
    	
    }
    
    static class Thriller extends Movie {
    	
    }
}

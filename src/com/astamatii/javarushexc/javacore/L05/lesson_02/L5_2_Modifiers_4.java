package com.astamatii.javarushexc.javacore.L05.lesson_02;

import java.util.LinkedList;
import java.util.List;  

//Давай напишем программу, которая будет определять жанр книги, или автора, который ее написал.
//Для этого:
//1. Создай public static класс MarkTwainBook, который наследуется от Book. Имя автора — [Mark Twain].
//2. Параметр конструктора — название книги (title).
//3. В классе MarkTwainBook реализуй все абстрактные методы.
//4. Для метода getBook измени тип возвращаемого значения на более подходящий.
//5. Создай по аналогии AgathaChristieBook. Имя автора — [Agatha Christie].
//6. В классе Book реализуй тело метода getOutputByBookType() так, чтобы он возвращал:
//	- agathaChristieOutput — для книг Агаты Кристи;
//	- markTwainOutput — для книг Марка Твена.

public class L5_2_Modifiers_4 {
    public static void main(String[] args) {
        List<Book> books = new LinkedList<Book>();
        books.add(new MarkTwainBook("Tom Sawyer"));
        books.add(new AgathaChristieBook("Hercule Poirot"));
        System.out.println(books);
    }
    
    public static class AgathaChristieBook extends Book {

    	private String title;
    	
    	public AgathaChristieBook(String title){
    		super("Agatha Christie");
    		this.title = title;
    	}
    	
		@Override
		public AgathaChristieBook getBook() {
			return this;
		}

		@Override
		public String getTitle() {
			return title;
		}
    	
    }
    
    public static class MarkTwainBook extends Book {

    	private String title;
    	
    	public MarkTwainBook(String title){
    		super("Mark Twain");
    		this.title = title;
    	}
    	
		@Override
		public MarkTwainBook getBook() {
			return this;
		}

		@Override
		public String getTitle() {
			return title;
		}
    }

    abstract static class Book {
        private String author;

        public Book(String author) {
            this.author = author;
        }                  

        public abstract Book getBook();

        public abstract String getTitle();

        private String getOutputByBookType() {
            String agathaChristieOutput = author + ": " + getBook().getTitle() + " is a detective";
            String markTwainOutput = getBook().getTitle() + " was written by " + author;

            String output = "output";
            //Add your code here
            if (this instanceof AgathaChristieBook)
            	return agathaChristieOutput;
            if (this instanceof MarkTwainBook)
            	return markTwainOutput;
            

            return output;
        }

        public String toString() {
            return getOutputByBookType();
        }
    } 
}

package com.javarush.task.task15.task1504;

import java.util.LinkedList;
import java.util.List;

/* 
ООП - книги
*/

public class Solution {
    public static void main(String[] args) {
        List<Book> books = new LinkedList<Book>();
        books.add(new MarkTwainBook("Tom Sawyer"));
        books.add(new AgathaChristieBook("Hercule Poirot"));
        System.out.println(books);
    }
    public static class MarkTwainBook extends Book{
        private String name;
        private String title;
        public MarkTwainBook(String name) {
            super("Mark Twain");
            this.title = name;
            this.name = name;
        }
        @Override
        public MarkTwainBook getBook()
        {
            return this;
        }
        @Override
        public String getTitle()
        {
            return name;
        }
    }
    public static class AgathaChristieBook extends Book{
        private String name;
        private String title;
        public AgathaChristieBook(String name) {
            super("Agatha Christie");
            this.title = name;
            this.name = name;
        }
        @Override
        public AgathaChristieBook getBook()
        {
            return this;
        }
        @Override
        public String getTitle()
        {
            return name;
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
            String agathaChristieOutput = author + ", " + getBook().getTitle() + " is a detective";
            String markTwainOutput = getBook().getTitle() + " book was written by " + author;
            String output = "output";
            if (this instanceof AgathaChristieBook){
                output = agathaChristieOutput;
            }
            if (this instanceof MarkTwainBook){
                 output = markTwainOutput;
            }//Add your code here
            return output;
        }
        public String toString() {
            return getOutputByBookType();
        }
    }
}

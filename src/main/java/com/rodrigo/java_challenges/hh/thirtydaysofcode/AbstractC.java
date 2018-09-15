package com.rodrigo.java_challenges.hh.thirtydaysofcode;

import java.util.Scanner;


abstract class Book {
    String title;
    String author;
    
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    
    abstract void display();
}
	
class MyBook extends Book{
	
	int bookPrice;

	/**   
	*   Class Constructor
	*   
	*   @param title The book's title.
	*   @param author The book's author.
	*   @param price The book's price.
	**/
	MyBook(String title, String author, int price){
		super(title, author);
		this.bookPrice = price;
	}

	/**   
	*   Method Name: display
	*   
	*   Print the title, author, and price in the specified format.
	**/
	void display(){
		System.out.println("Title: " + title);
		System.out.println("Author: " + author);
		System.out.println("Price: " + bookPrice);
	}

}
	
public class AbstractC {
	   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int price = scanner.nextInt();
        scanner.close();

        Book book = new MyBook(title, author, price);
        book.display();
    }
}

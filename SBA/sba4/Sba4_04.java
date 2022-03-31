package sba4;

import java.util.Hashtable;
import java.util.Map;

class Book {
	int id;
	String name, author, publisher;
	int quantity_sold;

	public Book(int id, String name, String author, String publisher, int quantity_sold) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity_sold = quantity_sold;
	}
}

public class Sba4_04 {
	public static void main(String[] args) {
		// Creating map of Books
		Hashtable<Integer, Book> map = new Hashtable<Integer, Book>();
		// Creating Books
		Book b1 = new Book(101, "The Diary of Anne Frank", "Anne Frank", "ABC", 35000);
		Book b2 = new Book(102, "The Hunger Games", "Suzanne Collins", "Mc Graw Hill", 29000);
		Book b3 = new Book(103, "The Godfather", "Mario Puzo", "GFH", 21000);
		// Adding Books to map
		map.put(1, b1);
		map.put(2, b2);
		map.put(3, b3);
		// Traversing map
		for (Map.Entry<Integer, Book> z : map.entrySet()) {
			int key = z.getKey(); // key=3
			Book b = z.getValue(); // b=b3
			System.out.println(key + " Details:");
			System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity_sold);
		}
	}
}
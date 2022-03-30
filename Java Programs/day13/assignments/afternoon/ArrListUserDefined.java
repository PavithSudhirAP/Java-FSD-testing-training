package day13.assignments.afternoon;

// 4.Create an arraylist of user-defined data type Book. it should have:-
// i)Name of the Book
// ii)Author of the book
// iii)year of publication of the book
// iV)numer of copies sold.
// sort the array list based on the year of publication.

import java.util.ArrayList;
import java.util.Collections;

class Book implements Comparable<Object> {
    String Name;
    String Author;
    Integer Year;
    int Copies;

    Book(String name, String author, int year, int copies) {
        this.Name = name;
        this.Author = author;
        this.Year = year;
        this.Copies = copies;
    }

    public int getYear() {
        return this.Year;
    }

    @Override
    public int compareTo(Object o) {
        Book b1 = (Book) o;
        return (this.Year.compareTo(b1.getYear()));
    }
}

public class ArrListUserDefined {
    public static void main(String[] args) {
        ArrayList<Book> BookList = new ArrayList<Book>();
        Book b1 = new Book("War and Peace", "Leo Tolstoy", 1869, 5061570);
        Book b2 = new Book("Harry Potter and the Deathly Hallows", "J.K.Rowling", 2007, 4475152);
        Book b3 = new Book("A Tale of Two Cities", "Charles Dickens", 1859, 2000000);
        Book b4 = new Book("And Then There Were None", "Agatha Christie", 1939, 1000000);
        Book b5 = new Book("The Alchemist", "Paulo Coelho", 1988, 650000);
        Book b6 = new Book("Charlotte's Web", "E.B.White", 1952, 50000);

        BookList.add(b1);
        BookList.add(b2);
        BookList.add(b3);
        BookList.add(b4);
        BookList.add(b5);
        BookList.add(b6);

        System.out.println("--------------------------- Original Booklist ------------------------------");
        for (Book b : BookList) {
            System.out.println(b.Name + " -- " + b.Author + " -- " + b.Year + " -- " + b.Copies);
        }
        System.out.println("----------------------------------------------------------------------------");

        Collections.sort(BookList, Collections.reverseOrder()); // Sorted based on year (latest to oldest)

        System.out.println("--------------------------- Booklist Sorted by year -------------------------");
        for (Book b : BookList) {
            System.out.println(b.Name + " -- " + b.Author + " -- " + b.Year + " -- " + b.Copies);
        }
        System.out.println("-----------------------------------------------------------------------------");
    }
}

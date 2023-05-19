package day40_DailyReviews.book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TestBook {

    public static void main(String[] args) {


        Book book1 = new Book("book1","author1", 124,49.95);
        Book book2 = new Book("book2","author2", 248,19.95);
        Book book3 = new Book("book3","author3", 50,99.95);
        Book book4 = new Book("book4","author4", 100,79.95);
        Book book5 = new Book("book5","author5", 200,39.95);
        Book book6 = new Book("book6","author6", 64,9.95);
        Book book7 = new Book("book7","author7", 256,29.95);

        ArrayList<Book> list = new ArrayList<>(Arrays.asList(book1, book2, book3, book4, book5, book6, book7));

        String cheapestBook = "", mostExpensiveBook = "";
        double min = list.get(0).price, max = list.get(0).price;

        for (Book book : list) {
            if (book.price > max) {
                max = book.price;
                mostExpensiveBook = book.name;
            } else if (book.price < min) {
                min = book.price;
                cheapestBook = book.name;
            }
        }

        System.out.println("cheapestBook = " + cheapestBook);
        System.out.println("mostExpensiveBook = " + mostExpensiveBook);
        list.stream().filter(p-> p.price > 20).forEach(p-> System.out.println("the books whose price is more than 20$ " + p.name));
        list.stream().filter(p-> p.author.equals("author4")).forEach(p-> System.out.println(p.name + " is written by " + p.author));



    }
}


/*

Create a class named BookTest with a main method
Create an arraylist of Book objects and add into it 7 books
Print the cheapest book in the arrayList
Print the most expensive book in the arraylist
Print the books which are more expensive than $20
List all books which were written by a specific author

 */
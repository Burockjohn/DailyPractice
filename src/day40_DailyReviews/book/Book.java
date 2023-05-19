package day40_DailyReviews.book;

public class Book {

    public String name, author;
    public int numberOfPages;
    public double price;

    public Book(String name, String author, int numberOfPages, double price) {
        this.name = name;
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.price = price;
    }

    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", numberOfPages=" + numberOfPages +
                ", price=" + price +
                '}';
    }
}

/*

Create a class named Book
instances:name,theNumberOfPages,price,author
a constructor: sets all fields
actions:toString

 */
class Book {
    private String title;
    private String author;
    private int yearPublished;
    private double price;

    public Book(String title, String author, int yearPublished, double price) {
        this.title = title;
	this.author = author;
	this.yearPublished = yearPublished;
	this.price = price;
    }

    @Override
    public String toString() {
        return "Title: \"" + title + "\"\n"
		+ "Author: \"" + author + "\"\n"
		+ "Year Published: " + yearPublished + "\n"
		+ String.format("Price: $%.2f", price);
    } 
}

public class Task11 {
    public static void main(String[] args) {
        Book[] bookDetails = new Book[] {
	    new Book(
                    "Java Programming",
		    "John Smith",
		    2021,
		    39.99),
	    new Book(
                    "Python Basics",
                    "Jane Doe",
                    2020,
                    29.99),
	    new Book(
                    "C++ Essentials",
                    "Michael Johnson",
                    2019,
                    49.99),
	};

	int num = 1;
	for (Book details : bookDetails) {
            System.out.println("Book " + num + ":");
            System.out.println(details);
            System.out.println();
            num++;
	}
    }
}

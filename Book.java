public class Book {
    // Attributes
    String title;
    String author;
    int pages;

    // Default Constructor
    public Book() {
        this.title = "Unknown Title";
        this.author = "Unknown Author";
        this.pages = 0;
    }

    // Method to display book details
    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
    }

    // Main method to run the example
    public static void main(String[] args) {
        // Creating an object of the Book class using the default constructor
        Book book = new Book();

        // Displaying the details of the book
        book.display();
    }
}

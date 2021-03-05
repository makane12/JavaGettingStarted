import java.util.ArrayList;
import java.util.Date;

public class Book {
    private String title;
    private long isbn;
    private Date publishDate;
    private ArrayList<Author> authors;


    //pass in array list of authors
    public Book(String title, long isbn, Date publishDate, ArrayList<Author> authors) {
        this.title = title;
        this.isbn = isbn;
        this.publishDate = publishDate;
        this.authors = authors;
    }

    //pass in one author
    public Book(String title, long isbn, Date publishDate, Author author) {
        this.title = title;
        this.isbn = isbn;
        this.publishDate = publishDate;
        this.authors.add(author);
    }

    public Book(long isbn) {
        this.isbn = isbn;
    }

    public Book(Date publishDate) {
        this.publishDate = publishDate;
    }

    //pass in book title
    public Book (String title, ArrayList<Author> authors) {
        this.title = title;
        this.authors = authors;
    }

    //empty constructor
    public Book() {}
}
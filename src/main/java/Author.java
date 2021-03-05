import java.util.ArrayList;
import java.util.Date;

//Books by a particular author
public class Author {
    private String name;
    private ArrayList<Book> catalog;

    public Author(String name) {
        this.name = name;
    }

    public Author(String name, ArrayList<Book> catalog) {
        this.name = name;
        this.catalog = catalog;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Book> getCatalog() {
        return catalog;
    }

    public void addBook(Book book) {
        catalog.add(book);
    }

    public void removeBook(long isbn) {
        catalog.remove(isbn);
    }

    public Book findBookByTitle(String title)  { return new Book(); }

    public ArrayList<Book> findBooksContainingWords(String searchTerms) { return new ArrayList<Book>(); }

    public Book findBookByIsbn(long isbn) { return new Book();}

    public Book findBookByDatePublished(Date publishDate) { return new Book(); }
}
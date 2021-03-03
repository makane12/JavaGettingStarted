import java.util.ArrayList;

public class Author {
    private String name;
    private ArrayList<Book> catalog;

    public Author(String name) {

        //"this" is required when you reuse a name of something and there might be ambiguity.
        // only needed when there's a chance Java compiler doesn't know which one you're using.
        this.name = name;

        //one below doesn't require "this" because it has a unique name
        //name = authorName;
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

    //returns a COPY of author's catalog book list. Immutable
//    public Book[] getCatalog() {
//        return (Book[]) catalog.toArray();
//    }

    public void addBook(Book book) {
        catalog.add(book);
    }

    public void removeBook(String isbn) {
        catalog.remove(isbn);
    }
}
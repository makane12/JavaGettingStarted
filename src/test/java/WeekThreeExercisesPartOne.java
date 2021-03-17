import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class WeekThreeExercisesPartOne {
   // class visibility
   // static variables vs. instance variables
   // getters
   // setters
   // methods
   // constructors
   // access modifiers modifiers (public, protected, private, none) (


//    Access Levels
//    Modifier	Class	Package	Subclass	World
//    public	Y	Y	Y	Y
//    protected	Y	Y	Y	N
//    no modifier	Y	Y	N	N
//    private	Y	N	N	N

    // subclass vs superclass
    // using the final keyword

    // arrays
    // pass by value vs reference

    // incrementally build out a solution using exercises

        //sample here only to show how could use the Author class. This would exist elsewhere in project likely.
    private void someMethod() {
        ArrayList<Book> myBooks = new ArrayList<>();
        myBooks.add(new Book());
        Author kane_mk = new Author("Kane, Melissa", myBooks);
        Author blomberg_rt = new Author("Blomberg, Robert", new ArrayList<Book>());
        blomberg_rt.addBook(new Book ("Title", 123456, LocalDate.of(2020, 1, 8), blomberg_rt));
        Book year_of_living_dangerously = new Book("Year of Living Dangerously", new ArrayList<Author>());
        Book walden = new Book("Walden", new ArrayList<Author>());
        kane_mk.addBook(year_of_living_dangerously);
    }



}

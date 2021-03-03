import java.util.ArrayList;

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
        Author author = new Author("Kane, Melissa", myBooks);
        Author author2 = new Author("Blomberg, Robert", new ArrayList<Book>());
    }

}

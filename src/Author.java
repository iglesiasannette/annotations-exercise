/**
 * This source file is subject to the license that is bundled with this package in the file LICENSE.
 */
import java.util.ArrayList;
import java.util.List;

public class Author extends Person {
    private ArrayList<String> books; //changed the data type of books from List to ArrayList to match the
    // instantiation of the new instance in the author constructor

    public Author(String firstName, String lastName) {
        super(firstName, lastName);
        books = new ArrayList<>(); //
    }

    /**
     * @deprecated Use publishedBooks instead
     */
    @Deprecated
    public List<String> getBooks() {
        return books;
    }

    public List<String> publishedBooks() {
        return books;
    } // List is fine since ArrayList is the super class.

    public void addBook(String book) {
        books.add(book);
    }

    @Override //updated the name of method from sortName to fullName, like in the parent
    public String fullName() {
        return String.format("%s, %s", lastName, firstName);
    }
}

package zaawansowana_java.biblioteka.controller;

import java.util.ArrayList;
import java.util.List;
import zaawansowana_java.biblioteka.model.Book;

/**
 *
 * @author Maciek
 */
public class BookDatabase {
	
	//TODO wklepać to do dao, zrobić interfejs na dao generalne, rozwarstwić
    private List<Book> books;

    public BookDatabase() {
        books=new ArrayList<Book>();
    }
    
    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
    
    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }
}

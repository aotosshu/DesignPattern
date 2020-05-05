package dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class BookDaoImpl implements BookDao {

    // map is working as a database
    private Map<Integer, Book> books;

    public BookDaoImpl() {
        books = new TreeMap<>();
        saveBook(new Book(1, "Java"));
        saveBook(new Book(2, "Python"));
        saveBook(new Book(3, "Android"));
    }

    @Override
    public List<Book> getAllBooks() {
        return new ArrayList<>(books.values());
    }

    @Override
    public Book getBookByIsbn(int isbn) {
        return books.get(isbn);
    }

    @Override
    public void saveBook(Book book) {
        books.put(book.getIsbn(), book);
    }

    @Override
    public void deleteBook(Book book) {
        books.remove(book.getIsbn());
    }
}

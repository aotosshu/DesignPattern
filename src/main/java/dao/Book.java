package dao;

public class Book {

    private int isbn;
    private String bookName;

    public Book() {
    }

    public Book(int isbn, String bookName) {
        this.isbn = isbn;
        this.bookName = bookName;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookName() {
        return bookName;
    }
}

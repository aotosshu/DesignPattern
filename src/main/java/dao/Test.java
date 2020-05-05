package dao;

public class Test {

    public static void main(String[] args) {

        BookDao bookDao = new BookDaoImpl();

        printBooksInfo(bookDao);

        // update student
        Book book = bookDao.getAllBooks().get(1);
        book.setBookName("Algorithms");
        bookDao.saveBook(book);

        printBooksInfo(bookDao);
    }

    private static void printBooksInfo(BookDao bookDao) {

        for (Book book : bookDao.getAllBooks()) {
            System.out.println("Book : ISBN=" + book.getIsbn() + ", name=" + book.getBookName());
        }
    }
}

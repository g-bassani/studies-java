package file.bookSectionFileProcessor;

import java.util.ArrayList;
import java.util.List;

public class BookSector {

    private int section;
    private final List<Book> bookList = new ArrayList<>();

    public BookSector(int section) {
        this.section = section;
    }

    public Integer getSection() {
        return section;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setSection(int section) {
        this.section = section;
    }

    public void addBook(Book book) {
        bookList.add(book);
    }

    public void removeBook(Book book) {
        bookList.remove(book);
    }
}

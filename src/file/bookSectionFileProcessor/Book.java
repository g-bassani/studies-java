package file.bookSectionFileProcessor;

public class Book {

    private String name;
    private String author;
    private Integer id;
    private Status status;

    public Book(String name, String author, Status status, Integer id) {
        this.name = name;
        this.author = author;
        this.status = status;
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String bookSpecs() {
        return name
                + " by "
                + author
                + " | "
                + status
                + " | "
                + id;

    }

}

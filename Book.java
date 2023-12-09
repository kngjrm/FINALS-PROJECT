package birpck;

public class Book {
    private String id;
    private String title;
    private String author;
    private String status;

    public static final String FIELD_TITLE = "Title";
    public static final String FIELD_AUTHOR = "Author";
    public static final String FIELD_STATUS = "Status";

    // Constructor
    public Book(String id, String title, String author, String status) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.status = status;
    }

    // Getters and setters for attributes
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // Additional method for updating the status of the book
    public void updateStatus(String newStatus) {
        this.status = newStatus;
    }
}

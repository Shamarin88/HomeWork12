public class Book {
    private final String bookName;
    private final String author;
    private int publishedYear;

    public Book(String bookName, String author, int publishedYear) {
        this.bookName = bookName;
        this.author = author;
        this.publishedYear = publishedYear;
    }
    public String getBookName() {
        return bookName;
    }
    public String getAuthor() {
        return author;
    }
    public int getPublishedYear() {
        return publishedYear;
    }
    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }
}

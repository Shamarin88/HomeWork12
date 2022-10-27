public class Book {
    public String bookName;
    public String authorName;
    public int publishedYear;

    public Book(String bookName, String authorName, int publishedYear) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.publishedYear = publishedYear;
    }

    public String getBookName() {
        return this.bookName;
    }
    public String getAuthorName() {
        return this.authorName;
    }
    public int getPublishedYear() {
        return this.publishedYear;
    }
    public int setPublishedYear(int publishedYear) {
        return this.publishedYear = publishedYear;
    }
}

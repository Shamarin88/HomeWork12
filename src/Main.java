public class Main {
    public static void main(String[] args) {

    Book book = new Book("It", "Stephen", 1986);
        System.out.println("book.bookName = " + book.getBookName());
        System.out.println("book.authorName = " + book.getAuthorName());
        System.out.println("book.publishedYear = " + book.getPublishedYear());

        Author author = new Author("Stephen","King");
        System.out.println("author.authorFirstName = " + author.getAuthorFirstName());
        System.out.println("author.authorLastName = " + author.getAuthorLastName());
        book.setPublishedYear(1987);
        System.out.println("book.publishedYear = " + book.publishedYear);
    }
}
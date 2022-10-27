public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("IT","Stephen King", 1986);
        System.out.println("Название кники " + book1.getBookName());
        System.out.println("Автор " + book1.getAuthor());
        System.out.println("Издана в " + book1.getPublishedYear());

        Book book2 = new Book("The Shining", "Stephen King", 1977);
        System.out.println("Название кники " + book2.getBookName());
        System.out.println("Автор " + book2.getAuthor());
        System.out.println("Издана в " + book2.getPublishedYear());

        Author author1 = new Author("Stephen", "King");
        System.out.println("Имя писателя " + author1.getAuthorFirstName() + " " + author1.getAuthorLastName());

        book1.setPublishedYear(1987);
        System.out.println("Обновленная дата публикации " + book1.getPublishedYear());
    }
}


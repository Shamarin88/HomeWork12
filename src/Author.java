public class Author {
    public String authorFirstName;
    public String authorLastName;

    public Author(String authorFirstName, String authorLastName) {
        this.authorFirstName = authorFirstName;
        this.authorLastName = authorLastName;
    }
    public String getAuthorFirstName() {
        return this.authorFirstName;
    }
    public String getAuthorLastName() {
        return this.authorLastName;
    }
}

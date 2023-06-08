public class Author {
    private String firstName;
    private String lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String toString() {
        return " Имя: " + this.getFirstName() + " Фамилия: " + this.getLastName();
    }

    public boolean equals(Author secondAuthor) {
        if (this.getClass() != secondAuthor.getClass()) {
            return false;
        }
        Author author2 = (Author) secondAuthor;
        return firstName.equals(author2.firstName)&&lastName.equals(author2.lastName);
    }

    public int hashCode() {
        return java.util.Objects.hash(firstName, lastName);
    }

}

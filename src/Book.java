public class Book {
    private String name;
    private Author author;
    private int year;

    public Book(String name, Author author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public String getName() {
        return this.name;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString() {
        return "Название: " + this.name + " Автор: " + this.author.toString() + " Год издания: " + this.year;
    }

    public boolean equals(Object secondBook) {
        if (this.getClass() != secondBook.getClass()) {
            return false;
        }
        Book book2 = (Book) secondBook;
        return name.equals(book2.name) && author.equals(book2.author) && year == book2.year;
    }

    public int hashCode() {
        return java.util.Objects.hash(name, author.getFirstName(), author.getLastName(), year);
    }
}

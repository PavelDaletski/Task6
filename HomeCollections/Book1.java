package HomeCollections;

import java.util.Objects;

public class Book1 {
    private String name;
    private String author;

    public Book1() {
    }

    public Book1(String name, String author) {
        this.name = name;
        this.author = author;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book1 book1 = (Book1) o;
        return Objects.equals(name, book1.name) &&
                Objects.equals(author, book1.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author);
    }

    @Override
    public String toString() {
        return "Book1{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}

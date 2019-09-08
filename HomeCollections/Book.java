package HomeCollections;

import java.util.Objects;

public class Book {
    private int id ;
    private String title;
    private String outher;

    public Book() {
    }

    public Book(int id, String title, String outher) {
        this.id = id;
        this.title = title;
        this.outher = outher;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOuther() {
        return outher;
    }

    public void setOuther(String outher) {
        this.outher = outher;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", outher='" + outher + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id &&
                Objects.equals(title, book.title) &&
                Objects.equals(outher, book.outher);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, outher);
    }
}



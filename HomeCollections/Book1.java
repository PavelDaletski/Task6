package HomeCollections;

import java.util.Objects;

public class Book1 {
    private int id;
    private String title;
    private String outher;
    private String fristname;

    public Book1() {
    }

    public Book1(int id, String title, String outher, String fristname) {
        this.id = id;
        this.title = title;
        this.outher = outher;
        this.fristname = fristname;
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

    public String getFristname() {
        return fristname;
    }

    public void setFristname(String fristname) {
        this.fristname = fristname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book1 book1 = (Book1) o;
        return id == book1.id &&
                Objects.equals(title, book1.title) &&
                Objects.equals(outher, book1.outher) &&
                Objects.equals(fristname, book1.fristname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, outher, fristname);
    }

    @Override
    public String toString() {
        return "Book1{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", outher='" + outher + '\'' +
                ", fristname='" + fristname + '\'' +
                '}';
    }
}


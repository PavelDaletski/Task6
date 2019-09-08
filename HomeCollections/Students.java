package HomeCollections;

import java.util.Objects;

public class Students  implements Comparable<Students>{
    private  int id;
    private String name;

    public Students() {
    }

    public Students(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Students students = (Students) o;
        return id == students.id &&
                Objects.equals(name, students.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Students students) {
        if (this.getId()==students.getId()){
            return 0;
        } else {
            return 1;
        }

    }
}

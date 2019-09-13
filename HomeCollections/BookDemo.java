package HomeCollections;


/*Создать экземпляр класса LinkedList, разместить в нём 3 ссылки на объекты класса Book.
        List< Book > list = new LinkedList< Book >();
        Вывести информацию о всех книгах. Программно удалить из коллекции вторую книгу, вывести на экран информацию о оставшихся книгах*/

import java.util.LinkedList;
import java.util.List;

public class BookDemo {
    public static void main(String[] args) {
        Book b1 = new Book(1, "Hello Word!", "Pavel Daletski");
        Book b2 = new Book(2, "Java Polnoe", "Gerbert Shider");
        Book b3 = new Book(3, "Java", "Olga Smolyakova");
        Book b4 = new Book(4, "Hello", "Anton Sedlayr");

        List<Book> books = new LinkedList<Book>();
        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);
        books.remove(1);

        for (Book book : books) {
            System.out.println(book);

        }

    }
}

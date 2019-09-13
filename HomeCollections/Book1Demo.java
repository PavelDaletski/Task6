package HomeCollections;

/*
2. Создать экземпляр класса HashSet, добавить в него 25 ссылок на экземпляры класса Book,
        предусмотреть не менее 6 одинаковых по значению книг. Вывести на экран информацию о книга (содержащихся в коллекции HashSet),
        название которых начинается с гласной буквы.

        3. Отсортировать коллекцию из задания 2 по фамилии, затем по имени, по отчеству (эти поля надо добавить в класс Book для автора книги).
*/

import java.util.*;

public class Book1Demo {

    public static void main(String[] args) {

         Set<Book1> hashSet = new HashSet<>();

       Book1 b1 = new Book1(1, "It", "King", "Stephen" );
        Book1 b2 = new Book1(2, "War and Peace", "Tolstoy", "Leo");
        Book1 b3 = new Book1(3, "Alice in the Wonderland", "Carroll", "Rewis");
        Book1 b4 = new Book1(4, "Alice in the Wonderlnd", "Carroll","Samsonovich");
        Book1 b5 = new Book1(5, "Alice in the Wonderland", "Carroll", "Lewis");
        Book1 b6 = new Book1(6, "Alice in the Wonderland", "Carroll", "Aewis");
        Book1 b7 = new Book1(7, "Alice in the Wonderland", "Carroll", "Lewis");
        Book1 b8 = new Book1(8, "Alice in the Wonderland", "Carroll", "Wewis");
        Book1 b9 = new Book1(9, "The Adventures of Tom Sawyer", "Twain", "Mark");
        Book1 b10 = new Book1(10, "Another Country", "Baldwin", "James");
        Book1 b11 = new Book1(11, "One Hundred Years of Solitude", "Márquez", "Gabriel García");
        Book1 b12 = new Book1(12, "The Picture of Dorian Gray", "Wilde", "Oscar");

        hashSet.add(b1);
        hashSet.add(b2);
        hashSet.add(b3);
        hashSet.add(b4);
        hashSet.add(b5);
        hashSet.add(b6);
        hashSet.add(b7);
        hashSet.add(b8);
        hashSet.add(b9);
        hashSet.add(b10);
        hashSet.add(b11);
        hashSet.add(b12);


        hashSet
                .stream()
                .sorted(Comparator.comparing(book -> book.getOuther()))
                .forEach(System.out::println);

        System.out.println(hashSet);
    }



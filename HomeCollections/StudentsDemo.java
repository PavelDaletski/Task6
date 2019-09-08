package HomeCollections;

/*
4. Создать экземпляр класса TreeSet, поместить в него объекты класса Student(надо его спроектировать).
   Вывести на экран информацию о каждом чётном в списке студенте, каждого нечётного студента удалить из коллекции.
*/

import java.util.Set;
import java.util.TreeSet;

public class StudentsDemo {
    public static void main(String[] args) {

        Set<Students> treeSet = new TreeSet<>();


        Students students1 = new Students(1, "Pavel");
        Students students2 = new Students(2, "Yura");
        Students students3 = new Students(3, "Artyom");
        Students students4 = new Students(4, "Marina");
        Students students5 = new Students(5, "Andrew");
        Students students6 = new Students(6, "Vika");
        Students students7 = new Students(7, "Dima");
        Students students8 = new Students(8, "Vova");
        Students students9 = new Students(9, "Anton");
        Students students10 = new Students(10, "Denis");


        treeSet.add(students1);
        treeSet.add(students2);
        treeSet.add(students3);
        treeSet.add(students4);
        treeSet.add(students5);
        treeSet.add(students6);
        treeSet.add(students7);
        treeSet.add(students8);
        treeSet.add(students9);
        treeSet.add(students10);

        if (treeSet.removeIf(students -> students.getId() % 2 != 0))
            for (Students i : treeSet) {


                System.out.println(i);
            }
    }
}

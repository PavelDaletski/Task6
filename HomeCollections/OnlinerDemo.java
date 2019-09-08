package HomeCollections;

/*
5. Создать экземпляр класса HashMap,
    разместить в нём следующую информацию: в качестве ключа  - категория товара в каталоге (catalog.onliner.by)
    в качестве значения - количество товаров в данной категории. Сортировать коллекцию по количеству товаров в каждой категории,
    найти категорию в которой содержится максимальное количество товаров, удалить все категории в которых нет ни одного товара
    (предусмотреть такие категории при заполнении коллекции)
*/

import java.util.HashMap;
import java.util.Map;

public class OnlinerDemo {
    private static Object String;

    public static void main(String[] args) {


        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();

        Onliner onliner1 = new Onliner("Electronics", 5564);
        Onliner onliner2 = new Onliner("Auto", 2357);
        Onliner onliner3 = new Onliner("Sport", 0);
        Onliner onliner4 = new Onliner("HomeGarden", 7543);
        Onliner onliner5 = new Onliner("Phone", 27357);
        Onliner onliner6 = new Onliner("Computers", 4174);
        Onliner onliner7 = new Onliner("Work", 0);
        Onliner onliner8 = new Onliner("Office", 6432);

        hashMap.put(onliner1.getCategoryProdukt(), onliner1.getQuantityProdukt());
        hashMap.put(onliner2.getCategoryProdukt(), onliner2.getQuantityProdukt());
        hashMap.put(onliner3.getCategoryProdukt(), onliner3.getQuantityProdukt());
        hashMap.put(onliner4.getCategoryProdukt(), onliner4.getQuantityProdukt());
        hashMap.put(onliner5.getCategoryProdukt(), onliner5.getQuantityProdukt());
        hashMap.put(onliner6.getCategoryProdukt(), onliner6.getQuantityProdukt());
        hashMap.put(onliner7.getCategoryProdukt(), onliner7.getQuantityProdukt());
        hashMap.put(onliner8.getCategoryProdukt(), onliner8.getQuantityProdukt());


        hashMap.entrySet().removeIf(entries->entries.getValue()==0);


        hashMap.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(System.out::println);


        //System.out.println(hashMap);


    }
}

package by.belhard.j20.ponkratov.lessons.lesson06.CollectionExample;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CollectionExample {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(11);
        list.add(55);
        list.add(1);
        list.add(124);

        System.out.println(list);

        list.add(1, 10);

        System.out.println(list.size());

        System.out.println(list.get(2));
        System.out.println(list.indexOf(11));
        System.out.println(list.contains(1));

        list.set(1, 6);
        System.out.println(list.get(1));

        list.sort(Comparator.reverseOrder());
        System.out.println(list);



        list.forEach(System.out::println);
        System.out.println();


    }
}

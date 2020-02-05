package by.belhard.j20.ponkratov.lessons.lesson04;

import java.util.Random;

public class PersonExample {

    public static void main(String[] args) {

        Person person = new Person("Alfredo", 25, new Country("blr", 134), Sex.MALE);
        Person person2 = new Person("Tereza", person.getCountry());

        //person.setName("Alfredo");
        System.out.println(person.toString());
        System.out.println(person2.toString());
        System.out.println(person.getName());
        System.out.println(person2.getCountry().getTitle());

        System.out.println();

        System.out.println(Country.capitalize(person.getCountry().getTitle()));

        System.out.println(Integer.parseInt("13"));
        System.out.println(Double.parseDouble("123.2"));


        int one = 20;
        int two = 30;

        Random random = new Random();
        System.out.println(random.nextInt());

    }
}

package by.belhard.j20.ponkratov.lessons.lesson04;

import java.util.Random;

public class Person {

    private static final String DEFAULT_NAME = "Vasiliy";

    private String name;

    private int age;

    private Country country;

    private Sex sex;


    public Person(String name, int age, Country country, Sex sex) {

        this.name = name;
        this.age = age;
        this.country = country;
        this.sex = sex;
    }


    public Person(String name, Country country) {

        this(name, 18, country, Sex.MALE);
    }


    public void walk() {
        System.out.println(name + "is walking.");
    }

    public void walk(String place, int time) {
        System.out.println(name + "is walking for " + time + "minute" + place);
    }

    public void walk(int cout, String place) {
        System.out.println(name + "is walking for " + cout + "minute" + place);
    }


    public void eat(String dish) {
        //System.out.println(name + "is eating" + dish);
        System.out.printf("%s is eating %s", name, dish);
    }

    public int growOld() {
        return ++age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        if (name.length() < 2)
            name = DEFAULT_NAME;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", country=" + country +
                ", sex=" + sex +
                '}';
    }

}

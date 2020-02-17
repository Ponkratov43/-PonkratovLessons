package by.belhard.j20.ponkratov.homework.homework06.task02;

final class Person {

    final String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person. " +
                "name: " + name;
    }

    public String getName() {
        return name;
    }
}

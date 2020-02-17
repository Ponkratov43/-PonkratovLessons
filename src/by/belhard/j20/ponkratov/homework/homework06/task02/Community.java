package by.belhard.j20.ponkratov.homework.homework06.task02;

import java.util.Arrays;
import java.util.List;


final class Community {
    final List<Person> persons;

    public Community(Person... persons) {
        this.persons = Arrays.asList(persons);
    }

    Person find(String name) {
        for(Person p : persons) {
            if(p.name.equals(name)) {
                return p;
            }
        }
        return null;
    }
}

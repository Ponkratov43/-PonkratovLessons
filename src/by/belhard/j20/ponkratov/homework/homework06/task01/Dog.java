package by.belhard.j20.ponkratov.homework.homework06.task01;

public class Dog implements PetPlay {

    String name;

    public Dog(String name) {
        this.name = name;
    }

    public String play(){
        return "bar and jump";
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Dog " + name ;
    }
}

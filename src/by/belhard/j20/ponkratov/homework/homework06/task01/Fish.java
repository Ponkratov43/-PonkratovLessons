package by.belhard.j20.ponkratov.homework.homework06.task01;

public class Fish implements PetPlay {

    String name;

    public Fish(String name) {
        this.name = name;
    }

    public String play(){
        return "swim around";
    }

    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return "Fish " + name ;
    }
}

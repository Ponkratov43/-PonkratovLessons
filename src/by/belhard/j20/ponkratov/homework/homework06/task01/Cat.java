package by.belhard.j20.ponkratov.homework.homework06.task01;

public class Cat implements PetPlay {

    String name;

    public Cat(String name) {
        this.name = name;
    }

    public String play(){
        return "mau";
    }

    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return "Сat " + name ;
    }
}

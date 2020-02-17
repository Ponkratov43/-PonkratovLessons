package by.belhard.j20.ponkratov.homework.homework06.task01;

public class Main {
    public static void main(String[] args) {

        PetPlay pet = new Cat("Barsik");
        PetPlay pet1 = new Dog("Jack");
        PetPlay pet2 = new Fish("Nemo");

        Person person = new Person(pet);

        System.out.println("Favorite pet: " + pet.toString());

        System.out.println();

        System.out.println(pet.toString() + " is playing: " + person.playWithOwnPet());
        System.out.println(pet1.toString() + " is playing: " + person.playWithOnePet(pet1));
        System.out.println(pet2.toString() + " is playing: " + person.playWithOnePet(pet2));

    }
}

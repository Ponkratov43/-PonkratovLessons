package by.belhard.j20.ponkratov.homework.homework06.task01;

public class Person {

    final PetPlay pet;

    public Person(PetPlay pet) {
        this.pet = pet;
    }

    String playWithOnePet(PetPlay pet) {
        return pet.play();
    }

    String playWithOwnPet(){
        return playWithOnePet(pet);
    }

}

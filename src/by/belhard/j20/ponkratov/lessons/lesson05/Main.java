package by.belhard.j20.ponkratov.lessons.lesson05;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Vasiliy", 25);
        person1.doWork();
        System.out.println(person1.growOld());


        Worker worker1 = new Worker ("Roman", 35, "MTZ");
        System.out.println(worker1.getFactoryName());
        worker1.doWork();

        Person person2 = new Worker("Gena", 30, "MAZ");
        ((Worker) person2).getFactoryName();
        System.out.println(((Worker) person2).getFactoryName());

        Person[] persons = new Person[3];
        persons[0] = worker1;
        persons[1]= person2;
        persons[2] = new Manager("Stas", 21, 3653453);

    }
}

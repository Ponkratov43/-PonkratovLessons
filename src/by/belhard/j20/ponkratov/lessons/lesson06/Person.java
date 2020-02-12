package by.belhard.j20.ponkratov.lessons.lesson06;

public abstract class Person implements InterfaceExample {

    private String name;

    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void working() {
        System.out.println("...");
    }

    public void doWork(){
        System.out.println(name + " is doing nothing");
    }

    public int growOld(){
        return ++age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

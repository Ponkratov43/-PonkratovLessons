package by.belhard.j20.ponkratov.lessons.lesson06;

public class Manager extends Person {

    private int phoneNumber;

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void doWork() {
        System.out.println(getName() + " is working not so hard" );
    }

    public Manager(String name, int age, int phoneNumber) {
        super(name, age);
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "phoneNumber=" + phoneNumber +
                '}';
    }
}

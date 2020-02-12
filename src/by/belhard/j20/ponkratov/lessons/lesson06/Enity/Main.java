package by.belhard.j20.ponkratov.lessons.lesson06.Enity;

public class Main {

    public static void main(String[] args) {

        Enity enity1 = new Enity("abc", 10);
        Enity enity2 = new Enity("abc", 10);

        System.out.println("e == e2 " + (enity1 == enity2));
    }
}

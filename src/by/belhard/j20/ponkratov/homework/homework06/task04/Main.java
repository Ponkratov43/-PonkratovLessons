package by.belhard.j20.ponkratov.homework.homework06.task04;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(5, 6);
        Square square = new Square(5);

        System.out.println(circle.calc(circle));
        System.out.println(rectangle.calc(rectangle));
        System.out.println(square.calc(square));

    }
}

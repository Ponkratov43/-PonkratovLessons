package by.belhard.j20.ponkratov.homework.homework06.task04;

public class Circle extends CalcUtils implements PolygonCalc {

    int radius = 5;
    public double perimetr;
    public double area;


    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        area = Math.PI * radius;
        return area;
    }

    @Override
    public double perimetr() {
        perimetr = 2 * Math.PI * radius;
        return perimetr;
    }

    public int getRadius() {
        return radius;
    }
}

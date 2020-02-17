package by.belhard.j20.ponkratov.homework.homework06.task04;

public class Rectangle extends CalcUtils implements PolygonCalc {

    int width = 3;
    int length = 3;
    public double perimetr;
    public double area;


    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double perimetr() {
        perimetr = (width + length) * 2;
        return perimetr;
    }

    @Override
    public double area() {
        area = width * length;
        return area;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }
}

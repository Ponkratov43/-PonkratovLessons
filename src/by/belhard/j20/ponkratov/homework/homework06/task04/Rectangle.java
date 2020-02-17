package by.belhard.j20.ponkratov.homework.homework06.task04;

public class Rectangle implements PolygonCalc {

    int width = 3;
    int length = 3;
    int perimeter;
    int area;


    @Override
    public int perimetr() {
        perimeter = (width + length) * 2;
        return perimeter;
    }

    @Override
    public int area() {
        area = width * length;
        return area;
    }

}

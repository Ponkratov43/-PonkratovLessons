package by.belhard.j20.ponkratov.homework.homework06.task04;

public class Square implements PolygonCalc {

    int side = 3;
    int perimeter;
    int area;


    @Override
    public int perimetr() {
        perimeter = (side + side) * 2;
        return perimeter;
    }

    @Override
    public int area() {
        area = side * 2;
        return area;
    }

}

package by.belhard.j20.ponkratov.homework.homework06.task04;

public class Square extends CalcUtils implements PolygonCalc {

    int side;
    public double perimetr;
    public double area;


    public Square(int side) {
        this.side = side;
    }

    @Override
    public double perimetr() {
        perimetr = (side + side) * 2;
        return perimetr;
    }

    @Override
    public double area() {
        area = side * 2;
        return area;
    }

    public int getSide() {
        return side;
    }
}

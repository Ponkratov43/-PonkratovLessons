package by.belhard.j20.ponkratov.homework.homework06.task04;

public class CalcUtils {

    public String calc (Circle circle){
        System.out.println("Circle. Radius = " + circle.getRadius());
        System.out.println("Area: " + circle.area() + "  Perimetr: " + circle.perimetr());
        return " ";
    }
    public String calc (Rectangle rectangle){
        System.out.println("Rectangle. Width = " + rectangle.getWidth() + " Length = " + rectangle.getLength());
        System.out.println("Area: " + rectangle.area() + "  Perimetr: " + rectangle.perimetr());
        return " ";
    }
    public String calc (Square square){
        System.out.println("Square. Side = " + square.getSide());
        System.out.println("Area: " + square.area() + "  Perimetr: " + square.perimetr());
        return " ";
    }
}

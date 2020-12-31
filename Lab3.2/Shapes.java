import java.util.concurrent.Callable;

interface Shape{
    void getC();
    void getArea();
}

class Triangle implements Shape{
    private int side1, side2, side3;
    private double c, area;

    public Triangle(int theSide1, int theSide2, int theSide3){
        side1 = theSide1;
        side2 = theSide2;
        side3 = theSide3;
    }

    @Override
    public void getC() {
        c = side1 + side2 + side3;
        System.out.println("三角形的周长是"+c);
    }

    @Override
    public void getArea() {
        double halfC = (side1 + side2 + side3) / 2;
        area = Math.sqrt(halfC * (halfC - side1) * (halfC - side2) * (halfC - side3));
        System.out.println("三角形的面积是"+area);
    }
}

class Circle implements Shape{
    private static final double PI = 3.1415926;
    private double radius;
    private double c, area;

    public Circle(double theRadius){
        radius = theRadius;
    }

    @Override
    public void getC() {
        c = 2 * PI * radius;
        System.out.println("圆形的周长是"+c);
    }

    @Override
    public void getArea() {
        area = PI * radius * radius;
        System.out.println("圆形的面积是"+area);
    }
}

class Rectangle implements Shape{
    private double length, width;
    private double c, area;

    public Rectangle(double theLength, double theWidth){
        length = theLength;
        width = theWidth;
    }

    @Override
    public void getC(){
        c = 2 * (length + width);
        System.out.println("矩形的周长是"+c);
    }

    @Override
    public void getArea() {
        area = length * width;
        System.out.println("矩形的面积是"+area);
    }
}

public class Shapes {
    public static void main(String[] args){
        Triangle triangle = new Triangle(3, 4, 5);
        triangle.getC();
        triangle.getArea();

        Circle circle = new Circle(5);
        circle.getC();
        circle.getArea();

        Rectangle rectangle = new Rectangle(3, 4);
        rectangle.getC();
        rectangle.getArea();

    }
}

package inheritance.singleInheritance.example_22;

class Shape
{
    public double getArea()
    {
        return 0.0;
    }
    public double getPerimeter()
    {
        return 0.0;
    }
}
class Circle extends Shape
{
    private double radius;

    Circle(double radius)
    {
        this.radius = radius;
    }
    @Override
    public double getArea()
    {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
public class ShapeArea {
    public static void main(String[] args)
    {
        Circle circle = new Circle(3.3);
        System.out.println("Area of circle is: " + Math.round(circle.getArea() * 100.00) / 100.00);
        System.out.println("Perimeter of circle is: " + Math.round(circle.getPerimeter() * 100.00) / 100.00);

        // creating parent class reference variable and child object
        Shape circle2 = new Circle(3.3);
        System.out.println("\nArea of circle is: " + Math.round(circle2.getArea() * 100.00) / 100.00);
        System.out.println("Perimeter of circle is: " + Math.round(circle2.getPerimeter() * 100.00) / 100.00);
    }
}

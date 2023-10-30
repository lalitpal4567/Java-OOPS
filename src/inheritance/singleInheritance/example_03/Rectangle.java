package inheritance.singleInheritance.example_03;

class Shape
{
    public int calculateArea(int length, int breadth)
    {
        return length * breadth;
    }
}
public class Rectangle extends Shape
{
    public static void main(String[] args) {
        Rectangle obj = new Rectangle();
        int area = obj.calculateArea(10, 50);
        System.out.println("Area of rectangle is: "+area+" m-square");

    }
}

package inheritance.singleInheritance.example_18;

class Rectangle
{
    float length;
    float breadth;

    Rectangle(float length, float breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }
    public float area()
    {
        return length * breadth;
    }
    public float perimeter()
    {
        return 2 * (length + breadth);
    }
}

class Square extends Rectangle
{
    Square(float side)
    {
//        System.out.println("square class constructor.");
        super(side, side);  // super() must be first statement in constructor body
    }
}
public class ShapeArea {
    static Square[] arr = new Square[10];

    public static void main(String[] args)
    {
        Square obj = new Square(10);
        System.out.println("Square");
        System.out.println("Area: " + obj.area());
        System.out.println("Perimeter: " + obj.perimeter());

        Rectangle obj2 = new Rectangle(10, 20);
        System.out.println("\nRectangle");
        System.out.println("Area: " + obj2.area());
        System.out.println("Perimeter: " + obj2.perimeter());

        // calculating the area of 10 squares
        int num = 6;
        for(int index = 0; index < arr.length; index++)
        {
//            Square newObj = new Square(num++);
//            arr[index] = newObj;
            arr[index] = new Square(num++);
        }

        // displaying the area of 10 squares
        for(int index = 0; index < arr.length; index++)
        {
            System.out.println("Area of square[" + index + "] is: " + arr[index].area());
        }
    }
}

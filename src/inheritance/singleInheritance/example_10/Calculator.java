package inheritance.singleInheritance.example_10;

class BasicOperation
{
    int addition(int a, int b)
    {
        return a + b;
    }
    int subtraction(int a, int b)
    {
        return a - b;
    }
    int multiplication(int a, int b)
    {
        return a * b;
    }
    float division(int a, int b)
    {
        return a / b;
    }
}

public class Calculator extends BasicOperation
{
    double sinValue(double angle)
    {
        return Math.sin(angle);
    }
    double tanValue(double angle)
    {
        return Math.tan(angle);
    }

    public static void main(String[] args) {
        Calculator obj = new Calculator();

        System.out.println("Sum is:\t\t\t\t"+obj.addition(2,4));
        System.out.println("Multiplication is:\t"+obj.multiplication(10,20));
        System.out.println("Division is:\t\t"+obj.division(46,2));
        System.out.println("Subtraction is:\t\t"+obj.subtraction(78,8));
        System.out.println("Sin value is:\t\t"+obj.sinValue(Math.toRadians(30)));
        System.out.println("Tan value is:\t\t"+Math.round(obj.tanValue(Math.toRadians(30))));
    }
}

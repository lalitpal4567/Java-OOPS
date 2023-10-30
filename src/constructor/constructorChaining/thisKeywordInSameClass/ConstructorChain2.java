package constructor.constructorChaining.thisKeywordInSameClass;

public class ConstructorChain2 {
    int length;
    int breadth;
    String color;

    ConstructorChain2() {
        this(4,4,"blue");
    }
    ConstructorChain2(int length, int breadth) {
        this(length, breadth, "red");
    }
    ConstructorChain2(int length, int breadth, String color) {
        this.length = length;
        this.breadth = breadth;
        this.color = color;
    }

    public void drawRact() {
        System.out.println("Area of ractangle is: " + length * breadth);
        System.out.println("Color of ractangle is: " + color);
    }

    public static void main(String[] args) {
        ConstructorChain2 obj = new ConstructorChain2(8,9,"yellow");
        obj.drawRact();
    }
}


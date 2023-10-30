package constructor.constructorChaining.thisKeywordInSameClass;

public class Circle {
    static int circleCount = 0;
    double x;
    double y;
    double r;

    Circle(){
        this(0.0, 0.0, 0.1);
    }
    Circle(double r){
        this(0.0, 0.0, r);
        circleCount++;
    }
    Circle(Circle c){
        this(c.x, c.y, c.r);
        circleCount++;
    }
    Circle(double x, double y, double r){
        this.x = x;
        this.y = y;
        this.r = r;
        circleCount++;
    }
    public double circumference(){
        return (2 * Math.PI * r);
    }
    public double area(){
        return Math.PI * Math.pow(r, 2);
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(5.0);
        Circle c3 = new Circle(c1);

        System.out.println(circleCount);
    }
}

package encapsulation;

class Circle {
    private double radius;

    public double getRadius() {
        return radius;
    }

    // Setter method for radius with data validation
    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        } else {
            System.out.println("Invalid radius. Please provide a positive value.");
        }
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class CircleExample {
    public static void main(String[] args) {
        Circle myCircle = new Circle();

        myCircle.setRadius(-5.0);
        System.out.println("Radius: " + myCircle.getRadius());
        System.out.println("Area: " + myCircle.calculateArea());
    }
}

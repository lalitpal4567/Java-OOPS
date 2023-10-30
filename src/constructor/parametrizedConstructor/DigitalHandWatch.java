package constructor.parametrizedConstructor;

public class DigitalHandWatch
{
    float length;
    float breadth;
    String hasTouchDisplay = "No";
    String hasButton;

    DigitalHandWatch(float length, float breadth, String hasTouchDisplay, String hasButton)
    {
        this.length = length;
        this.breadth = breadth;
        this.hasTouchDisplay = hasTouchDisplay;
        this.hasButton = hasButton;
    }

    public void showInfo()
    {
        System.out.println("Length: " + length + " cm");
        System.out.println("Breadth: " + breadth + " cm");
        System.out.println("Is touch available? " + hasTouchDisplay);
        System.out.println("Is button available? " + hasButton);
    }

    public static void main(String[] args)
    {
        DigitalHandWatch apple = new DigitalHandWatch(2.5f, 2.7f, "Yes", "No");
        apple.showInfo();
    }
}
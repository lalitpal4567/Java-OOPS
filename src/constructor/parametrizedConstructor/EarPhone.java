package constructor.parametrizedConstructor;

class Airpod
{
    float weightInPound;
    String companyName = "apple";

    Airpod(float weightInPound)
    {
        this.weightInPound = weightInPound;
    }
}
public class EarPhone {
    public static void main(String[] args) {
        Airpod air = new Airpod(15);
        System.out.println("Company: " + air.companyName);
        System.out.println("Weight: " + air.weightInPound + " pound");
    }
}

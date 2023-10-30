package constructor.parametrizedConstructor;

class Laptop
{
    String oS;
    String company;
    int ram;
    int space;
    float weight;
    String isSddAvailable;

    Laptop()
    {
        System.out.println("Default constructor.");
        this.oS = "Windows";
        this.company = "Asus";
        this.ram = 4;
        this.space = 500;
        this.weight = 0.7f;
        this.isSddAvailable = "Yes";
    }
    public Laptop(String oS, String company, int ram, int space, float weight, String isSddAvailable)
    {
        this.oS = oS;
        this.company = company;
        this.ram = ram;
        this.space = space;
        this.weight = weight;
        this.isSddAvailable = isSddAvailable;
    }

    public void showInfo()
    {
        System.out.println("Company: " + company);
        System.out.println("Operating system: " + oS);
        System.out.println("Ram: " + ram + " Gb");
        System.out.println("Memory space: " + space + " Gb");
        System.out.println("Weight: " + weight + " kg");
        System.out.println("SDD: " + isSddAvailable);
    }

}

public class ComputerShop {
    public static void main(String[] args)
    {
        // Laptop hp = new Laptop();
        // hp.showInfo();

        Laptop dell = new Laptop("Windows", "Dell", 16, 1000, 0.450F, "No");
        dell.showInfo();
    }
}

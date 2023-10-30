package constructor.constructorChaining.thisKeywordInSameClass;

// We can't call multiple constructors from a single constructor

class Macbook
{
    String os;
    String company;
    int ram;
    int memory;
    int ssd;

    Macbook()
    {
        System.out.println("This is macbook.");
    }
    Macbook(String os, String company)
    {
//        this();
        this.os = os;
        this.company = company;
    }
    Macbook(String company, String os, int ram, int memory, int ssd)
    {
        this(os,company);
        // this();  // error (multiple constructors can't be called)
        this.ram = ram;
        this.memory = memory;
        this.ssd = ssd;
    }
    void showDetails()
    {
        System.out.println("Company: " + company);
        System.out.println("Operating system: " + os);
        System.out.println("RAM: " + ram + " Gb");
        System.out.println("Memory: " +memory + " Tb");
        System.out.println("SSD: " + ssd + " Gb");
    }

}
public class ConstructorChain04 {
    public static void main(String[] args)
    {
        Macbook obj = new Macbook("Apple","iOS",16,1,500);
        obj.showDetails();
    }
}

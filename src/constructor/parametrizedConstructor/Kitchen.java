package constructor.parametrizedConstructor;

import java.util.Scanner;

class Groceries
{
    float sugarQuantity;
    float riceQuantity;
    String toothPasteBrand;
    String shampooBrand;
    String soapBrand;

    Groceries(float sugarQuantity, float riceQuantity)
    {
        this.sugarQuantity = sugarQuantity;
        this.riceQuantity = riceQuantity;
    }
    public void displayInfo()
    {
        System.out.println();
        System.out.println("Sugar: " + sugarQuantity+" Kg");
        System.out.println("Rice: " + riceQuantity+" kg");
        System.out.println("Toothpaste: " + toothPasteBrand);
        System.out.println("shampoo: " + shampooBrand);
        System.out.println("Soap: " + soapBrand);
    }
}
public class Kitchen
{
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        Groceries customer1 = new Groceries(10, 35);
        System.out.print("Enter the brand of toothpaste: ");
        String str = input.next();
        customer1.toothPasteBrand = str;
        input.nextLine();
        System.out.print("Enter the brand of shampoo: ");
        String str1 = input.nextLine();
        customer1.shampooBrand = str1;
        System.out.print("Enter the brand of soap: ");
        String str2 = input.next();
        customer1.soapBrand = str2;
        customer1.displayInfo();
    }
}

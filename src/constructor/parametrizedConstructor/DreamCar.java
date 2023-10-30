package constructor.parametrizedConstructor;

import java.util.Scanner;

class Car
{
    String carBrand;
    String registrationNumber;
    String carColor;
    int numberOfSeats;
    float average;
    String hasAirBag;

    Car(String registrationNumber, int numberOfSeats, float average)
    {
        this.registrationNumber = registrationNumber;
        this.numberOfSeats = numberOfSeats;
        this.average = average;
    }
    public void displayInfo()
    {
        System.out.println("\nInformation about vehicle");
        System.out.println("Brand: "+carBrand);
        System.out.println("Registration no. is: "+registrationNumber);
        System.out.println("Color is: "+carColor);
        System.out.println("No. of Seats: "+numberOfSeats);
        System.out.println("Is air bag available?: "+hasAirBag);
    }
}
public class DreamCar
{
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        Car swift = new Car("DL7SAP5519",2,35.15f);
        System.out.print("Enter the name of carBrand: ");
        String str = input.nextLine();
        swift.carBrand = str;
        System.out.print("Enter the Color: ");
        String str1 = input.next();
        swift.carColor = str1;
        System.out.print("Press Yes if there is air bag otherwise No: ");
        String str2 = input.next();
        swift.hasAirBag = str2;
        swift.displayInfo();
    }
}

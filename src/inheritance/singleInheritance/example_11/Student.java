package inheritance.singleInheritance.example_11;

import java.util.Scanner;

class Address
{
    byte houseNo;
    String city;
    String state;
}

public class Student extends Address
{
    String name;
    String gender;
    byte age;

    public void setInfo()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the name: ");
        name = input.nextLine();
        System.out.print("Enter the gender: ");
        gender = input.next();
        System.out.print("Enter the age: ");
        age = input.nextByte();
        System.out.print("Enter house number: ");
        houseNo = input.nextByte();
        System.out.print("Enter the city: ");
        city = input.next();
        input.nextLine();
        System.out.print("Enter the state: ");
        state = input.nextLine();
        input.close();
    }
    public void getInfo()
    {
        System.out.println("Student Information");
        System.out.println("Name: "+name);
        System.out.println("Gender: "+gender);
        System.out.println("Age: "+age);
        System.out.println("House no.: "+houseNo);
        System.out.println("City: "+city);
        System.out.println("State: "+state);
    }

    public static void main(String[] args)
    {
        Student obj = new Student();
        obj.setInfo();
        obj.getInfo();
    }
}

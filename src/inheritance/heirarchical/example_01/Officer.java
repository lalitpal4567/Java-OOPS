package inheritance.heirarchical.example_01;

class Member
{
    String name;
    byte age;
    long contactNo;
    String address;
    float salary;
    public void printSalary()
    {
        System.out.println("Salary:\t"+this.salary);
    }
}
class Employee extends Member
{
    String specialization;
}
class Manager extends Member
{
    String department;
}
public class Officer {
    public static void main(String[] args)
    {
        Employee emp = new Employee();
        emp.name = "Sachin";
        emp.age = 23;
        emp.contactNo = 9999875457l;
        emp.address = "Greater Noida";
        emp.salary = 25000.00f;
        emp.specialization = "Car Mechanic";

        System.out.println("Employee Details");
        System.out.println("Name:\t"+emp.name);
        System.out.println("Age:\t"+emp.age);
        System.out.println("Cont no:"+emp.contactNo);
        System.out.println("Address:"+emp.address);
        emp.printSalary();

        Manager man = new Manager();
        man.name = "Lalit Pal";
        man.age = 24;
        man.contactNo = 9923645457l;
        man.address = "New Delhi";
        man.salary = 30000.00f;
        man.department = "Service department";

        System.out.println("\nManager Details");
        System.out.println("Name:\t"+man.name);
        System.out.println("Age:\t"+man.age);
        System.out.println("Cont no:"+man.contactNo);
        System.out.println("Address:"+man.address);
        man.printSalary();
    }
}

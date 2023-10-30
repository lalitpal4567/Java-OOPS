package inheritance.singleInheritance.example_23;

class Person
{
    private String firstName;
    private String lastName;

    Person(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFirstName()
    {
        return firstName;
    }
    public String getLastName()
    {
        return lastName;
    }
}
class Employee extends Person
{
    int empId;
    String jobTitle;

    Employee(String firstName, String lastName, int empId, String jobTitle)
    {
        super(firstName, lastName);
        this.empId = empId;
        this.jobTitle = jobTitle;
    }
    public int getEmployeeId()
    {
        return empId;
    }
    @Override
    public String getLastName()
    {
        return super.getLastName() + ", " + jobTitle;
    }
}
public class Worker {
    public static void main(String[] args)
    {
        Employee emp = new Employee("Sachin", "Kumar", 1250, "Car Mechanic");
        System.out.println(emp.getFirstName() + " " + emp.getLastName() + ", " + emp.empId);
    }
}

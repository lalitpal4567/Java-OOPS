package inheritance.singleInheritance.example_05;

class Employee
{
    void salary()
    {
        System.out.println("Salary: 200000/-");
    }
}

class Programmer extends Employee
{
    void jobRole()
    {
        System.out.println("Job role: Web developer");
    }
    void bonus() {
        System.out.println("Bonus: 50000/-");
    }
}

public class MonthlySalary {
    public static void main(String args[])
    {
        Programmer obj = new Programmer();
        obj.jobRole();
        obj.salary();
        obj.bonus();
    }
}

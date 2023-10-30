package polymorphism.overriding.interfaceMethodsOverriding;

interface Department{
    default void departmentName(){
        System.out.println("This is salary department.");
    }
}
class PayrollDepartment implements Department{
    @Override
    public void departmentName(){
        System.out.println("This is Payroll Department.");
    }
}

public class DefaultMethodOverriding extends PayrollDepartment{
    @Override
    public void departmentName(){
        System.out.println("This is PF department.");
    }

    public static void main(String[] args) {
        DefaultMethodOverriding obj = new DefaultMethodOverriding();
        obj.departmentName();

        Department department = new DefaultMethodOverriding();
        department.departmentName();

        Department department2 = new DefaultMethodOverriding();
        department2.departmentName();
    }
}

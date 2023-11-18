package relationship.aggregation;

import java.util.HashSet;
import java.util.Set;

class Department{
    private String name;
    Department(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                '}';
    }
}
class University{
    private String name;
    private Set<Department> departments;
    University(String name){
        this.name = name;
        departments = new HashSet<>();
    }
    public void addDepartment(Department department){
        departments.add(department);
    }
    public void removeDepartment(Department department){
        departments.remove(department);
    }
    public Set<Department> getAllDepartment(){
        return departments;
    }

}
public class UniversityController {
    public static void main(String[] args) {
        University university = new University("LPU");
        Department department1 = new Department("Computer Science");
        Department department2 = new Department("Mechanical");
        Department department3 = new Department("Electrical");

        university.addDepartment(department1);
        university.addDepartment(department2);
        university.addDepartment(department3);

        Set<Department> departments = university.getAllDepartment();
//        for(Department department : departments){
//            System.out.println(department);
//        }

        university.removeDepartment(department1);
        for(Department department : departments){
            System.out.println(department);
        }
    }
}

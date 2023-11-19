package encapsulation;

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;

        if(age > 0){
            this.age = age;
        }else{
            System.out.println("enter valid age");
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class StudentExample {
    public static void main(String[] args) {
        Student myStudent = new Student("Raj", -20);

//        System.out.println("Name: " + myStudent.getName());
//        System.out.println("Age: " + myStudent.getAge());

        myStudent.displayInfo();
    }
}

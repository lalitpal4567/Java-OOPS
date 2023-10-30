package inheritance.singleInheritance;

class Person{
    public void greeting(){
        System.out.println("good afternoon everyone");
    }
}

public class SameMethodInBothClass extends Person{
    public void greeting(){
        System.out.println("good morning everyone!!!");
    }

    public static void main(String[] args) {
        SameMethodInBothClass obj = new SameMethodInBothClass();
        obj.greeting();     // good morning everyone

        Person obj2 = new SameMethodInBothClass();
        obj2.greeting();    // good morning everyone
        ((SameMethodInBothClass)obj2).greeting();   //  good morning everyone
    }
}

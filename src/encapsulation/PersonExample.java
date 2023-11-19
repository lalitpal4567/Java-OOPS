package encapsulation;

import java.util.ArrayList;
import java.util.List;

class Person {
    private String name;
    private int age;
    private List<String> phoneNumbers;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.phoneNumbers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<String> getPhoneNumbers() {
        return new ArrayList<>(phoneNumbers); // Return a copy to prevent direct modification
    }

    public void addPhoneNumber(String phoneNumber) {
        if (isValidPhoneNumber(phoneNumber)) {
            phoneNumbers.add(phoneNumber);
            System.out.println("Phone number added successfully.");
        } else {
            System.out.println("Invalid phone number format.");
        }
    }

    public void displayContactInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone Numbers: " + phoneNumbers);
    }

    // Private method for phone number validation
    private boolean isValidPhoneNumber(String phoneNumber) {
        return phoneNumber.matches("\\d{10}");
    }
}

public class PersonExample {
    public static void main(String[] args) {
        Person johnDoe = new Person("Vishal", 25);

        // Accessing information through public methods
        System.out.println("Name: " + johnDoe.getName());
        System.out.println("Age: " + johnDoe.getAge());
        System.out.println("Phone Numbers: " + johnDoe.getPhoneNumbers());

        // Performing contact operations
        johnDoe.addPhoneNumber("1234567890");
        johnDoe.addPhoneNumber("9876543210");
        johnDoe.displayContactInfo();
    }
}

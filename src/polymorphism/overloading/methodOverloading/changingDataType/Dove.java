package polymorphism.overloading.methodOverloading.changingDataType;

public class Dove {
    public static void fly(int numMiles){
        System.out.println("int");
    }
    public static void fly(short numFeet){
        System.out.println("short");
    }
    public static void main(String[] args) {
        fly(1);     // int
        fly((short)1);      // short
    }
}

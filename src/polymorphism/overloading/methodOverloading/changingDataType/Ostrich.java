package polymorphism.overloading.methodOverloading.changingDataType;

public class Ostrich {
    public static void fly(int i){
        System.out.println("int");
    }
    public static void fly(long l){
        System.out.println("long");
    }

    public static void main(String[] args) {
        fly(123);
        fly(123L);
    }
}

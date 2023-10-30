package abstraction.interfaces.interfaceWithSameDefaultMethod;

interface City{
    default void powerFacility(){
        System.out.println("electricity is being supplied...");
    }
    static void waterSupply(){
        System.out.println("Ganga Jal");
    }
}

public class Village implements City{
    public void powerNetwork(){
        powerFacility();
        City.super.powerFacility();
//        super.powerFacility();  // compilation error
//        City.powerFacility();   // compilation error
        City.waterSupply();
//        City.super.waterSupply();   // Static method may be invoked on containing interface class only
    }

    public static void main(String[] args) {
        Village obj = new Village();
        obj.powerNetwork();
        obj.powerFacility();
    }
}

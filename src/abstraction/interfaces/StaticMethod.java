package abstraction.interfaces;

interface SupremeCourt{
    static void interfaceName(){
        System.out.println("This is SuperemeCourt interface.");
    }
}
class HighCourt implements SupremeCourt{
    public String className(){
        return "HighCourt";
    }
}

public class StaticMethod {
    public static void main(String[] args) {
        HighCourt court = new HighCourt();
        System.out.println(court.className());

//        court.interfaceName();  // compilation error
                                // static methods of interface are never inherited in child class.
                                // Static method can be call through interface class only

//        HighCourt.interfaceName();  // compilation error

        SupremeCourt.interfaceName();

    }
}

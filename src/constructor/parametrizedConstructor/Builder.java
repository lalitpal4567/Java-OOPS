package constructor.parametrizedConstructor;

class Building
{
    int noOfRooms;
    int noOfFloors;
    String address;
    String owner;

    Building()
    {
        // default constructor will not be called automatically bcz we have to
        // explicitly write this() in order to call default constructor from
        // parameterized constructor or vice versa in the same class.
        System.out.println("Default constructor has been called.");
    }
    Building(int noOfRooms, int noOfFloors, String address, String owner)
    {
//        this();
        this.noOfRooms = noOfRooms;
        this.noOfFloors = noOfFloors;
        this.address = address;
        this.owner = owner;
    }

    public void showDetail()
    {
        System.out.println("Rooms: " + noOfRooms);
        System.out.println("Floors: " + noOfFloors);
        System.out.println("Address: " + address);
        System.out.println("Owner: " + owner);
    }

}
public class Builder
{
    public static void main(String[] args)
    {
        Building obj = new Building(2,1,"Phase- III Delhi","Lalit");
        obj.showDetail();
    }
}


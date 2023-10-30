package constructor.constructorChaining.thisKeywordInSameClass;


class Building
{
    String ownerName;
    short numberOfFloors;
    short numberOfRooms;
    String address;
    boolean isLiftAvailable;

    Building()
    {
        ownerName = "Lalit";
    }
    Building(short numberOfFloors)
    {
        this();
        this.numberOfFloors = numberOfFloors;
    }
    Building(short numberOfFloors, short numberOfRooms)
    {
        this(numberOfFloors);
        this.numberOfRooms = numberOfRooms;
    }
    Building(short numberOfFloors,short numberOfRooms,String address)
    {
        this(numberOfFloors, numberOfRooms);
        this.address = address;
    }
    Building(short numberOfFloors, short numberOfRooms, String address, boolean isLiftAvailable)
    {
        this(numberOfFloors, numberOfRooms, address);
        this.isLiftAvailable = isLiftAvailable;
    }
    void showDetails()
    {
        System.out.println("Owner name: " + ownerName);
        System.out.println("Number of Floors: " + numberOfFloors);
        System.out.println("Number of Rooms: " + numberOfRooms);
        System.out.println("Address: " + address);
        System.out.println("Lift available: " + isLiftAvailable);
    }
}

public class ConstructorChain03 {
    public static void main(String[] args)
    {
        Building building;
        // building = new Building();
        // building = new Building((short)5);
        // building = new Building((short)5, (short)50);
        // building = new Building((short)3, (short)50, "noida");
        building = new Building((short)6,(short)10, "Delhi", true);
        building.showDetails();
    }
}

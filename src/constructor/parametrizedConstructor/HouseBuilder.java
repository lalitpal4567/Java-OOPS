package constructor.parametrizedConstructor;

class House
{
    short numberOfRooms;
    short numberOfHall;
    short numberOfKitchens;
    String houseName;
    int numberOfToiletRooms;

    House(short rooms, short halls)
    {
        // no need to use this keyword as local and instance variables names
        // are different
        numberOfRooms = rooms;
        numberOfHall = halls;
    }

    void showInfo()
    {
        System.out.println("Rooms: " + numberOfRooms);
        System.out.println("Hall: " + numberOfHall);
        System.out.println("Kitchens: " + numberOfKitchens);
        System.out.println("House name: " + houseName);
        System.out.println("Toilet rooms: " + numberOfToiletRooms);
    }

}
public class HouseBuilder
{
    public static void main(String[] args) {
        House obj = new House((short)4,(short)2);   // typecasting from int to short
        obj.numberOfKitchens = 1;
        obj.numberOfToiletRooms = 2;
        obj.houseName = "Swarg";    // swarg means heaven
        obj.showInfo();
    }
}

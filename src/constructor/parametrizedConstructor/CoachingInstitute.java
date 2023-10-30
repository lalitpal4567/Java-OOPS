package constructor.parametrizedConstructor;

class Room
{
    int noOfFans;
    int noOfChairs;
    int noOfTable;
    int noOfCameras;
    String isProjectorRequired;
    String isWhiteboardRequired;

    Room(int noOfFans, int noOfChairs, int noOfTable, int noOfCameras)
    {
        this.noOfFans = noOfFans;
        this.noOfChairs = noOfChairs;
        this.noOfTable = noOfTable;
        this.noOfCameras = noOfCameras;
    }
    public void setProjectorRequirement(String str)
    {
        isProjectorRequired = str;
    }
    public void setWhiteboardRequirement(String str)
    {
        isWhiteboardRequired = str;
    }
    public void showInfo()
    {
        System.out.println("No. of fans are: " + noOfFans);
        System.out.println("No. of chairs are: " + noOfChairs);
        System.out.println("No. of tables are: " + noOfTable);
        System.out.println("No. of cameras are: " + noOfCameras);
        System.out.println("Projector facility: " + isProjectorRequired);
        System.out.println("Whiteboard facility: " + isWhiteboardRequired);
    }
}
public class CoachingInstitute
{
    public static void main(String[] args) {
        Room obj = new Room(2,15,1,1);
        obj.setProjectorRequirement("No");
        obj.setWhiteboardRequirement("Yes");
        obj.showInfo();
    }
}


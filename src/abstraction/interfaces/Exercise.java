package abstraction.interfaces;

interface Walk{
    public default int getSpeed(){return 5;}
}
interface Run{
    public default int getSpeed(){return 10;}
}
public class Exercise implements Walk, Run{
    @Override
    public int getSpeed(){
        return 1;
    }
    public int getWalkSpeed(){
        return Walk.super.getSpeed();
//        return Walk.getSpeed(); // compilation error
//        return Run.getSpeed();      // compilation error
    }
    public static void main(String[] args) {
        Exercise obj = new Exercise();
        System.out.println(obj.getSpeed());
    }
}

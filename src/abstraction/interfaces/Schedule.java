package abstraction.interfaces;

interface NewSchedule{
    default void wakeup(){
        checkTime(7);
    }
    static void workOut(){
        checkTime(18);
    }
    private void haveBreakFast(){
        checkTime(10);
    }
    private static void checkTime(int hour){
        if(hour > 17)
            System.out.println("you are late");
        else
            System.out.println("you have " + (17 - hour) + "hours left");
    }
}
public class Schedule {
    public static void main(String[] args) {

    }
}

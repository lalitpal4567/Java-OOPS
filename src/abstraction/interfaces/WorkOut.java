package abstraction.interfaces;

interface Hop{
    static int getJumpHeight(){
        return 10;
    }
}
public class WorkOut {
    public int skip(){
        return Hop.getJumpHeight();
    }
    public static void main(String[] args) {
        WorkOut obj = new WorkOut();
        System.out.println(obj.skip());
    }
}

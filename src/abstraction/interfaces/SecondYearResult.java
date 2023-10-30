package abstraction.interfaces;

interface SemesterResult{
    float uhv = 54;     // public static final by default
    public float sensor = 47.7f;
    static float coa = 60;
    final float dsa = 70;
    public static float python = 34;
    public final float dstl = 44;
    static final float coaLab = 60;
    public static final float dsLab = 60;
}

public class SecondYearResult implements SemesterResult{
    public void showResult(){
        System.out.println("Universal human value: \t" + uhv);
        System.out.println("Sensor & Instruments: \t" + sensor);
        System.out.println("Computer Architecture: \t" + coa);
        System.out.println("Data Structure: \t\t" + dsa);
        System.out.println("Python Programming: \t" + python);
        System.out.println("Discrete Mathematics: \t" + dstl);
        System.out.println("Computer Architecture Lab: \t" + coaLab);
        System.out.println("Data Structure Lab: \t" + dsLab);
    }

    public static void main(String[] args){
        SecondYearResult obj = new SecondYearResult();
        obj.showResult();
    }
}

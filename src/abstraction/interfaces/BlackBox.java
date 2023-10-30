package abstraction.interfaces;

interface WhiteBox{
    String color = "white";
}
public class BlackBox implements WhiteBox{
    public static String color = "black";
    public static void main(String[] args) {
        System.out.println(color);
        System.out.println(WhiteBox.color);
    }
}

package inheritance.constructorINheritance;

class Box{
    double width;
    double height;
    double depth;

    Box(){
        width = 0.0;
        height = 0.0;
        depth = 0.0;
    }
    Box(double width, double height, double depth){
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    public double volume(){
        return width * height * depth;
    }
}
class BoxWeight extends Box{
    double weight;

    BoxWeight(){
        super();
        weight = 0.0;
    }
    BoxWeight(double width, double height, double depth, double weight){
        super(width, height, depth);
        this.weight = weight;
    }
}
public class ConstructorDemo {
    public static void main(String[] args) {
        Box obj = new Box(10, 20, 30);
        BoxWeight obj2 = new BoxWeight(2, 3, 4, 5);

        System.out.println(obj.volume());   // 6000.0
        System.out.println(obj2.volume());  // 24.0
    }



}

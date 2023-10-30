package constructor;

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

    BoxWeight(double width, double height, double depth, double weight){
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.weight = weight;
    }
}
public class ConstructorDemo {
    public static void main(String[] args) {
        Box obj = new Box();
        BoxWeight obj2 = new BoxWeight(2, 3, 5, 0.7);

        System.out.println(obj.volume());   // 0.0
        System.out.println(obj2.volume());  // 30.0
    }
}

package abstraction.interfaces;

interface AreaCircle{
    void calculateArea();
}
interface AreaSquare{
    void calculateArea();
}

public class DuplicateAbstractMethod implements AreaCircle, AreaSquare{
    @Override
    public void calculateArea(){
        System.out.println("calculating area...");
    }

    public static void main(String[] args) {
        DuplicateAbstractMethod obj = new DuplicateAbstractMethod();
        obj.calculateArea();
    }
}

package abstraction.interfaces.interfaceWithSameDefaultMethod;

interface Dad{
    default void visitingTouristPlace(){    // public by default
        System.out.println("visiting Taj Mahal...");
    }
}
interface Mom{
    default void visitingTouristPlace(){
        System.out.println("visiting Red-Fort");
    }
}

public class Offspring implements Dad, Mom{
    @Override
    public void visitingTouristPlace(){
        Mom.super.visitingTouristPlace();
    }

    public static void main(String[] args) {
        Offspring obj = new Offspring();
        obj.visitingTouristPlace();     // visiting Red-Fort

        Mom obj2 = new Offspring();
        obj2.visitingTouristPlace();    // visiting Red-Fort

        Dad obj3 = new Offspring();
        obj3.visitingTouristPlace();    // visiting Red-Fort
    }
}

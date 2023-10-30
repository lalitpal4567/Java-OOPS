package abstraction.interfaces.interfaceWithSameDefaultMethod;

interface Father{
    default void eatingFavouriteFood(){
        System.out.println("having chicken - 65");
    }
}
interface Mother{
    default void eatingFavouriteFood(){
        System.out.println("having rajma-chawal");
    }
}
public class Children implements Father, Mother{
    @Override
    public void eatingFavouriteFood() {
//        Father.super.eatingFavouriteFood();
        System.out.println("eating hamburger...");
    }

    public static void main(String[] args) {
        Children obj = new Children();
        obj.eatingFavouriteFood();
    }
}

package abstraction.interfaces;

public interface ZooRenovation {
    public String projectName();
    abstract String status();
    default void printStatus(){
        System.out.println(projectName() + "   " + status());
    }
}

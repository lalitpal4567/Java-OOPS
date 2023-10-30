package abstraction.interfaces;

interface SensorBoard{
    void relevantContent();
}
abstract class FilmIndustry implements SensorBoard{
    public void historyBasedScene(){
        System.out.println("Padmavat, PK and so on.");
    }
}

public class Bollywood extends FilmIndustry{
    @Override
    public void relevantContent(){
        System.out.println("We always show relevant content.");
    }

    public static void main(String[] args) {
        Bollywood padmavat  = new Bollywood();
        padmavat.relevantContent();
        padmavat.historyBasedScene();

        System.out.println();
        FilmIndustry obj2 = new Bollywood();
        obj2.relevantContent();
        obj2.relevantContent();

        System.out.println();
        SensorBoard obj3 = new Bollywood();
        obj3.relevantContent();
    }
}

package abstraction.interfaces.StaticNonStaticReference;

// Default method can call both private, static and private static
interface Weather{
    default void weatherType(){
        System.out.println(weatherRequest());
    }
    default String weatherPreparingRequest(){
        return weatherRequest();
    }
    private String weatherRequest(){
        return weatherCall();
    }
    private String weatherCall(){
        return weatherFetch();
    }
    private static String weatherFetch(){
        return weatherName();
    }
    static String weatherName(){    // public by default
        return "Summer";
    }
}

public class WeatherForecast implements Weather{
    public static void main(String[] args) {
        WeatherForecast obj = new WeatherForecast();
        obj.weatherType();  // Summer

        System.out.println();
        Weather obj2 = new WeatherForecast();
        obj2.weatherType();     // Summer
    }
}

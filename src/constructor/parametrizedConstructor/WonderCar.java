package constructor.parametrizedConstructor;

public class WonderCar {
    private String make;
    private String model;
    private int year;

    public WonderCar(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void showInfo()
    {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }

    public static void main(String[] args)
    {
        WonderCar obj = new WonderCar("Toyota", "Corolla", 2015);
        obj.showInfo();
    }
}



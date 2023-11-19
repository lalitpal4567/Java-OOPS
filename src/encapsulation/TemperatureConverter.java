package encapsulation;

public class TemperatureConverter {
    private double celsius;

    // Setter method for Celsius temperature with data validation
    public void setCelsius(double celsius) {
        if (celsius >= -273.15) {
            this.celsius = celsius;
        } else {
            System.out.println("Invalid temperature value for Celsius.");
        }
    }

    public double getCelsius() {
        return celsius;
    }

    public double getFahrenheit() {
        return (celsius * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        TemperatureConverter temperature = new TemperatureConverter();
        temperature.setCelsius(35);

        System.out.println(temperature.getCelsius());
        System.out.println(temperature.getFahrenheit());

    }
}

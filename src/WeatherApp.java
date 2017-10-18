import java.io.IOException;

public class WeatherApp {
    public static void main(String[] args) throws IOException {
        WeatherApi api = new WeatherApi();
        int temperature = api.getTemperature("wrocław");
        String description = api.getDescription("warszawa");
        System.out.println(temperature + description);
    }
}

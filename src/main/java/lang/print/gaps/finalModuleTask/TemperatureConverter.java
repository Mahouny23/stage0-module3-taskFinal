package lang.print.gaps.finalModuleTask;

public class TemperatureConverter {
    public void toFahrenheit(int temperatureCelsius){
        double far = (temperatureCelsius * 9.0/5.0) + 32.0;
        System.out.println(far);
    }
}

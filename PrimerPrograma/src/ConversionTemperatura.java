public class ConversionTemperatura {
    public static void main(String[] args) {
        float gradosCelsius = 10.3F;
        int gradosFahrenheit = (int) (gradosCelsius * 1.8) + 32;
        String mensaje = """
                Conversor de temperaturas de °C a °F
                °%.1fC (Celsius) equivalen a °%dF (Fahrenheit);
                """.formatted(gradosCelsius, gradosFahrenheit);
        System.out.println(mensaje);
    }
}

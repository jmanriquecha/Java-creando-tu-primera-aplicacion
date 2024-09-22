import java.util.Scanner;

public class LecturaDatos {
    public static void main(String[] args) {
        // Lectura de datos
        System.out.println("Ingrese su nombre:");
        var scanner = new Scanner(System.in);
        var nombre = scanner.nextLine();
        var saludo = "Hola, %s bienvenido a mi sitio web: ".formatted(nombre);
        System.out.println(saludo);
        scanner.close();
    }
}

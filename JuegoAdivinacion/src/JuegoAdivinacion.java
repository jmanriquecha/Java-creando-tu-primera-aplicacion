import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinacion {
    public static void main(String[] args) {
        // Descripción del programa
        /*
         * Crea un programa que simule un juego de adivinanzas.
         * El programa debe generar un número aleatorio entre 0 y 100,
         * y pedir al usuario que intente adivinar ese número en un máximo de 5 intentos.
         * En cada intento, el programa debe informar si el número ingresado
         * por el usuario es mayor o menor que el número generado.
         * */

        System.out.println("*** Adivina el Número Secreto ***");

        // Declaración de variables
        Scanner teclado = new Scanner(System.in);
        var min = 0;
        var max = 101;
        var numeroAleatorio = new Random().nextInt(min, max); // Genera número aliatorio entre min y max
        var intentosPermitidos = 5;
        var intentosRealizados = 1;
        var numeroUsuario = 0;

        while (intentosRealizados <= intentosPermitidos) {
            System.out.println("Ingrese un número entre %d y %d para adivinar el número secreto".formatted(min, max - 1));
            numeroUsuario = teclado.nextInt();

            // Validamos datos
            if (numeroAleatorio == numeroUsuario) {
                System.out.println("¡Genial Adivinaste! El número secreto es: "
                        + numeroAleatorio + ", Necesitaste " + intentosRealizados + " intentos");
                break; // Rompe el bucle
            }

            // Mostramos información al usuario si el número ingresado es mayor ó menor que el número secreto
            if (numeroUsuario > numeroAleatorio) {
                System.out.println("El número Secreto es MENOR");
            } else {
                System.out.println("El número Secreto es MAYOR");
            }

            if (intentosRealizados == intentosPermitidos) {
                System.out.println("¡PERDISTE! Lo siento terminaste tús %d intentos permitidos, el número secreto era %d".formatted(intentosPermitidos, numeroAleatorio));
            }

            intentosRealizados++; // Incrementa intentos en 1
        }
        teclado.close();
    }
}

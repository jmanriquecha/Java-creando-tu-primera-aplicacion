import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        // Se instancia la clase Scanner
        Scanner teclado = new Scanner(System.in);
        // Calcular promedio de notas

        // Declaración de variables
        var flag = true;
        int contador = 0;
        double suma = 0;
        double nota;
        int cantidadNotas;

        // Se pide al usuario la cantidad de notas que va a promediar
        System.out.println("*** Sistema para promediar notas ***");
        System.out.println(" --- Ingrese la cantidad de notas --- ");
        cantidadNotas = teclado.nextInt();

        // Se crea Loop
        while (flag){ // Se ejecuta el Loop mientras flag == true
            contador++; // Se incrementa contador en 1
            System.out.println("Ingrese la nota " + (contador)); // Ej. (3,5)
            nota = teclado.nextDouble(); // Se solicita al usuario ingresar la nota
            suma += nota; // Se realiza la suma de las notas
            if(contador >= cantidadNotas){
                flag = false; // Finaliza el Loop
                System.out.println("Promedio obtenido: " + (suma/(contador))); // Muestra el promedio
            }
        }
    }
}

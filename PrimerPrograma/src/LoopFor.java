import  java.util.Scanner;

public class LoopFor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int cantidadNotas = 0;
        double nota = 0;
        double media = 0;
        String pelicula = null;

        // Solicitamos al usuario el nombre de la película que va a evaluar
        System.out.println("¿Nombre de la película que va a evaluar?");
        pelicula = teclado.nextLine();

        // Solicitamos al usuario cuantas notas desea ingresar
        System.out.println("¿Cuántas notas desea ingresar?");
        cantidadNotas = teclado.nextInt();

        for (int i = 0; i < cantidadNotas; i++){
            System.out.println("Escribe la nota que le darias a la película ".concat(pelicula));
            nota = teclado.nextDouble();
            media += nota;
        }
        System.out.println("La media de evaluaciones para ".concat(pelicula).concat(" es: ") + String.format("%.2f", media / cantidadNotas));
    }
}
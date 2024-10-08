import java.util.Scanner;

public class AppBancaria {
    public static void main(String[] args) {
        // Desafio, Realizar una app bancaria

        // Declaración de variables
        Scanner scanner = new Scanner(System.in); // Permite ingresar datos por teclado
        String nombreCliente = "Tony Stark";
        String tipoCuenta = "Corriente";
        double saldo = 1599.99;
        String detalleCuenta = null;
        String detalleOpcion = null;
        int opcionElegida = 0;
        boolean flag = true;

        // Se crea el detalle de la cuenta
        detalleCuenta = """
                ************************************************
                Nombre del cliente: %s
                Tipo de cuenta: %s
                Saldo disponible: $%.2f
                ************************************************
                """.formatted(nombreCliente, tipoCuenta, saldo);

        // Imprime detalle de la cuenta
        System.out.println(detalleCuenta);

        // Se crea el detalle de la opción disponible
        detalleOpcion = """
                ** Escriba el número de la opción deseada **
                1 - Consultar Saldo
                2 - Retirar
                3 - Depositar
                4 - Salir
                """;

        while (flag != false){
            // Imprime el detalle de la opción a elegir
            System.out.println(detalleOpcion);
            opcionElegida = scanner.nextInt();

            // Se realizan las respectivas validaciones
            switch (opcionElegida){
                case 1:
                    System.out.println("El saldo actualizado es: $%.2f".formatted(saldo));
                    break;

                case 2:
                    System.out.println("¿Cuál es el valor que deseas retirar?");
                    double valorRetirar = scanner.nextDouble();

                    if (valorRetirar > 0) {
                        if (valorRetirar > saldo) {
                            System.out.println("Saldo insuficiente");
                        } else {
                            saldo -= valorRetirar;
                            System.out.println("Saldo restante $%.2f".formatted(saldo));
                        }
                    }else{
                        System.out.println("Ocurrio un error en la transacción!");
                    }
                    break;

                case 3:
                    System.out.println("¿Cuál es el valor que vas a depositar");
                    double valorDepositar = scanner.nextDouble();
                    if (valorDepositar <= 0){
                        System.out.println("Ocurrio un error en la transacción!");
                    }else{
                        saldo += valorDepositar;
                        System.out.println("El saldo actualizado es: $%.2f".formatted(saldo));
                    }
                    break;

                case 4:
                    System.out.println("Finalizando el programa. Muchas gracias por usar nuestros servicios!");
                    flag = false; // Termina la ejecución del while
                    break;

                default:
                    System.out.println("¡No ha elegido una opción valida! por favor intente nuevamente");
                    break;
            }
        }
        scanner.close();
    }
}

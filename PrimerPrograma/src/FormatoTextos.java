public class FormatoTextos {
    public static void main(String[] args) {
        // format
        String nombre = "Juan";
        int edad = 30;
        double dineroGastadoHoy = 99000.45;

        System.out.println(String.format("Hola mi nombre es %s tengo %d años, hoy gaste $%.2f COP", nombre, edad, dineroGastadoHoy));

        System.out.println("------------------------------------");
        // Con Text Block
        var name = "Jorge";
        var aulas = 30;
        var bienvenida = """
                Hola, %s,
                Bienvenid@ al curso de java.
                Tenemos %d aulas preparadas para tí
                """.formatted(name, aulas);

        System.out.println(bienvenida);
    }
}

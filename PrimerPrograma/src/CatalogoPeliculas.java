public class CatalogoPeliculas {
    public static void main(String[] args) {
        System.out.println("Bienvenid@s a Screen Match");
        System.out.println("Pelicula Matrix");

        // Declaración de variables
        int fechaLanzamiento = 1999;
        boolean incluidoEnElPlan = true;
        double notaPelicula = 8.2;
        double mediaNota = (8.2 + 5 + 9.9 + 2 + 3) / 5;

        // Salida
        System.out.println("Calificación de la pelicula: " + mediaNota);

        String sinopsis = """
                          Matrix es una paradoja
                          La mejor pelicula del fin del milenio
                          Fué lanzada en: 
                          """ + fechaLanzamiento;
        System.out.println(sinopsis);

        // Casting
        int clasificacion = (int) (mediaNota / 2);
        System.out.println(clasificacion);
    }
}

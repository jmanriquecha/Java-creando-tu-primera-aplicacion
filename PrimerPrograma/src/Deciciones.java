public class Deciciones {
    public static void main(String[] args) {
        // Declaración de variables
        int fechaLanzamiento = 1999;
        boolean incluidoEnElPlan = true;
        double notaPelicula = 8.2;
        double mediaNota = (8.2 + 5 + 9.9 + 2 + 3) / 5;
        String tipoPlan = "plus";

        // Decidimos que hacer
//        if (fechaLanzamiento > 2022){
//            System.out.println("Películas más populares");
//        }else {
//            System.out.println("Películas retro que aun vale la pena ver");
//        }

        if (incluidoEnElPlan || tipoPlan.equals("pluss")){
            System.out.println("Disfrute de su película");
        }else{
            System.out.println("Película no esta disponible en su plan actual");
        }

    }
}

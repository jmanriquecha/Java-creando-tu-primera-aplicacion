public class SentenciaSwitch {
    public static void main(String[] args) {
        // Switch
        var dia = 7;
        String mensaje = null;

        switch (dia){
            case 1:
                mensaje = "Domingo";
                break;
            case 2:
                mensaje = "Lunes";
                break;
            case 3:
                mensaje = "Martes";
                break;
            case 4:
                mensaje = "Miércoles";
                break;
            case 5:
                mensaje = "Jueves";
                break;
            case 6:
                mensaje = "Viernes";
                break;
            case 7:
                mensaje = "Sábado";
                break;
            default:
                mensaje = "Día de la semana no válido";
                break;
        }

        // imprime día de la semana
        System.out.println(mensaje);
    }
}

public class VerificarContrasenia {
    public static void main(String[] args) {
        String contraseniaSistema = "12345";
        String contraseniaUsuario = "12345";

        if (contraseniaSistema.equals(contraseniaUsuario)){
            System.out.println("Bienvenido al sistema, la contraseña es correcta");
        }else {
            System.out.println("Lo siento la contraseña no es correcta");
        }
    }
}

import enity.Usuario;
import enity.Carros;

public class Main {
    public static void main(String[] args){
        Usuario usuario = new Usuario();
        usuario.setIdUser(1);

        Carros usuarioCar = new Carros();
        usuarioCar.setId(12);

        Object idUser = usuario.getIdUser();
        System.out.println(usuario.equals(usuarioCar.getId()));
    }
}
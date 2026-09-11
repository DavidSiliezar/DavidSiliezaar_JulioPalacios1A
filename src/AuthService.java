import java.util.HashMap;
import java.util.Map;

public class AuthService {


    Map<String , String > auth = new HashMap<>();
    Map<String , String > auth2 = new HashMap<>();

    public void registroUsuarios(String username , String password , String nombreCompleto , String email){
        new Usuario(username, password, nombreCompleto, email);

        if (auth.isEmpty() && auth2.isEmpty()) {

            auth.put(username, password);

            auth2.put(nombreCompleto, email);
        } else {
            System.out.println("Ya existe un usuario con esos datos");
        }
    }

    public void iniciarSesion(String username, String password){
        new Usuario(username, password);
        if (auth.containsKey(username) || auth.containsValue(password)){
            System.out.println("Bienvenido al sistema: " + username);
        }else {
            System.out.println("Datos incorrectos");
        }
    }

    public void eliminarCuenta (String username  ){
        if (auth.containsKey(username)){
            auth.remove(username);

            System.out.println("Usuario Eliminado");


        } else {
            System.out.println("No existe dicha cuenta");
        }
    }

    public boolean disponibilidadUsername(String username){
        return !auth.containsKey(username);



    }
}

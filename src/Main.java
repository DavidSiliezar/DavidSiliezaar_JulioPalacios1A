import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.StringTokenizer;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        AuthService auth = new AuthService();

        int opcion;

        String usuario;
        String clave;
        String nombreCompleto;
        String email;

        try {

        do {

            System.out.println("AUTHSERVICE - CONTROL DE ACCESOS");
            System.out.println("Seleccione una opcion");
            System.out.println("1. Registrar nuevo usuario");
            System.out.println("2. Iniciar Sesión");
            System.out.println("3. Eliminar cuenta de usuario");
            System.out.println("4. Verificar disponibilidad de usarname");
            System.out.println("5. Salir");
            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion){
                case 1:
                    System.out.println("Ingresa tu nombre de usuario y contraseña");
                    usuario = sc.nextLine();
                     clave = sc.nextLine();
                    System.out.println("Ingresa tu nombre completo y email");
                     nombreCompleto = sc.nextLine();
                     email = sc.nextLine();
                    auth.registroUsuarios(usuario,clave, nombreCompleto, email);
                    break;

                case 2:
                    System.out.println("Bienvenido al inicio de sesion");
                    System.out.println("Ingrese su nombre de usuario:");
                     usuario = sc.nextLine();
                    System.out.println("Ingrese su contraseña");
                     clave = sc.nextLine();
                     auth.iniciarSesion(usuario,clave);
                    break;


                case 3 :
                    System.out.println("Ingresa usuario a eliminar:");
                    usuario = sc.nextLine();
                    auth.eliminarCuenta(usuario);
                    break;


                case 4 :
                    System.out.println("Ingresa usuario para verificar su disponibilidad");
                    usuario = sc.nextLine();
                    auth.disponibilidadUsername(usuario);
                    break;

                case 5 :
                    System.out.println("Saliendo del sistema");
                    break;

                default:
                    System.out.println("Opcion invalida");
                    break;
            }

        }while (opcion !=5);


        }
        catch (Exception e)
        {
            System.out.println("Datos invalidos");
        }

        sc.close();

    }
}
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        Map<Object, Object> user = new HashMap<>();
        user.put("Carlos", "12345");
        user.put("admin", "123456");

        boolean isAutenticated = false;

        System.out.print("Ingrese el username: ");
        String u = scan.nextLine();

        System.out.print("Ingrese el password: ");
        String p = scan.nextLine();

        isAutenticated = ((user.get(u).equals(p))) ? true : false;

        String mensaje = isAutenticated ? "Bienvenido usuario ".concat(u).concat("!")
                : "Lo siento requiere autenticación\nuser name o contraseña incorrecta!";

        System.out.println(mensaje);
        scan.close();
    }
}

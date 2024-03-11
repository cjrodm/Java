import java.util.Scanner;

public class SistemaNumerico {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int seleccion = 0;

        while (seleccion != 4) {

            seleccion = menu();

            switch (seleccion) {
                case 1 -> {
                    int numeroDecimal = getnumero();
                    System.out.println("numero Digitado: " + numeroDecimal);
                    System.out.println("numero binario de: " + numeroDecimal + " : "
                            + Integer.toBinaryString(numeroDecimal));
                }
                case 2 -> {
                    int numeroDecimal = getnumero();
                    System.out.println("numero Digitado: " + numeroDecimal);
                    System.out.println(
                            "numero Octal de: " + numeroDecimal + " : " + Integer.toOctalString(numeroDecimal));
                }
                case 3 -> {
                    int numeroDecimal = getnumero();
                    System.out.println("numero Digitado: " + numeroDecimal);
                    System.out.println(
                            "numero Hexadecimal de: " + numeroDecimal + " : "
                                    + Integer.toHexString(numeroDecimal));
                }
                case 4 -> System.exit(0);
                default -> System.out.println("Opción no valida. Intente de nuevo.");
            }
        }
    }

    public static int menu() {
        int op = 0;
        while (op <= 0 || op > 4) {

            System.out.println("-----------------");
            System.out.println("\tMenu " +
                    "\n1) Convertir a binario" +
                    "\n2) Convertir a Octal" +
                    "\n3) Convertir a Hexadecimal" +
                    "\n4) Salir");
            System.out.println("-----------------");
            System.out.print("Digita una opción: ");

            try {
                op = Integer.valueOf(scan.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Error: Debes ingresar un numero");
            }
        }
        return op;
    }

    public static int getnumero() {
        System.out.print("Digita el numero a convertir : ");
        return Integer.parseInt(scan.nextLine());
    }

}

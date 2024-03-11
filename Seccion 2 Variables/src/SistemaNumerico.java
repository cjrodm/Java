import java.util.Scanner;

public class SistemaNumerico {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int op = 0, numeroDecimal = 0;

        while (op > 4 || op < 1) {
            System.out.println();
            System.out.println("\tMenu " +
                    "\n1) Convertir a binario" +
                    "\n2) Convertir a Octal" +
                    "\n3) Convertir a Hexadecimal" +
                    "\n4) Salir");
            System.out.print("Digita una opción: ");
            try {
                op = Integer.valueOf(scan.nextLine());
                if (op == 4)
                    System.exit(0);
                if (op >= 1 || op <= 3) {
                    
                    System.out.print("Digita el numero a convertir : ");
                    numeroDecimal = Integer.parseInt(scan.nextLine());

                    switch (op) {
                        case 1 -> {
                            System.out.println("numeroDecimal: " + numeroDecimal);
                            System.out.println(
                                    "numero binario de: " + numeroDecimal + " : "
                                            + Integer.toBinaryString(numeroDecimal));
                        }
                        case 2 -> {
                            System.out.println("numeroDecimal: " + numeroDecimal);
                            System.out.println(
                                    "numero Octal de: " + numeroDecimal + " : " + Integer.toOctalString(numeroDecimal));
                        }
                        case 3 -> {
                            System.out.println("numeroDecimal: " + numeroDecimal);
                            System.out.println(
                                    "numero Hexadecimal de: " + numeroDecimal + " : "
                                            + Integer.toHexString(numeroDecimal));
                        }
                        default -> {
                        }
                    }
                }
            } catch (NumberFormatException e) {
                System.err.println(e);
            }
        }
    }
}

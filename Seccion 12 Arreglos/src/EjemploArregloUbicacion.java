import java.util.Scanner;

public class EjemploArregloUbicacion {
    public static void main(String[] args) {
        int a[] = new int[10];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            while (true) {
                try {
                    System.out.print("Digita el numero " + (i + 1) + ": ");
                    a[i] = sc.nextInt();
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Digito invalido " + e.getMessage());
                }
            }
        }

        System.out.println("\r\nIngresa un numero a buscar: ");
        int num = sc.nextInt();
        int i = 0;
        while (i < a.length && a[i] != num) {
            i++;
        }
        if (i == a.length)
            System.out.println("Numero no encontrado");
        else
            System.out.println("El elemento buscado se encuentra en la posición " + num);

        sc.close();
    }
}

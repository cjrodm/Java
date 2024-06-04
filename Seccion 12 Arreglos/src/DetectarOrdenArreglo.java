import java.util.Scanner;

public class DetectarOrdenArreglo {
    public static void main(String[] args) {
        int a[] = new int[7];
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa 7 digitos");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        boolean asc = false;
        boolean desc = false;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                desc = true;
            }
            if (a[i] < a[i + 1]) {
                asc = true;
            }
        }
        if (asc == true && desc == true) {
            System.out.println("Arreglo = desordenado");
        }

        if (asc == false && desc == false) {
            System.out.println("Son todos iguales");
        }
        if (asc == true && desc == false) {
            System.out.println("Arreglo = Ascendente");
        }
        if (asc == false && desc == true) {
            System.out.println("Arreglo = Descendente");
        }
        sc.close();
    }

}

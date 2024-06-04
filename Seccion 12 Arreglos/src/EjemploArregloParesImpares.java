import java.util.Scanner;

public class EjemploArregloParesImpares {
    public static void main(String[] args) {
        int[] a, pares, impares;
        int totalpares = 0, totalimpares = 0;
        Scanner sc = new Scanner(System.in);
        a = new int[10];
        System.out.println("Digita 10 numeros: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();

        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0)
                totalpares++;
            else
                totalimpares++;
        }
        pares = new int[totalpares];
        impares = new int[totalimpares];

        int j = 0, k = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0)
                pares[j++] = a[i];
            else
                impares[k++] = a[i];

        }

        System.out.println("Pares");
        for (int i = 0; i < pares.length; i++) {
            System.out.print(pares[i] + " ");
        }
        
        System.out.println("\nimpares");
        for (int i = 0; i < impares.length; i++) {
            System.out.print(impares[i] + " ");
        }
        sc.close();
    }
}

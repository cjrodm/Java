import java.util.Scanner;

public class EjemploArregloNumeroMayor {
public static void main(String[] args) {
    int a[] = new int[5];
    Scanner sc = new Scanner(System.in);
    System.out.print("Ingresa 5 numeros: ");
    for(int i=0; i<a.length;i++)
    {
        a[i] = sc.nextInt();
    }
    int max = 0;
    for(int j=1; j<a.length;j++){
        max = (a[max]>a[j])?max:j;

    }
    System.out.println("El numero mayor ingresado es "+a[max]);
sc.close();
}
}

import java.util.Scanner;

public class EjemploArregloDesplazarPosicion {
public static void main(String[] args) {
    int [] a = new int [7];
    int numero, posicion=0;

    Scanner sc = new Scanner(System.in);

    for(int i=0;i<a.length-1;i++)
    {
        System.out.print("Ingresa un numero: ");
        a[i] = sc.nextInt();
    }
    System.out.println();

    System.out.print("Ingresa el numero a insertar");
    numero = sc.nextInt();
    System.out.println();
    
    
    while(posicion<6 && numero > a[posicion])
    {
    posicion++;
    }
    for(int i=a.length-2;i>=posicion;i--)
    {
        a[i+1]=a[i];

    }
    a[posicion] = numero;

    System.out.println("El nuevo arreglo ordenado queda");

    for(int s: a)
    {
        System.out.print(s+"\t");
    }

    sc.close();
}
}

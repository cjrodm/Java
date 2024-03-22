import java.util.Scanner;

public class OperadorTerminarioNMayor {
public static void main(String[] args) {

    int []max = new int[3];
    Scanner scan = new Scanner(System.in);

    System.out.println();
    for(int i=0;i<max.length;i++)
    {
        System.out.print("Ingrese un numero["+(i+1)+"] :");
        max[i] = Integer.parseInt(scan.nextLine());
    }

    int nmax = (max[0]>max[1])?max[0]:max[1];
    nmax = (nmax>max[2])?nmax:max[2];

    System.out.println(max[0]);
    System.out.println(max[1]);
    System.out.println(max[2]);
    System.out.println("el numero mayor es "+nmax);

scan.close();
}

}

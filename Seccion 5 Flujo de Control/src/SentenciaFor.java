import java.util.Scanner;

public class SentenciaFor {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String nombre[] = { "Carlos", "Andrea", "Victoria", "Jose", "Alejandro" };
        int j = 1;

        System.out.println("\nNumeros primos del 1 al 10");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0)
                System.out.println("i = " + i);

        }
        System.out.println();

        for (String string : nombre) {
            if (string.toLowerCase().contains("carlos".toLowerCase()))
                continue;
            System.out.println(j + ".- " + string);
            j++;
        }

        System.out.print("Digita el nombre a buscar \"Pepe\" o \"Maria\" ");
        String find = scan.nextLine();

        boolean encontrado = false;
        for (String string : nombre) {
            if (string.equalsIgnoreCase(find)) {
                encontrado = true;
                break;
            }

        }
        if (encontrado)

            System.out.println(find + ", fue encontrado!");
        else
            System.out.println("no existe en el sistema");

        scan.close();
    }
}

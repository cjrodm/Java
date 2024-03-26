import java.util.Scanner;

public class SentenciaSwitchCase {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String nMes = null;

        System.out.print("digita el mes entre 1 - 12: ");
        int mes = scan.nextInt();

        switch (mes) {
            case 1 -> {
                nMes = "Enero";
            }
            case 2 -> {
                nMes = "Febrero";
            }
            case 3 -> {
                nMes = "Marzo";
            }
            case 4 -> {
                nMes = "Abril";
            }
            case 5 -> {
                nMes = "Mayo";
            }
            case 6 -> {
                nMes = "Junio";
            }
            case 7 -> {
                nMes = "Julio";
            }
            case 8 -> {
                nMes = "Agosto";
            }
            case 9 -> {
                nMes = "Septiembre";
            }
            case 10 -> {
                nMes = "Octubre";
            }
            case 11 -> {
                nMes = "Noviembre";
            }
            case 12 -> {
                nMes = "Diciembre";
            }
            default -> System.out.println("Numero Desconocido");
        }
        System.out.println("Nombre del Mes "+nMes);
        scan.close();
    }
}
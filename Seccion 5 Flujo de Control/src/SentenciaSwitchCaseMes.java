import java.util.GregorianCalendar;
import java.util.Scanner;

public class SentenciaSwitchCaseMes {
    public static void main(String[] args) {

        GregorianCalendar calendar = new GregorianCalendar();
        Scanner scan = new Scanner(System.in);
        int ndias = 0;

        System.out.println("Digita el mes entre 1-12: ");

        switch (scan.nextInt()) {

            case 1, 3, 5, 7, 8, 10, 12 -> ndias = 31;
            case 4, 6, 9, 11 -> ndias = 30;
            case 2 -> {
                System.out.print("Digita el Año: ");
                int annio = scan.nextInt();

                if (calendar.isLeapYear(annio))
                    ndias = 29;
                else
                    ndias = 28;
            }
        }
        if (ndias == 29)
            System.out.println("Numero de dias " + ndias + " y año bisiesto");
        else
            System.out.println("Numero de dias " + ndias);
        scan.close();
    }
}

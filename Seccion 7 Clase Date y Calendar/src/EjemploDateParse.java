import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EjemploDateParse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");

        System.out.println("Ingresa una fecha con formato 'dd-MM-yyyy'");
        try {
            Date fecha = format.parse(scan.nextLine());
            System.out.println("fecha: " + format.format(fecha));

            Date fecha2 = new Date();
            System.out.println("fecha2 = " + fecha2);

            if (fecha.after(fecha2))
                System.out.println("Fecha1 (del usuario) es despues que fecha2 (actual)");
            else if (fecha.before(fecha2))
                System.out.println("Fecha1 (del usuario) es anterior que fecha2 (actual)");
            else if (fecha.equals(fecha2))
                System.out.println("Fecha1 (del usuario) es igual que fecha2 (actual)");

            if (fecha.compareTo(fecha2) > 0)
                System.out.println("Fecha1 (del usuario) es despues que fecha2 (actual)");
            else if (fecha.compareTo(fecha2) < 0)
                System.out.println("Fecha1 (del usuario) es anterior que fecha2 (actual)");

        } catch (ParseException e) {
            e.printStackTrace();
        }

        scan.close();
    }
}

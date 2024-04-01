import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Pattern;

public class EjemploCalendar {
    public static void main(String[] args) {

        Calendar calendario = Calendar.getInstance();

        // calendario.set(2020, Calendar.NOVEMBER, 25, 25, 20, 10);
        calendario.set(Calendar.YEAR, 2024);
        calendario.set(Calendar.MONTH, Calendar.JULY);
        calendario.set(Calendar.DAY_OF_MONTH, 25);

        Pattern patt = Pattern.compile("yyyy-MM-dd");
        SimpleDateFormat sd = new SimpleDateFormat(patt.toString());

        Date fecha = calendario.getTime();

        System.out.println("calendario = " + sd.format(fecha));
    }
}

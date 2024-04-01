import java.text.SimpleDateFormat;
import java.util.Date;

public class EjemploDate {
    public static void main(String[] args) throws Exception {

        Date fecha = new Date();

        SimpleDateFormat df = new SimpleDateFormat("E yyyy.MM.dd G 'at' HH:mm:ss z");

        System.out.println("fecha = " + df.format(fecha));

        long j = 0;
        for (int i = 0; i < 100000000; i++) {
            j += i;

        }
        System.out.println("j = " + j);

        Date fecha2 = new Date();
        long tiempo = fecha2.getTime() - fecha.getTime();
        System.out.println("Tiempo transcurrido en el for " + tiempo);
    }
}

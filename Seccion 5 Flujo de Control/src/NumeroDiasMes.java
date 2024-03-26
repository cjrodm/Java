import java.util.GregorianCalendar;
import java.util.Scanner;

public class NumeroDiasMes {

    public static void main(String[] args) {

        GregorianCalendar calendar = new GregorianCalendar();
        Scanner scan = new Scanner(System.in);
        int mes = 0, ndias = 0, anio=0;


        System.out.println("ingrese el numero de mes = ");
        mes = scan.nextInt();

        System.out.println("Ingresa el año YYYY");
        anio = scan.nextInt();
   

        if(mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12)
        ndias = 31;
        else if(mes == 4 || mes == 6 || mes == 9 || mes == 11)
        ndias = 30;
        else if(mes == 2 && calendar.isLeapYear(anio) )
        ndias= 29;
        else
        ndias = 28;

        System.out.println("total de dias "+ndias);
        scan.close();
    }
}

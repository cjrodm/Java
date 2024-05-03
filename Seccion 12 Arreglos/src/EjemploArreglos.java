import java.util.Arrays;

public class EjemploArreglos {
    public static void main(String[] args) throws Exception {

        String [] productos = {"Kingston pendrive 64GB","Sansumg Galaxy","Disco Duro SSD Sansumg Externo","Asus Notebook","Macbook Air","Chromecast 4ta generación","Bicicleta Oxford"};
        int [] numeros = {1,2,3,4};

        int i = numeros[0];
        int j = numeros[1];
        int k = numeros[2];
        int l = numeros[3];

        System.out.println("i = "+i);
        System.out.println("j = "+j);
        System.out.println("k = "+k);
        System.out.println("l = "+l);

        Arrays.sort(productos);

        System.out.println("-----for each----------");

        for(String str: productos)
        {
            System.out.println(str);

        }

    }
}

import java.util.Arrays;

public class EjemploArreglosInversoMutable {

    public static void main(String[] args) throws Exception {

        String[] productos = { "Kingston pendrive 64GB", "Sansumg Galaxy", "Disco Duro SSD Sansumg Externo",
                "Asus Notebook", "Macbook Air", "Chromecast 4ta generación", "Bicicleta Oxford" };
        Arrays.sort(productos);
        System.out.println("-----for each----------");
        for (String str : productos) {
            System.out.println(str);
        }
        ArrayInverso(productos);
        // Collections.reverse(Arrays.asList(productos));

        System.out.println("\n-----for each----------");
        for (String str : productos) {
            System.out.println(str);

        }

    }

    public static void ArrayInverso(String[] arreglo) {
        int total = arreglo.length;
        int count = arreglo.length;
        for (int i = 0; i < total; i++) {
            String actual = arreglo[i];
            String inverso = arreglo[count - 1 - i];
            arreglo[i] = inverso;
            arreglo[count - 1 - i] = actual;
            total--;
        }
    }
}

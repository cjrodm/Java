import java.util.Arrays;

public class EjemploArreglosInverso {

    public static void main(String[] args) throws Exception {

        String[] productos = { "Kingston pendrive 64GB", "Sansumg Galaxy", "Disco Duro SSD Sansumg Externo",
                "Asus Notebook", "Macbook Air", "Chromecast 4ta generación", "Bicicleta Oxford" };
        int count = productos.length;

        Arrays.sort(productos);
        System.out.println("-----for each----------");
        for (String str : productos) {
            System.out.println(str);

        }

        System.out.println("\n-------Usando for inverso -------");
        for (int i = 0; i < count; i++) {
            System.out.println("Para i = " + (count - 1 - i) + " valor: " + productos[count - 1 - i]);

        }

        System.out.println("\n-------Usando for inverso 2 -------");
        for (int i = count - 1; i >= 0; i--) {
            System.out.println("Para i = " + i + " valor: " + productos[i]);

        }

    }
}

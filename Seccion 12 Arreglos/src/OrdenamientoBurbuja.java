public class OrdenamientoBurbuja {
    public static void main(String[] args) {

        String[] productos = { "Kingston pendrive 64GB", "Sansumg Galaxy", "Disco Duro SSD Sansumg Externo",
                "Asus Notebook", "Macbook Air", "Chromecast 4ta generación", "Bicicleta Oxford" };
        int count = productos.length;

        int contador = 0;
        for (int i = 0; i < count-1; i++) {
            for (int j = 0; j < count - 1 - i; j++) {
                if (productos[j + 1].compareTo(productos[j]) < 0) {
                    String aux = productos[j];
                    productos[j] = productos[j + 1];
                    productos[j + 1] = aux;
                }
                contador++;
            }
        }
        System.out.println("Contado: " + contador++);

        int i = 1;
        for (String x : productos) {
            System.out.println("[" + i + "] : " + x);
            i++;
        }
    }
}

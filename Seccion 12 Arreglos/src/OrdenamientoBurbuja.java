public class OrdenamientoBurbuja {
    public static void main(String[] args) {

        String[] productos = { "Kingston pendrive 64GB", "Sansumg Galaxy", "Disco Duro SSD Sansumg Externo",
                "Asus Notebook", "Macbook Air", "Chromecast 4ta generación", "Bicicleta Oxford" };
        int count = productos.length;

        int contador = 0;
        for (int i = 0; i < count; i++) {
            for (int j = 0; i < count; j++) {
                if (productos[i].compareTo(productos[j]) < 0) {
                    String aux = productos[i];
                    productos[i] = productos[j];
                    productos[j] = aux;
                }
                contador++;
            }
        }
        System.out.println("Contado: " + contador++);
    }
}

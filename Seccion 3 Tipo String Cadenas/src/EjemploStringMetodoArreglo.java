public class EjemploStringMetodoArreglo {
    public static void main(String[] args) {

        String trabalenguas = "trabalenguas";

        char[] arreglo = trabalenguas.toCharArray();

        for (int i = 0; i < trabalenguas.length(); i++) {
            System.out.println(arreglo[i]);
        }
        System.out.println();
        System.out.println("trabalenguas = " + trabalenguas.split("a"));
        String[] arreglo2 = trabalenguas.split("a");

        for (int j = 0; j < arreglo2.length; j++) {
            System.out.println(arreglo2[j]);

        }
        String archivo = "alguna.imagen.pdf";
        String[] archivoArr = archivo.split("[.]");

        for (int i = 0; i < archivoArr.length; i++) {

            System.out.println(archivoArr[i]);
        }
        System.out.println("extension = " + archivoArr[archivoArr.length - 1]);
    }

}

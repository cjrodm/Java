public class EjemploStringExtensionFile {
    public static void main(String[] args) {

        String archivo = "alguna_imagen.js";
        int i = archivo.lastIndexOf(".")+1;
        System.out.println("archivo.length() = " + archivo.length());
        System.out.println("archivo.substring(14) = " + archivo.substring(14));
        System.out.println("archivo.substring(archivo.length()-1) = " + archivo.substring(archivo.length() - 1));
        System.out.println("archivo.substring(i,archivo.length()) = " + archivo.substring(i, archivo.length()));
    }
}

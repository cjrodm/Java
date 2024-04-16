import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class EjemploAsignarProperties {
    public static void main(String[] args) {

        try {
            FileInputStream file = new FileInputStream("src/config.properties");
            Properties p = new Properties(System.getProperties());
            p.load(file);
            p.setProperty("mi.propiedad.personalizada", "Valor guardado en properties");

            System.setProperties(p);
            System.getProperties().list(System.out);

            System.out.println(System.getProperty("config.texto.ambiente"));

            file.close();
        } catch (IOException e) {
            System.out.println("no existe el archivo " + e);
        }
    }
}

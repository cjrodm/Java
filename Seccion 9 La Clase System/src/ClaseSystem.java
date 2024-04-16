import java.util.Properties;

public class ClaseSystem {
    public static void main(String[] args) throws Exception {

        System.out.println();
        System.out.println("user.name = " + System.getProperty("user.name"));
        System.out.println("home " + System.getProperty("home"));
        System.out.println("user.dir " + System.getProperty("user.dir"));
        System.out.println("java.version " + System.getProperty("java.version"));
        System.out.println("lineSeparator " + System.getProperty("line.separator"));

        Properties p = System.getProperties();
        p.list(System.out);
        System.out.println();


    }
}

import java.io.IOException;

public class EjemploEjecutarProgramaSO {
    public static void main(String[] args) {

        Runtime rt = Runtime.getRuntime();

        String x[] = { "mspaint.exe"};

        try {
            if (System.getProperty("os.name").startsWith("Windows")) {

                rt.exec(x);
            }
        } catch (IOException e) {

            System.err.println("El comando es desconocido"+e.getMessage());
        }
    }
}

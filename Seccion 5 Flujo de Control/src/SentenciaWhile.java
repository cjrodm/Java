public class SentenciaWhile {
    public static void main(String[] args) {

        int i = 0;
        boolean flag = false;

        while (i < 5) {
            System.out.println("i = " + i);
            i++;
        }

        do {
            System.out.println("Se ejecuta al menos una vez");
        } while (flag);

    }
}

public class EjemploString {
    public static void main(String[] args) throws Exception {
        String curso = "Programación Java";
        String curso2 = new String("Progamación java");

        boolean esIgual = curso == curso2;

        System.out.println("esIgual = " + esIgual);

        esIgual = curso.equals(curso2);
        System.out.println("curso.equals(curso2) = " + esIgual);

        String curso3 = "Programación Java";
        esIgual = curso == curso3;

        System.out.println("curso = curso3 " + esIgual);
    }
}

public class OperadorInstanceOf {
    public static void main(String[] args) {

        System.out.println();
        String texto = "Creando un objeto de la clase String";
        Integer num = 7;

        boolean b1 = texto instanceof String;

        System.out.println("Texto es instancia del tipo String " + b1);

        b1 = texto instanceof Object;

        System.out.println("Texto es instancia del tipo Object " + b1);

        b1 = num instanceof Object;

        System.out.println("num es instancia del tipo Object " + b1);
        System.out.println();

    }
}

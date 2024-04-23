import java.util.Random;

public class ClaseMathRandom {
    public static void main(String[] args) {

        String[] color = { "azul", "amarillo", "rojo", "verde", "blanco", "negro" };

        double random = Math.random();
        System.out.println("random = " + random);
        random *= color.length;
        System.out.println("Colores = " + color[(int) random]);

        Random ran = new Random();
        int randomInt = 15 + ran.nextInt(25 - 15);
        System.out.println("RandomInt = " + randomInt);

    }
}

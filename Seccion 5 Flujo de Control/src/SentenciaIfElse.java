public class SentenciaIfElse {
    public static void main(String[] args) throws Exception {

        float promedio = 5.2F;

        if (promedio >= 6.5)
            System.out.println("Felicitaciones excelente el promedio");
        else if (promedio > 6)
            System.out.println("Muy buen promedio");
        else if (promedio >= 5.5)
            System.out.println("Buen promedio");
        else if (promedio > 5)
            System.out.println("Regular, necesitas esforzarte un poco mas");
        else if (promedio >= 4)
            System.out.println("insuficiente, necesitas estudiar mas");
        else
            System.out.println("Reprobado");
        System.out.println("El promedio es = " + promedio);
    }
}

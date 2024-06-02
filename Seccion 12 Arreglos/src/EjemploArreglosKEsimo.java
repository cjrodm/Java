public class EjemploArreglosKEsimo {
    public static void main(String[] args) {

        int[] numero = new int[10];
        int a[] = new int[10];

        int count = numero.length;
        for (int i = 0; i < count; i++) {
            numero[i] = i + 1;

        }
        for (int i = 0, j = 0; i < count - i; i++) {
            // System.out.println(+numero[i]+" - "+numero[count-1-i]);
            a[j++] = numero[i];
            a[j++] = numero[count - 1 - i];
        }
        for (int i = 0; i < count; i++) {
            System.out.print("\t" + a[i]);
        }
    }
}

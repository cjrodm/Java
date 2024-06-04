public class ArregloCombinado {
    public static void main(String[] args) {

        int[] a, b, c;
        a = new int[9];
        b = new int[9];
        c = new int[18];

        for (int i = 0; i < a.length; i++) {
            a[i] = i + 1;
            b[i] = (i + 1) * 5;
        }

        for (int i = 0, j = 0; i < 9; i += 3) {
            for (int k = 0; k < 3; k++) {
                c[j++] = a[i + k];
            }
            for (int k = 0; k < 3; k++) {
                c[j++] = b[i + k];
            }
        }

        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");

        }
    }
}

public class ArregloCombinado {
    public static void main(String[] args) {

        int[] a, b, c;
        a = new int[10];
        b = new int[10];
        c = new int[20];

        for (int i = 0; i < a.length; i++) {
            a[i] = i + 1;
            b[i] = (i + 1) * 5;
        }
        
        for(int i=0,j=0; i<10;i++)
        {
            c[j++] = a[i];
            c[j++] = b[i];
        }
        
        for(int i=0;i<c.length;i++)
        {
            System.out.print(c[i]+" ");

        }
    }
}

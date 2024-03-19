public class EjemploStringRendimiento {

    public static void main(String[] args) {

        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder(a);
        long inicio = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
        //   c = c.concat(a).concat(b).concat("\n"); // 500->2 ms ,1000-> 5 ms, 10000-> 356 ms, 100000-> 8237 ms
            //  c= c+a+b+"\n"; // 500 -> 29 ms, 1000->36 ms, 10000-> 86 ms, 100000-> 2332 ms
            sb.append(c) // 500 -> 0 ms, 1000-> 1 ms, 10000-> 4 ms, 100000-> 14 ms
                    .append(b)
                    .append("\n");
        }

        long fin = System.currentTimeMillis();

        System.out.println("sb = " + sb.toString());
        System.out.println("c = " + c);
        System.out.println(fin - inicio);

    }
}

public class Primitivos {
    public static void main(String[] args) throws Exception {
    
        byte nbyte = 127;
        System.out.println();
        System.out.println("nbyte = "+nbyte);
        System.out.println("tipo de Byte corresponde a "+Byte.BYTES);
        System.out.println("tipo de Byte corresponde en bites a "+Byte.SIZE);
        System.out.println("valor maximo de un byte: "+Byte.MAX_VALUE);
        System.out.println("valor minimo de un byte: "+Byte.MIN_VALUE);
       
        short nshort = 30000;
        System.out.println();
        System.out.println("nshort = "+nshort);
        System.out.println("tipo de short corresponde a "+Short.BYTES);
        System.out.println("tipo de short corresponde en bites a "+Short.SIZE);
        System.out.println("valor maximo de un short: "+Short.MAX_VALUE);
        System.out.println("valor minimo de un short: "+Short.MIN_VALUE);

        int nint = 32767;
        System.out.println();
        System.out.println("nint = "+nint);
        System.out.println("tipo de int corresponde a "+Integer.BYTES);
        System.out.println("tipo de int corresponde en bites a "+Integer.SIZE);
        System.out.println("valor maximo de un int: "+Integer.MAX_VALUE);
        System.out.println("valor minimo de un int: "+Integer.MIN_VALUE);
        
        long nlong = 2147483648L;
        System.out.println();
        System.out.println("nlong = "+nlong);
        System.out.println("tipo de long corresponde a "+Long.BYTES);
        System.out.println("tipo de long corresponde en bites a "+Long.SIZE);
        System.out.println("valor maximo de un long: "+Long.MAX_VALUE);
        System.out.println("valor minimo de un long: "+Long.MIN_VALUE);
       
        System.out.println();

    }
}

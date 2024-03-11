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
       
        float real = 1.5e-10F;
        System.out.println();
        System.out.println("real = "+real);
        System.out.println("tipo float corresponde a "+Float.BYTES);
        System.out.println("tipo float corresponde en bites a "+Float.SIZE);
        System.out.println("Valor maximo de un float: "+Float.MAX_VALUE);
        System.out.println("Valor minimo de un float: "+Float.MIN_VALUE);
        
        double realDouble = 3.402823E28;
        System.out.println();
        System.out.println("real Double = "+realDouble);
        System.out.println("tipo Double corresponde a "+Double.BYTES);
        System.out.println("tipo Double corresponde en bites a "+Double.SIZE);
        System.out.println("Valor maximo de un double: "+Double.MAX_VALUE);
        System.out.println("Valor minimo de un double: "+Double.MIN_VALUE);
        
        char character = '\u0040';  // forma unicode
        char decimal = 64;
        System.out.println("character = "+character);
        System.out.println("Decimal = "+decimal);
        System.out.println("character = Decimal: "+(character==decimal));

        char simbolo = '@';
        // caracteres especiales
     //   char espacio = '\u0020';
       // char retroceso = '\b';
       // char tabulador = '\t';
       // char nuevaLinea = '\n';
       // char retornoCarro = '\r';
        System.out.println("simbolo :"+System.lineSeparator()+simbolo);
        System.out.println("character = simbolo: "+(character==simbolo));
        System.out.println("char corresponde en byte a :"+Character.BYTES);
        System.out.println("char corresponde en bites a :"+Character.SIZE);
        System.out.println("char valor maximo :"+Character.MAX_VALUE);
        System.out.println("char valor minimo :"+Character.MIN_VALUE);
        System.out.println();

        

    }
}

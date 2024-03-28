public class WrapperInteger {
    public static void main(String[] args) throws Exception {
    
        int primitivo = 32767;
        Integer intObject = Integer.valueOf(primitivo);
        Integer intObject2 = primitivo;
        System.out.println("intObject = "+intObject);
        System.out.println("intObject2 = "+intObject2);

    
        int num = intObject;
        int num2 = intObject.intValue();
        System.out.println("num = "+num);
        System.out.println("num2 = "+num2);

        String valorTvLcd = "67000";
        int num3 = Integer.parseInt(valorTvLcd);
        System.out.println("num3 = "+num3);

        Short shortObject = intObject2.shortValue();
        System.out.println("ShortObject = "+shortObject);
    }
}

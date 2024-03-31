import java.lang.reflect.Method;

public class EjemploMetodoGetClass {
public static void main(String[] args) {
    
    String texto = "Hola que tal";

       System.out.println("strClass.getClass().getName() = "+texto.getClass().getName());
       System.out.println("strClass.getClass().getSimpleName() = "+texto.getClass().getSimpleName());
       System.out.println("strClass.getClass().getPackageName() = "+texto.getClass().getPackageName());
       
       for (Method m: texto.getClass().getSuperclass().getMethods()) {
        System.out.println("m.getName() = "+m.getName());
       }

       Integer num = 34;
       System.out.println("num.getClass().getName() = "+num.getClass().getName());
       System.out.println("num.getClass().getSimpleName() = "+num.getClass().getSimpleName());
       System.out.println("num.getClass().getSuperclass() = "+num.getClass().getSuperclass());
}
}

import java.util.Map;

public class EjemploVariableEntorno {
public static void main(String[] args) {
    
    Map<String,String> varEnv = System.getenv();

    String username = System.getenv("USERNAME");
    String javaHome = System.getenv("JAVA_HOME");
    String path = varEnv.get("Path");
    // System.out.println("Variable ambiente: "+varEnv);

System.out.println(username+"\n");
System.out.println(javaHome+"\n");
System.out.println(path+"\n");

        
    }
}


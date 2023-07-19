
package Principal;

import com.cjrod.Model.Alumno;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;


public class TreeSetEjemplo {
    public static void main(String[] args) {
        
        Set<Alumno> alumno = new TreeSet<>(Comparator.comparing(Alumno::getNombre).reversed());
        alumno.add(new Alumno("Carlos Rodriguez",31));
        alumno.add(new Alumno("Jose Rodriguez",29));
        alumno.add(new Alumno("Victoria Rodriguez",8));
        
        System.out.println("Imprimiendo el TreeSet con foreach");
      
        alumno.forEach(System.out::println);
    }
}

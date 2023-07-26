
package com.cjrod.List;

import com.cjrod.Modelo.Alumno;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EjemploArrayList {
   
    public static void main(String[] args) {
        
        List<Alumno> al = Collections.synchronizedList(new ArrayList<>());
       
        System.out.println(al+ ", size = "+al.size());
        System.out.println("esta vacia = "+al.isEmpty()); 
        
        al.add(new Alumno("Pato", 5));
        al.add(new Alumno("Cata", 6));
        al.add(new Alumno("Luci", 4));
        al.add(2, new Alumno("Jano", 7));
        al.set(3, new Alumno("Andres", 3));
        
        System.out.println(al+ ", size = "+al.size());
        
        al.remove(new Alumno("Jano", 5));
        
        System.out.println(al+ ", size = "+al.size());
        
        boolean b = al.contains(new Alumno("Cata", 6));
        System.out.println("La lista contiene a Cata: "+b);
        
        System.out.println("Imprimiendo for each");
        
        al.forEach(System.out::println);
    }
}

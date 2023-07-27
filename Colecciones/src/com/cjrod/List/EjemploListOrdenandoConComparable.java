package com.cjrod.List;

import com.cjrod.Modelo.Alumno;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EjemploListOrdenandoConComparable {

    public static void main(String[] args) {

        List<Alumno> al = Collections.synchronizedList(new ArrayList<>());

        al.add(new Alumno("Pato", 5));
        al.add(new Alumno("Cata", 6));
        al.add(new Alumno("Lucy", 4));
        al.add(new Alumno("Jano", 7));
        al.add(new Alumno("Andres", 3));
        al.add(new Alumno("Zeus", 2));

        System.out.print("Ascendente por nota: ");
        al.sort(Comparator.comparing(Alumno::getNota));
        System.out.println(al);
        System.out.print("Descendente por nota: ");
        al.sort(Comparator.comparing(Alumno::getNota).reversed());
        System.out.println(al);

        System.out.print("Ascendente por nombre: ");
        al.sort((a, b) -> a.getNombre().compareTo(b.getNombre()));
        System.out.println(al);
        System.out.println("Collections");
        System.out.print("Ascendente por nombre: ");
        Collections.sort(al, (a, b) -> a.getNombre().compareTo(b.getNombre()));
        System.out.println(al);
    }
}

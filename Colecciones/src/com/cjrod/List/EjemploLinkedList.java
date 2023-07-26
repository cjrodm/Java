package com.cjrod.List;

import com.cjrod.Modelo.Alumno;
import java.util.LinkedList;
import java.util.ListIterator;

public class EjemploLinkedList {

    public static void main(String[] args) {

        LinkedList<Alumno> enlazada = new LinkedList<>();

        System.out.println("El linkedList Admite elementos duplicados");
        System.out.println(enlazada + ", size = " + enlazada.size());
        System.out.println("esta vacia = " + enlazada.isEmpty());
        System.out.println("");

        enlazada.add(new Alumno("Pato", 5));
        enlazada.add(new Alumno("Cata", 6));
        enlazada.add(new Alumno("Luci", 4));
        enlazada.add(new Alumno("Jano", 7));
        enlazada.add(new Alumno("Andres", 3));

        System.out.println(enlazada + ", size = " + enlazada.size());
        System.out.println("");
        System.out.println("______________________Agregando 2 elementos al LinkedList");

        enlazada.addFirst(new Alumno("Zeus", 5));
        enlazada.addLast(new Alumno("Atenea", 6));

        System.out.println("Primero = " + enlazada.getFirst()); // si la lista estuviera vacia lanzara excepcion
        System.out.println("Ultimo = " + enlazada.peekLast()); // no lanza excepción
        System.out.println("Indice 2 = " + enlazada.get(2));

        System.out.println("");
        System.out.println("______________________Imprimiendo nuevos elementos del LinkedList");

        System.out.println(enlazada + ", size = " + enlazada.size());
        // elimina elemento
        enlazada.pollFirst();

        System.out.println(enlazada + ", size = " + enlazada.size());

        System.out.println("");
        System.out.println("______________________Agregando a Lucas y Lalo");
        Alumno a = new Alumno("Lucas", 5);
        enlazada.addLast(a);
        System.out.println("Indice de Lucas = " + enlazada.indexOf(a));

        enlazada.set(3, new Alumno("Lalo", 7));
        System.out.println(enlazada + ", size = " + enlazada.size());

        System.out.println("");
        System.out.println("______________________Imprimiendo con Iterator");

        ListIterator<Alumno> li = enlazada.listIterator();

        while (li.hasNext()) {
            Alumno alumno = li.next();
            System.out.println(alumno);
        }
        System.out.println("");
        System.out.println("______________________Imprimiendo con Iterator - Previous");
        while (li.hasPrevious()) {
            Alumno alumno = li.previous();
            System.out.println(alumno);
        }

    }
}

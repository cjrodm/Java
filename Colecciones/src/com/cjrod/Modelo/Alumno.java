package com.cjrod.Modelo;

import java.util.Objects;

public class Alumno implements Comparable<Alumno> {

    private String nombre;
    private int nota;

    public Alumno() {
    }

    public Alumno(String nombre, int nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNota() {
        return nota;
    }

    @Override
    public String toString() {
        return nombre + ", nota: " + nota;
    }

    @Override
    public int compareTo(Alumno o) {

        /*   if(this.nombre==null)
            return 0;
       
    return this.nombre.compareTo(a.nombre);
         */
        // para comparar por notas    
        if (this.nota == o.nota) {
            return 0;
        }
        if (this.nota > o.nota) {
            return 1;
        } else {
            return -1;
        }

    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.nombre);
        hash = 37 * hash + this.nota;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumno other = (Alumno) obj;
        if (this.nota != other.nota) {
            return false;
        }
        return Objects.equals(this.nombre, other.nombre);
    }

}

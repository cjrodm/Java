
package com.cjrod.Model;


public class Alumno implements Comparable<Alumno>{
    
    private int id;
    private static int count = 0;
    private String nombre;
    private int edad;

    public Alumno() {
    }

    public Alumno(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.id = ++count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public int compareTo(Alumno o) {
   if(edad == o.edad)
       return 0;
   if(edad > o.edad)
       return 1;
   else
       return -1;
    }

    @Override
    public String toString() {
        return id+". "+this.nombre+", edad "+edad;
    }
    
    
    
}

package com.cjrod.Maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EjemploHashMap {

    public static void main(String[] args) {

        Map<String, String> persona = new HashMap<>();

        System.out.println("Validar si el HashMap contiene elementos: " + !persona.isEmpty());
        System.out.println("agregando valores");
        persona.put("nombre", "Carlos");
        persona.put("apellido", "Rodriguez");
        persona.put("edad", "31");
        persona.put("correo", "carlos.rodriguez@baccredomatic.ni");

        System.out.println("Validar nuevamente si el HashMap contiene elementos: " + !persona.isEmpty());

        String nombre = persona.get("nombre");
        System.out.println("nombre: " + nombre);

        persona.put("temporal", "temporal");
        persona.put("temporal1", "temporal1");

        String eliminado = persona.remove("temporal");
        System.out.println("Eliminando por key: " + eliminado);

        boolean delete = persona.remove("temporal1", "temporal1");
        System.out.println("Eliminado por key y value: " + delete);

        boolean validacion = persona.containsKey("ApellidoPaterno");
        System.out.println("validando si existe apellido paterno en llave: " + validacion);

        Collection<String> valores = persona.values();
        System.out.println("============================== Imprimir Values");
        valores.forEach(System.out::println);

        Set<String> llaves = persona.keySet();
        System.out.println("============================== Imprimir llaves");
        llaves.forEach(System.out::println);

        System.out.println("============================== Imprimir EntrySet (values and keys)");
        for (Map.Entry<String, String> per : persona.entrySet()) {
            System.out.println(per.getKey() + " => " + per.getValue());
        }

        System.out.println("============================== Imprimir con KeySet");

        for (String llave : persona.keySet()) {
            String valor = persona.get(llave);
            System.out.println(llave + " => " + valor);
        }

        System.out.println("============================== Imprimir con For Each Java 8");
        persona.forEach((llave, valor)
                -> {
            System.out.println(llave + " => " + valor);
        });
        
        System.out.println("============================== Reemplazar value a traves de key");
        persona.replace("nombre", "Carlos", "Javier");
        
        persona.forEach((a,b)->{System.out.println(a+"\t"+b);});
    }
}

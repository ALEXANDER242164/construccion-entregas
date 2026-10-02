package com.example.Ejercicio2;

import java.util.ArrayList;
import java.util.List;

// ERROR: El nombre CodigoErroneo2 no describe la responsabilidad de la clase.
public class CodigoErroneo2 {

    public static void eliminarInactivos(List<String> clientes, String inactivo) {
        // ERROR: El nombre inactivo no indica que representa el nombre del cliente que
        // se eliminara.
        for (String cliente : clientes) {
            // ERROR: == compara referencias de String, no el contenido de los nombres.
            if (cliente == inactivo) {
                // ERROR: Modificar la lista dentro de un for-each puede provocar
                // ConcurrentModificationException.
                clientes.remove(cliente);
            }
        }
    }

    public static void main(String[] args) {
        List<String> clientes = new ArrayList<>();
        clientes.add("Juan");
        clientes.add("Pedro");
        // ERROR: Esta instancia demuestra que == puede no reconocer dos Strings con el
        // mismo contenido.
        clientes.add(new String("Pedro"));

        eliminarInactivos(clientes, "Pedro");
        System.out.println(clientes);
    }
}
package com.example.Ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class GestorClientes {

    public static void eliminarInactivos(List<String> clientes, String inactivo) {
        for (String cliente : clientes) {
            if (cliente == inactivo) {
                clientes.remove(cliente);
            }
        }
    }

    public static void main(String[] args) {
        List<String> clientes = new ArrayList<>();
        clientes.add("Juan");
        clientes.add("Pedro");
        clientes.add(new String("Pedro"));

        eliminarInactivos(clientes, "Pedro");
        System.out.println(clientes);
    }
}
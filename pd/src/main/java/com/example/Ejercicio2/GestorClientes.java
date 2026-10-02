package com.example.Ejercicio2;

import java.util.ArrayList;

// MEJORA: La clase concentra las operaciones relacionadas con la administracion de clientes.
public class GestorClientes {
    // MEJORA: La coleccion podria declararse privada y exponerse mediante metodos
    // para proteger su encapsulamiento.
    protected ArrayList<String> clientes;

    public GestorClientes() {
        this.clientes = new ArrayList<>();
    }

    public void agregarCliente(String nombreCliente) {
        // MEJORA: El metodo centraliza la forma en que se agregan clientes al gestor.
        clientes.add(nombreCliente);
    }

    public void imprimirClientes() {
        System.out.println("Clientes activos:");
        for (String cliente : clientes) {
            System.out.println(cliente);
        }
    }

}
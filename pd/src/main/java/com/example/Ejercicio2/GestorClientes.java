package com.example.Ejercicio2;

import java.util.ArrayList;

public class GestorClientes {
    protected ArrayList<String> clientes;

    public GestorClientes() {
        this.clientes = new ArrayList<>();
    }

    public void agregarCliente(String nombreCliente) {
        clientes.add(nombreCliente);
    }

    public void imprimirClientes() {
        System.out.println("Clientes activos:");
        for (String cliente : clientes) {
            System.out.println(cliente);
        }
    }

}
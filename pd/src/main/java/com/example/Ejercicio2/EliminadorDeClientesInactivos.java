package com.example.Ejercicio2;

public class EliminadorDeClientesInactivos {

    public void eliminarInactivos(GestorClientes clientes, String nombreClienteInactivo) {
        for (String cliente : clientes.clientes) {
            if (cliente == nombreClienteInactivo) {
                clientes.clientes.remove(cliente);
            }
        }
    }

}

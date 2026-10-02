package com.example.Ejercicio2;

// MEJORA: La clase separa la eliminacion de clientes de la gestion de la coleccion.
public class EliminadorDeClientesInactivos {

    public void eliminarInactivos(GestorClientes clientes, String nombreClienteInactivo) {
        // MEJORA: El parametro podria llamarse gestorClientes para diferenciar el
        // gestor del cliente individual.
        for (String cliente : clientes.clientes) {
            // MEJORA: La comparacion deberia basarse en el contenido del nombre, no en la
            // referencia del String.
            if (cliente == nombreClienteInactivo) {
                // MEJORA: La eliminacion debe hacerse con un Iterator o mediante removeIf para
                // evitar modificar el for-each.
                clientes.clientes.remove(cliente);
            }
        }
    }

}

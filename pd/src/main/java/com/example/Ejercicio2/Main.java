package com.example.Ejercicio2;

import java.util.ArrayList;

public final class Main {
    public static void main(String[] args) {
        GestorClientes clientes = new GestorClientes();

        clientes.agregarCliente("Juan");
        clientes.agregarCliente("Pedro");
        clientes.agregarCliente("Maria");

        EliminadorDeClientesInactivos eliminador = new EliminadorDeClientesInactivos();
        eliminador.eliminarInactivos(clientes, "Pedro");

        clientes.imprimirClientes();

    }

}

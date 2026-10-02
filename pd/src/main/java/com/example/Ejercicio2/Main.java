package com.example.Ejercicio2;

import java.util.ArrayList;

// MEJORA: La clase Main se limita a coordinar el flujo de ejecucion del ejemplo.
public final class Main {
    public static void main(String[] args) {
        // MEJORA: El nombre clientes podria ser gestorClientes porque representa un
        // objeto GestorClientes.
        GestorClientes clientes = new GestorClientes();

        clientes.agregarCliente("Juan");
        clientes.agregarCliente("Pedro");
        clientes.agregarCliente("Maria");

        // MEJORA: Se delega la eliminacion de clientes inactivos a una clase
        EliminadorDeClientesInactivos eliminador = new EliminadorDeClientesInactivos();
        eliminador.eliminarInactivos(clientes, "Pedro");

        clientes.imprimirClientes();

    }

}

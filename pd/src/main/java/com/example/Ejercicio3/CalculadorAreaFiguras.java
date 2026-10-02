package com.example.Ejercicio3;

// MEJORA: El nombre describe que la clase calcula y muestra el area de cualquier figura.
public class CalculadorAreaFiguras {
    public void imprimirArea(Figura figura) {
        // MEJORA: Se elimina instanceof y el casting; cada figura calcula su area
        // mediante polimorfismo.
        System.out.println("Area de la figura: " + figura.calcularArea());
    }
}
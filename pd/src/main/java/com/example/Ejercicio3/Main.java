package com.example.Ejercicio3;

public class Main {
    public static void main(String[] args) {
        // MEJORA: Se utiliza el nombre actualizado de la clase encargada de calcular
        // areas.
        CalculadorAreaFiguras calculadorArea = new CalculadorAreaFiguras();

        // MEJORA: Se utiliza el constructor que recibe la base y la altura del
        // triangulo.
        Figura triangulo = new Triangulo(4, 5);

        // MEJORA: El nombre de la variable indica claramente la responsabilidad del
        // objeto.
        calculadorArea.imprimirArea(triangulo);
    }

}

package com.example.Ejercicio1;

//MEJORA: Se cambioa el nombre de la clase para representar mejor lo que hacer
public class SumadorDeNumerosPositivos {

    // MEJORA: Se cambio el nombre del metodo para representar mejor lo que hace
    // MEJORA: El incremento se realiza antes de continue, evitando bucle infinito
    // con valores negativos
    public static void sumadorDeNumerosPositivos(int[] numeros) {
        int incremento = 0;
        int sumaDeNumerosPositivos = 0;

        while (incremento < numeros.length) {

            // MEJORA: Nombre de variable más descriptivo que 'suma'
            if (numeros[incremento] < 0) {
                System.out.println("Valor negativo encontrado y eliminado: " + numeros[incremento]);
                // MEJORA: Se incrementa antes de continue para evitar bucle infinito (a
                // diferencia de Procesador)
                incremento++;
                continue;
            } else {
                // MEJORA: Se agrega else para imprimir el valor positivo encontrado
                System.out.println("Valor positivo encontrado: " + numeros[incremento]);
            }
            sumaDeNumerosPositivos += numeros[incremento];
            incremento++;

        }

        System.out.println("Suma total de numeros positivos: " + sumaDeNumerosPositivos);
    }

    public static void main(String[] args) {
        int[] numeros = { 5, 10, -3, 8, 2, 7, -1, 4 };
        sumadorDeNumerosPositivos(numeros);
    }
}
package com.example.Ejercicio1;

//ERROR: No hay documentacion para nada con ferente a la clase
//ERROR: nombre de clase no day idea de lo que hace
public class Procesador {
    // ERROR: Nombre del metodo más descriptivo como "sumadorDeNumerosPositivos"
    public static void procesar(int[] datos) {
        int i = 0; // Nombre de variable más descriptivo como "incremento" o "contador"
        int suma = 0; // Nombre de variable más descriptivo como "sumaTotal" o "sumaPositivos"

        // ERROR en la condición: si datos[i] < 0, el continue salta el i++ y eso causa
        // bucle infinito
        while (i < datos.length) {
            suma += datos[i]; // Error principal: se suma el valor negativo, debería sumarse solo si es
                              // positivo
            if (datos[i] < 0) {
                System.out.println("Valor negativo encontrado, se omite");
                continue; // No se incrementa i, el loop nunca termina si hay negativos
            } // Agregar un su respectivo else para imprimir el valor positivo encontrado

            i++;
        }

        System.out.println("Suma total: " + suma);
    }

    public static void main(String[] args) {
        int[] datos = { 5, 10, -3, 8 };
        procesar(datos);
    }
}
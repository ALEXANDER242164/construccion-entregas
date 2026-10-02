package com.example.Ejercicio3;

//MEJORA: Se crea una clase Triangulo que hereda de Figura y se implementa el método calcularArea.
public class Triangulo extends Figura {

    private double base;
    private double altura;

    // MEJORA: Se agrega un constructor que recibe la base y la altura del
    // triangulo.
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Respecto a los métodos get y set, se agregan para permitir el acceso a los
    // atributos base y altura desde otras clases si es necesario.

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }
}

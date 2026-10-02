package com.example.Ejercicio3;

//ERROR: No hay documentacion de la clase
public class CodigoErroneo {
    // ERROR: Todas clases que usan para herencia y polimorfismo deben de estar en
    // archivos separados, no en el mismo archivo
    public class Figura {
        public double base;
        public double altura;
        // ERROR: No hay constructor

        public double calcularArea() {
            return base * altura;
        }
    }

    public class Triangulo extends Figura {
        public double calcularArea() {
            return (base * altura) / 2;
        }
    }

    // ERROR: Nombre de la clase poco representativa
    public class Procesador {
        public void imprimirArea(Figura figura) {
            // ERROR: Todo esta parte de logica se puede omitir
            if (figura instanceof Triangulo) {
                Triangulo t = (Triangulo) figura;
                System.out.println("Area del triángulo: " + t.calcularArea());
            } else {
                System.out.println("Area: " + figura.calcularArea());
            }
        }

        public static void main(String[] args) {
            Procesador p = new Procesador(); // ERROR: Nombre de variable poco representativa
            Figura rectangulo = new Figura();
            rectangulo.base = 4;
            rectangulo.altura = 5;

            Triangulo triangulo = new Triangulo();
            triangulo.base = 4;
            triangulo.altura = 5;

            p.imprimirArea(rectangulo);
            p.imprimirArea(triangulo);
        }
    }
}
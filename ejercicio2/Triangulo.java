package ejercicio2;
public class Triangulo {
    // Declaramos los atributos
    // y establecemos su visibilidad en private
    // para que no sean alterados sino es a través
    // de un método
    private float lado1;
    private float lado2;
    private float lado3;

    // Declaramos el método constructor
    public Triangulo(float lado1, float lado2, float lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    // Declaramos el método para corroborar qué tipo de
    // triángulo es el objeto que instanciamos de la clase
    public void comprobarTipo() {
        if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("Equilátero");
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            System.out.println("Isóceles");
        } else {
            System.out.println("Escaleno");
        }
    }
}
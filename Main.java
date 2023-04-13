// Importamos desde una carpeta una clase
import ejercicio1.CadenaCaracteres;
import ejercicio2.Triangulo;
import ejercicio3.Votante;
import ejercicio4.Valores;
import ejercicio5.Pelicula;
import ejercicio6.Producto;

// El nombre de la clase debe coincidir con el nombre del archivo
public class Main{
    public static void main(String[] args) {
        CadenaCaracteres cadena = new CadenaCaracteres("hola mundo");

        // # Ejercicio 1
        // La notación por puntos nos permite invocar los métodos
        System.out.println("Primera mitad: " + cadena.obtenerPrimeraMitad());
        System.out.println("En mayuscula: " + cadena.obtenerEnMayuscula());
        System.out.println("Ultimo caracter: " + cadena.obtenerUltimoCaracter());
        System.out.println("En forma inversa: " + cadena.obtenerEnFormaInversa());
        System.out.println("Separado por guion: " + cadena.obtenerSeparadoPorGuion());
        System.out.println("Cantidad de vocales: " + cadena.obtenerCantidadDeVocales());

        System.out.println("-------------");
        System.out.println("-------------");
        System.out.println("Ejercicio 2:");
        // # Ejercicio 2

        Triangulo triangulo = new Triangulo(20,10,20);

        triangulo.comprobarTipo();

        System.out.println("-------------");
        System.out.println("-------------");
        System.out.println("Ejercicio 3:");
        // # Ejercicio 3

        // Creamos al votante
        Votante votante = new Votante(10);
        votante.ComprobarEdad();


        System.out.println("-------------");
        System.out.println("-------------");
        System.out.println("Ejercicio 4:");
        // # Ejercicio 4

        // Creamos el objeto
        // e iniciamos
        Valores valores = new Valores();

        System.out.println("Cantidad de Pares: " + valores.ContarPares());
        System.out.println("Cantidad de Impares: " + valores.ContarImpares());
        System.out.println("Suma de los pares: "+ valores.SumarPares());
        System.out.println("Suma de los impares " + valores.SumarImpares());
        System.out.println("Maximo Par: " + valores.MaximoPar());
        System.out.println("Maximo Impar: " + valores.MaximoImpar());
        System.out.println("Minimo Par: " + valores.MinimoPar());
        System.out.println("Minimo Impar: " + valores.MinimoImpar());


        System.out.println("-------------");
        System.out.println("-------------");
        System.out.println("Ejercicio 5:");
        // # Ejercicio 5

        Pelicula pelicula = new Pelicula("Jhon Wick 4", "Accion", 169, "PM18", "Chad Stahelski");

        pelicula.mostrarDatos();

        System.out.println("-------------");
        System.out.println("-------------");
        System.out.println("Ejercicio 6:");
        // # Ejercicio 6

        Producto producto = new Producto("#11H2C", "Huevo de pascuas dos corazones", "1000", "100", "21", " ");
        System.out.println("Producto: " + producto.getCodProducto());
        System.out.println("Nombre: " + producto.getNombre());
        System.out.println("Precio Compra: " + producto.getPrecioCosto());
        System.out.println("Precio Venta: " + producto.getPrecioVenta());
        System.out.println("Porcentaje Ganancia: " + producto.getPorcentajeGanancia());
        System.out.println("Porcentaje Iva: " + producto.getPorcentajeIva());

        // Esta función nos permite obtener el mayor de todos los objetos 
        // creados con la clase
        System.out.println("El mayor de todos los productos es: " + producto.getMayor().getNombre());
    }
}

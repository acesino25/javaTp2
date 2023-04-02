// Importamos desde una carpeta una clase
import ejercicio1.CadenaCaracteres;

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
    }
}

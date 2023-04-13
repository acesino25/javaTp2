public class Main{
    public static void main(String args[]){
        CadenaCaracteres cadena = new CadenaCaracteres("hola mundo");
        CadenaCaracteres cadena2 = new CadenaCaracteres("hello world");

        // # Ejercicio 1
        // La notación por puntos nos permite invocar los métodos
        System.out.println("Primera mitad: " + cadena.obtenerPrimeraMitad());
        System.out.println("En mayuscula: " + cadena.obtenerEnMayuscula());
        System.out.println("Ultimo caracter: " + cadena.obtenerUltimoCaracter());
        System.out.println("En forma inversa: " + cadena.obtenerEnFormaInversa());
        System.out.println("Separado por guion: " + cadena.obtenerSeparadoPorGuion());
        System.out.println("Cantidad de vocales: " + cadena.obtenerCantidadDeVocales());

        System.out.println("Elemento dos ..............");

        System.out.println("Primera mitad: " + cadena2.obtenerPrimeraMitad());
        System.out.println("En mayuscula: " + cadena2.obtenerEnMayuscula());
        System.out.println("Ultimo caracter: " + cadena2.obtenerUltimoCaracter());
        System.out.println("En forma inversa: " + cadena2.obtenerEnFormaInversa());
        System.out.println("Separado por guion: " + cadena2.obtenerSeparadoPorGuion());
        System.out.println("Cantidad de vocales: " + cadena2.obtenerCantidadDeVocales());
    }
}
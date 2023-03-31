public class CadenaCaracteres {
    
    // Privamos el atributo cadena para que no sea alterado
    // arbitrariamente
    private String cadena;
    
    // El constructor a la hora de llamar a la instanciación
    public CadenaCaracteres(String cadena) {
        this.cadena = cadena;
    }
    
    // i) obtenemos la mitad de la cadena
    public String obtenerPrimeraMitad() {
        return cadena.substring(0, cadena.length() / 2);
    }
    
    // ii) convertimos a mayúscula la cadena entera
    public String obtenerEnMayuscula() {
        return cadena.toUpperCase();
    }
    
    // iii) 'charAt' es un método que nos permite pasarle un entero
    // y obtener el caracter en esa posición de la cadena
    // NO Trabaja con valores negativos como es el caso de python
    public char obtenerUltimoCaracter() {
        return cadena.charAt(cadena.length() - 1);
    }
    

    public String obtenerEnFormaInversa() {
        // StringBuilder es una clase, similar a String
        // pero 'String' no puede mutar sus elementos
        // pero StringBuilder puede hacer uso de los 
        // siguientes modificadores:
        // append(), insert(), delete(), replace(), reverse()
        // append() es un concatenador más eficiente que el '+' de String
        // que crea un nuevo objeto cada vez que se invoca

        // append(), insert(), delete(), replace(), reverse()
        // con delete() pasamos los índices desde dónde hasta dónde queremos eliminar
        // con insert() pasamos el índice y el valor en string de lo que usaremos para reemplazar
        StringBuilder sb = new StringBuilder(cadena);
        return sb.reverse().toString();
    }
    
    public String obtenerSeparadoPorGuion() {
        // acá hacemos uso de los métodos join()
        // join() recibe un separador, y un array
        // split() recibe un separador desde el cual partirá
        // los elementos dentro del string
        return String.join("-", cadena.split(""));
    }
    
    public int obtenerCantidadDeVocales() {
        int cantidad = 0;
        for (int i = 0; i < cadena.length(); i++) {
            char c = Character.toLowerCase(cadena.charAt(i));
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                cantidad++;
            }
        }
        return cantidad;
    }
    
    public static void main(String[] args) {
        CadenaCaracteres cadena = new CadenaCaracteres("hola mundo");
        System.out.println("Primera mitad: " + cadena.obtenerPrimeraMitad());
        System.out.println("En mayuscula: " + cadena.obtenerEnMayuscula());
        System.out.println("Ultimo caracter: " + cadena.obtenerUltimoCaracter());
        System.out.println("En forma inversa: " + cadena.obtenerEnFormaInversa());
        System.out.println("Separado por guion: " + cadena.obtenerSeparadoPorGuion());
        System.out.println("Cantidad de vocales: " + cadena.obtenerCantidadDeVocales());
    }
}
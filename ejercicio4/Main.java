public class Main{
    public static void main(String args[]){
        // # Ejercicio 4

        // Creamos el objeto
        // e iniciamos
        Valores valores = new Valores();
        Valores valores2 = new Valores();

        System.out.println("Cantidad de Pares: " + valores.ContarPares());
        System.out.println("Cantidad de Impares: " + valores.ContarImpares());
        System.out.println("Suma de los pares: "+ valores.SumarPares());
        System.out.println("Suma de los impares " + valores.SumarImpares());
        System.out.println("Maximo Par: " + valores.MaximoPar());
        System.out.println("Maximo Impar: " + valores.MaximoImpar());
        System.out.println("Minimo Par: " + valores.MinimoPar());
        System.out.println("Minimo Impar: " + valores.MinimoImpar());
        
        // Como el ejercicio no pedía que le permitamos al usuario crear 
        // o insertar un array de elementos. Los generé en el código
        // y al no solicitarse un valor aleatorio se crean en seguidilla
        // del 0 al 9

        System.out.println("Cantidad de Pares: " + valores2.ContarPares());
        System.out.println("Cantidad de Impares: " + valores2.ContarImpares());
        System.out.println("Suma de los pares: "+ valores2.SumarPares());
        System.out.println("Suma de los impares " + valores2.SumarImpares());
        System.out.println("Maximo Par: " + valores2.MaximoPar());
        System.out.println("Maximo Impar: " + valores2.MaximoImpar());
        System.out.println("Minimo Par: " + valores2.MinimoPar());
        System.out.println("Minimo Impar: " + valores2.MinimoImpar());
    }
}
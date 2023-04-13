// Habilitar si queres usarlo con el Main fuera de la carpeta
//package ejercicio4;
// Declaramos la clase
public class Valores{
    // Declaramos los atributos
    private int[] numeros = new int[10];

    // Creamos el método constructor
    // inicializamos los valores
    public Valores(){
        for(int i = 0; i < numeros.length; i++){
            numeros[i] = i;
        }
    }

    // Los métodos deben realizar una única función
    public int ContarPares(){
        int contador = 0;

        for(int i = 0; i < this.numeros.length; i++){
            if(this.numeros[i] % 2 == 0){
                contador++;
            }
        }

        return contador;
    }
    // Retorna cantidad de impares
    public int ContarImpares(){
        int contador = 0;

        for(int i = 0; i < this.numeros.length; i++){
            if(this.numeros[i] % 2 != 0){
                contador++;
            }
        }

        return contador;
    }

    // Sumar Pares
    public int SumarPares(){
        int resultado = 0;

        for(int i = 0; i < numeros.length; i++){
            if(this.numeros[i] % 2 == 0){
                resultado += numeros[i];
            }
        }

        return resultado;
    }

    // Sumar Impares
    public int SumarImpares(){
        int resultado = 0;

        for(int i = 0; i < this.numeros.length; i++){
            if(this.numeros[i] % 2 != 0){
                resultado += numeros[i];
            }
        }

        return resultado;
    }

    // Obtener Máximo impar
    public int MaximoImpar(){
        int maximo = 0;

        for(int i = 0; i < this.numeros.length; i++){
            if(this.numeros[i] % 2 != 0){
                if(this.numeros[i] > maximo){
                    maximo = this.numeros[i];
                }
            }
        }

        return maximo;
    }

    // Obtener Minimo impar
    public int MinimoImpar(){
        int minimo = 1;

        for(int i = 0; i < this.numeros.length; i++){
            if(this.numeros[i] % 2 != 0){ // ES IMPAR
                if(this.numeros[i] < minimo){
                    minimo = this.numeros[i];
                }
            }
        }

        return minimo;
    }

    // PARES

    // Obtener Máximo impar
    public int MaximoPar(){
        int maximo = 0;

        for(int i = 0; i < this.numeros.length; i++){
            if(this.numeros[i] % 2 == 0){
                if(this.numeros[i] > maximo){
                    maximo = this.numeros[i];
                }
            }
        }

        return maximo;
    }

    // Obtener Minimo impar
    public int MinimoPar(){
        int minimo = 0;

        for(int i = 0; i < this.numeros.length; i++){
            if(this.numeros[i] % 2 == 0){
                if(this.numeros[i] < minimo){
                    minimo = this.numeros[i];
                }
            }
        }

        return minimo;
    }
    
}
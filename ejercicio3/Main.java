public class Main{
    public static void main(String args[]){
        // Creamos al votante
        Votante votante = new Votante(10);
        Votante votante2 = new Votante(24);
        votante.ComprobarEdad();
        votante2.ComprobarEdad();
    }
}
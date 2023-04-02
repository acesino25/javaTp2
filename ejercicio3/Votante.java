package ejercicio3;
// Declaramos la clase
public class Votante{
    // declaramos dos valores privados
    // que no tendrán método modificador
    private int edad;

    static private int EDADMINIMA = 18;
    static private int EDADMAXIMA = 63;

    // Declaramos el constructor

    public Votante(int edad){
        this.edad = edad;
    }

    // Declaramos un getter para devolver condicionalmente una respuesta
    public void ComprobarEdad(){
        if(this.edad > EDADMINIMA && this.edad < EDADMAXIMA){
            System.out.println("Votante habilitado")
        }else{
            System.out.println("Votante inhabilitado")
        }
    }

}
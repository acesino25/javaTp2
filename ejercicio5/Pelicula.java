package ejercicio5;

public class Pelicula {
    // Atributos
    private String titulo;
    private String genero;
    private int duracion;
    private String calificacion;
    private String director;

    // Constructor
    public Pelicula(String titulo, String genero, int duracion, String calificacion, String director) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracion = duracion;
        this.calificacion = calificacion;
        this.director = director;
    }

    // GETTERS y SETTERS

    /**
     * TITULO
     */
    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * GENERO
     */
    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * DURACIÓN
     */
    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    /**
     * CALIFICACIÓN
     */
    public String getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }

    /**
     * DIRECTOR
     */
    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void mostrarDatos() {
        System.out.println("Título: " + titulo);
        System.out.println("Género: " + genero);
        System.out.println("Duración: " + duracion + " minutos");
        System.out.println("Calificación: " + calificacion);
        System.out.println("Director: " + director);
    }
    
}
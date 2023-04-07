/**
 * EL BUG DEL PUNTO FLOTANTE:
 * Este problema se debe a la forma en que los números
 *  decimales se representan en la memoria de la 
 * computadora utilizando una cantidad finita de bits.
 *  Debido a esta representación binaria, algunos números
 *  decimales no se pueden representar con precisión exacta
 *  y se redondean al número más cercano que se puede representar.


 * Por ejemplo, si intentamos representar el número decimal 0.1 en una variable de tipo "double", en realidad se almacenará como una aproximación binaria de 0.1000000000000000055511151231257827021181583404541015625 debido a la limitación de precisión.
 * 
 * En Java, una forma de evitar el problema de precisión 
 * de punto flotante es utilizando la clase BigDecimal en 
 * lugar de los tipos de datos de punto flotante como 
 * "float" o "double". La clase BigDecimal permite representar
 *  números decimales con una precisión arbitraria, lo que
 *  significa que no hay límites en la cantidad de dígitos 
 * decimales que se pueden representar.

BIG DECIMAL NECESITA UN STRING:
    Para crear un objeto BigDecimal, se debe pasar un valor de tipo String
    que representa el número decimal, en lugar de pasar directamente el 
    valor numérico como se haría con los tipos de datos de punto flotante.

    import java.math.BigDecimal;

    // Crear un objeto BigDecimal con un valor de 0.1
    BigDecimal decimal = new BigDecimal("0.1");

    // Realizar operaciones con BigDecimal
    BigDecimal resultado = decimal.multiply(new BigDecimal("2"));
 */

import java.math.BigDecimal;

class Producto{

    // Atributos
    // Cod y Nombre
    private String codProducto;
    private String nombre;
    // Precio
    private BigDecimal precioCosto;
    private BigDecimal porcentajeGanancia;
    private BigDecimal porcentajeIva;
    private BigDecimal precioVenta;


    // Constructor; 
    // Trabajaremos como String la mayoría delos elementos porque es una condición
    // para trabajar con BigDecimal
    public Producto(String codProducto, String nombre, String precioCosto, String porcentajeGanancia, String porcentajeIva, String precioVenta){
        this.codProducto = codProducto;
        this.nombre = nombre;
        // el resto lo operaremos con getters y setters
        precioCosto(precioCosto);
    }

    // GETTERS y SETTERS

    // codProducto
    public BigDecimal getCodProducto(){
        return this.codProducto;
    }
    public void setCodProducto(String codProducto){
        this.codProducto = new BigDecimal(codProducto)
    }

    // nombre
    public BigDecimal getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = new BigDecimal(nombre)
    }


    // precioCosto
    public BigDecimal getPrecioCosto(){
        return this.precioCosto;
    }
    public void setPrecioCosto(String precioCosto){
        this.precioCosto = new BigDecimal(precioCosto)
    }

    // porcentajeGanancia
    public BigDecimal getPorcentajeGanancia(){
        return this.porcentajeGanancia;
    }
    public void setPorcentajeGanancia(String porcentajeGanancia){
        this.porcentajeGanancia = new BigDecimal(porcentajeGanancia)
    }

    // porcentajeIva
    public BigDecimal getPorcentajeIva(){
        return this.porcentajeIva;
    }
    public void setPorcentajeIva(String porcentajeIva){
        this.porcentajeIva = new BigDecimal(porcentajeIva)
    }


    // precioVenta
    public BigDecimal getPrecioVenta(){
        return this.precioVenta;
    }
    public void setPrecioVenta(String precioVenta){
        this.precioVenta = new BigDecimal(precioVenta)
    }


}
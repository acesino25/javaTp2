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

BIG DECIMAL NECESITA UN STRING: //NOTA: PARECE QUE PUEDE USAR un INT (Pero trabajaremos con string. Leer documentación)
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

    // MAYOR
    // un estático es un valor único para todos los objetos de la clase
    // en este caso particular deseamos guardar el objeto que a la hora de
    // su creación sea el de mayor valor
    private static Producto mayor;


    // Constructor; 
    // Trabajaremos como String la mayoría de los elementos porque es una condición
    // para trabajar con BigDecimal
    public Producto(String codProducto, String nombre, String precioCosto, String porcentajeGanancia, String porcentajeIva, String precioVenta){
        this.codProducto = codProducto;
        this.nombre = nombre;
        // el resto lo operaremos con getters y setters
        setPrecioCosto(precioCosto);
        setPorcentajeGanancia(porcentajeGanancia);
        setPorcentajeIva(porcentajeIva);
        // Obtenido de la suma del precio de costo + el porcentaje de ganancia
        setPrecioVenta()

        // Guardamos el objeto con mayor valor de precio
        if(this.getPrecioVenta > mayor.precioVenta || mayor == null){
            mayor = this;
        }
        
    }

    // GETTERS y SETTERS

    // codProducto
    public String getCodProducto(){
        return this.codProducto;
    }
    public void setCodProducto(String codProducto){
        this.codProducto = codProducto;
    }

    // nombre
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }


    // precioCosto
    public BigDecimal getPrecioCosto(){
        return this.precioCosto;
    }
    public void setPrecioCosto(String precioCosto){
        this.precioCosto = new BigDecimal(precioCosto);
    }

    // porcentajeGanancia
    // GET
    public BigDecimal getPorcentajeGanancia(){
        return this.porcentajeGanancia;
    }
    // SET
    public void setPorcentajeGanancia(String porcentajeGanancia){
        if(porcentajeGanancia != "" || porcentajeGanancia != null){
            this.porcentajeGanancia = new BigDecimal(porcentajeGanancia);
        }else{
            
            // En esta parte vamos a DIVIDIR POR 100 el BIG DECIMAL
            // Declaramos las variables
            BigDecimal porcentajeGananciaDividir = new BigDecimal(porcentajeGanancia);
            BigDecimal divisor = new BigDecimal('100');

            // Dividimos y
            // Asignamos 
            this.porcentajeGanancia = BigDecimal resultado = porcentajeGananciaDividir.divide(divisor, RoundingMode.DOWN);

        }
        
    }

    // porcentajeIva
    public BigDecimal getPorcentajeIva(){
        return this.porcentajeIva;
    }
    public void setPorcentajeIva(String porcentajeIva){
        this.porcentajeIva = new BigDecimal(porcentajeIva);
    }


    // precioVenta
    public BigDecimal getPrecioVenta(){
        return this.precioVenta;
    }
    public void setPrecioVenta(String precioVenta){
        
        if(precioVenta == "" || precioVenta == null){
            // El uso del método 'add' no muta el valor original
            this.precioVenta = this.precioCosto.add(this.porcentajeGanancia);
        }else{
            // Si queremos sobre escribir el valor por cualquier cosa lo hacemos.
            // NO sería lo recomendable. Después consultaríamos con el cliente
            // para ver si es necesario crear una contra medida para que no se exceda
            // cierto precio. Pero el justificativo para que esto exista es para
            // que en caso de errores o que detectemos una baja en el mercado proteger los precios
            // y de inmediato poner un precio que evite compras que generen pérdidas
            // podríamos tener otro argumento que a voluntad indique si queremos hacer esto o no
            // y que se complemente con el frontend de la app
            // igual podemos pasar el valor vacío y la función se encargará de dar un nuevo valor.
            this.precioVenta = new BigDecimal(precioVenta);
        }
    }


}
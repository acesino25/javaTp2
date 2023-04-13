public class Main{
    public static void main(String args[]){
        // # Ejercicio 6

        Producto producto = new Producto("#11H2C", "Huevo de pascuas dos corazones", "1000", "100", "21", " ");
        Producto producto2 = new Producto("#11HK", "Huevo Kinder", "21000", "100", "21", " ");

        System.out.println("Producto: " + producto.getCodProducto());
        System.out.println("Nombre: " + producto.getNombre());
        System.out.println("Precio Compra: " + producto.getPrecioCosto());
        System.out.println("Precio Venta: " + producto.getPrecioVenta());
        System.out.println("Porcentaje Ganancia: " + producto.getPorcentajeGanancia());
        System.out.println("Porcentaje Iva: " + producto.getPorcentajeIva());

        System.out.println("--------- Producto 2");


        System.out.println("Producto: " + producto2.getCodProducto());
        System.out.println("Nombre: " + producto2.getNombre());
        System.out.println("Precio Compra: " + producto2.getPrecioCosto());
        System.out.println("Precio Venta: " + producto2.getPrecioVenta());
        System.out.println("Porcentaje Ganancia: " + producto2.getPorcentajeGanancia());
        System.out.println("Porcentaje Iva: " + producto2.getPorcentajeIva());

        // Esta función nos permite obtener el mayor de todos los objetos 
        // creados con la clase
        System.out.println("El mayor de todos los productos es: " + producto.getMayor().getNombre());
    }
}
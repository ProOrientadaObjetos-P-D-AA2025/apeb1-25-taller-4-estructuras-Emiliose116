package problema1_EjecutarVentaProductos;

import java.util.Scanner;

public class EjecutarVentaProductos {
    public static void main(String[] args) {
        
        Scanner tcl = new Scanner(System.in);

        System.out.println("Ingrese el precio del producto:");
        double precio = tcl.nextDouble();

        System.out.println("Ingrese la cantidad de productos:");
        int cantidad = tcl.nextInt();

        VentaProductos venta = new VentaProductos(precio, cantidad);
        double descuento = venta.calcularDescuento();
        double precioFinal = venta.calcularPrecioFinal();

        System.out.println("Descuento aplicado: " + (int)(descuento * 100) + "%");
        System.out.println("Precio final de la compra: $" + precioFinal);
    }
}
/**
 * Ingrese el precio del producto:
 * 75
 * Ingrese la cantidad de productos:
 * 12
 * Descuento aplicado: 5%
 * Precio final de la compra: $855.0
 * BUILD SUCCESSFUL (total time: 12 seconds)
 */
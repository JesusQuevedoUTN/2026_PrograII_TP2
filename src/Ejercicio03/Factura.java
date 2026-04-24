package Ejercicio03;
import java.util.ArrayList;

/*
Ejercicio 3
Cree una clase llamada Factura, que una ferretería podría utilizar para 
representar una factura para un artículo vendido 
en la tienda. Una Factura debe incluir un número de factura, un número de 
articulo, la descripción del articulo, la 
cantidad de artículos de ese tipo que se van a comprar y el precio por 
artículo. Su clase debe tener un constructor que 
inicialice las variables de instancia. 
Proporcione los métodos get y set  para cada variable de instancia. 

Además, 
proporcione un método llamado obtenerMontoFactura, que calcule el monto 
de la factura (es decir, que multiplique la 
cantidad por el precio por artículo) y después lo devuelva como un valor 
double. 

Si la cantidad no es positiva, debe 
establecerse en 0. Si el precio por artículo no es positivo, debe 
establecerse en 0.0. Escriba una aplicación de prueba 
llamada PruebaFactura, que demuestre las capacidades de la clase Factura.
 */


public class Factura {

    private static int idDeLasFacturas = 1;
    private int numeroDeFactura;
    
    private ArrayList<CantidadDeArticulos> productos;

    public Factura() {
        this.numeroDeFactura = idDeLasFacturas;
        idDeLasFacturas++;
        this.productos = new ArrayList<>();
    }

    public void agregarArticulo(Articulo articulo, int cantidad) {
        if (cantidad > 0) {
            int i = 0;
            while (i <= productos.size() && articulo != productos[i].getArticulo() ) {
                i++;
            }
        }
    }

    public double montoFactura() {
        double total = 0;
        for (int i = 0; i < productos.size(); i++) {
            total += productos.get(i).getTotal();
        }
        return total;
    }
    
}

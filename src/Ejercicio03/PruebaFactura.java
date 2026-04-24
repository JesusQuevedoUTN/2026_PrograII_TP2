package Ejercicio03;

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
public class PruebaFactura {

    public static void main(String[] args) {
        //Main creado con Gemini
        
        // --- EJEMPLO 1 
        Factura f1 = new Factura();
        f1.agregarArticulo(Articulo.LLAVE_INGLESA, 1);
        f1.agregarArticulo(Articulo.TORNILLOS, 50);
        f1.agregarArticulo(Articulo.MARTILLO, 1);
        
        System.out.println("Factura Nro: 1");
        System.out.println("Monto total de compra grande: $" + f1.montoFactura());
        
        System.out.println("------------------------------------");

        // --- EJEMPLO 2 
        // Imagina que alguien viene solo por un par de cosas
        Factura f2 = new Factura();
        
        // El cliente compra 1 Martillo
        f2.agregarArticulo(Articulo.MARTILLO, 1);
        
        // Se arrepiente y pide 1 Martillo más 
        f2.agregarArticulo(Articulo.MARTILLO, 1);
        
        // Intenta comprar -10 tornillos por error 
        f2.agregarArticulo(Articulo.TORNILLOS, -10);

        System.out.println("Factura Nro: 2");
        System.out.println("Artículos: 2 Martillos");
        System.out.println("Monto total de compra express: $" + f2.montoFactura());
    }
}

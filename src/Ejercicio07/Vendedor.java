package Ejercicio07;

import java.util.ArrayList;

/*
Ejercicio 7

Una compñía tiene cuatro vendedores que venden cinco productos distintos. Al finalizar la jornada laboral, cada vendedor 
pasa una nota por cada tipo de producto vendido. Cada nota contiene lo siguiente:
a) El número del vendedor
b) El número del producto
c) El valor total de ese producto vendido en ese día
Así, cada vendedor pasa entre 0 y 5 notas de venta por día. Suponga que está disponible la información sobre todas las 
notas del mes pasado. Escriba una aplicación que lea toda esta información para las ventas del último mes y que resuma 
las ventas totales por vendedor, y por producto. Todos los totales deben guardarse en el vector bidimensional ventas.
Después de procesar toda la información del mes pasado, muestre los resultados en formato tabular, en donde cada 
columna represente a un vendedor específico y cada fila simboliza un producto. Saque el total de cada fila para 
obtener las ventas totales de cada producto durante el último mes. Calcule el total de cada columna para sacar las 
ventas totales de cada vendedor durante el último mes. Su impresión tabular debe incluir estos totales cruzados a la 
derecha de las filas totalizadas, y en la parte inferior de las columnas totalizadas.
 */
public class Vendedor {

    private static int ID_VENDEDOR = 1;
    
    private int idVendedor;
    private String apellido;
    private ArrayList<Factura> articulosVendidos;

    public Vendedor(String apellido) {
        this.idVendedor = ID_VENDEDOR;
        this.apellido = apellido;
        ID_VENDEDOR++;
        articulosVendidos = new ArrayList<>();
    }

    public void vender(Articulo articulo) {
        articulosVendidos.add(new Factura(this.idVendedor,articulo));
    }

    public ArrayList<Factura> getArticulosVendidos() {
        return articulosVendidos;
    }
    
    
}

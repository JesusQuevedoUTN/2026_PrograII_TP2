package Ejercicio06;

/*
Ejercicio 6
El sector de ventas online de notebooks Lenovo paga a sus vendedores mediante comisiones. Los vendedores reciben $2000 por
semana, más el 6% de sus ventas brutas durante esa semana. Por ejemplo, un vendedor que vende $50000 de mercancía en una
semana, recibe $2000 más el 6% de $50000, o un total de $5000. Usted acaba de recibir una lista de los artículos vendidos
por cada vendedor. Los valores de estos artículos son los siguientes:

 Articulo      Valor
     1      $ 7239.99
     2      $ 9129.75
     3      $ 6899.95
     4      $ 13150.89

Desarrolle una aplicación en JAVA que reciba como entrada los artículos vendidos por un vendedor durante cada día de la
última semana, y que calcule y muestre los ingresos de ese vendedor. No hay límite en cuanto al número de artículos que
un representante puede vender.
 */

public class Ejercicio06 {
    public static void main(String[] args) {
        System.out.println("--- LIQUIDACIÓN DE SUELDOS LENOVO ---");
        System.out.println("-------------------------------------------------------------------------");

        // 1. Creamos varios vendedores de prueba
        Vendedor v1 = new Vendedor("Gomez");
        Vendedor v2 = new Vendedor("Lopez");
        Vendedor v3 = new Vendedor("Rodriguez");
        Vendedor v4 = new Vendedor("Quevedo");

        // 2. Simulamos las ventas de la semana para cada uno

        // Caso A: Gomez no vendió nada esta semana (Sueldo base puro)
        // No le agregamos ventas.

        // Caso B: Lopez vendió solo dos notebooks económicas
        v2.vender(Articulo.HP_1);
        v2.vender(Articulo.SAMSUNG_2B);

        // Caso C: Rodriguez vendió un artículo de cada uno
        v3.vender(Articulo.HP_1);
        v3.vender(Articulo.APPLE_G2);
        v3.vender(Articulo.SAMSUNG_2B);
        v3.vender(Articulo.OMEN_HP);

        // Caso D: Quevedo (El vendedor estrella, vendió mucho y repetido)
        v4.vender(Articulo.OMEN_HP);
        v4.vender(Articulo.OMEN_HP);
        v4.vender(Articulo.APPLE_G2);
        v4.vender(Articulo.HP_1);
        v4.vender(Articulo.APPLE_G2);

        // 3. Calculamos y mostramos los ingresos por pantalla
        v1.calcularSueldo();
        v2.calcularSueldo();
        v3.calcularSueldo();
        v4.calcularSueldo();
        
        System.out.println("-------------------------------------------------------------------------");
    }
}

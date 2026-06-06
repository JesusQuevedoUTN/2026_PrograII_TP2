package Ejercicio10;

/*
Ejercicio 10 (Opcional)

Cree una clase llamada Racional para realizar operaciones aritméticas con fracciones.
Escriba un programa para probar su clase. 
Use variables enteras para representar las variables de instancia de la clase: 

el numerador y el denominador. 
Proporcione un constructor que permita inicializarse a un objeto de esta clase al ser declarado. 

El constructor debe almacenar la fracción en forma reducida. La fracción 2/4 es equivalente a 1/2 y debe 
guardarse en el objeto como 1 en el numerador y 2 en el denominador. 

Proporcione un constructor sin argumentos con  valores predeterminados, en caso de que no se proporcionen inicializadores. 
Proporcione métodos public que realicen cada una de las siguientes operaciones:

a) Sumar dos números Racional: el resultado de la suma debe almacenarse en forma reducida. Implemente esto como un 
método static.
b) Restar dos números Racional: el resultado de la resta debe almacenarse en forma reducida. Implemente esto como un 
método static.
c) Multiplicar dos números Racional: el resultado de la multiplicación debe almacenarse en forma reducida. Implemente 
esto como un método static .
d) Dividir dos números Racional: el resultado de la división debe almacenarse en forma reducida. Implemente esto como 
un método static.

e) Devolver una representación String de un número Racional en la forma a/b, en donde a es el numerador y b es el 
denominador.
f) Devolver una representación String de un número Racional en formato de punto flotante. (Considere proporcionar 
capacidades de formato, que permitan al usuario de la clase especificar el número de dígitos de precisión a la derecha 
del punto decimal).
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        //Main creado con Gemini
        
        System.out.println("=== PRUEBAS CLASE RACIONAL ===");

        // 1. Probar constructores y reducción automática
        Racional r1 = new Racional(); // Por defecto: 1/1
        Racional r2 = new Racional(2, 4); // Debe reducir a 1/2
        Racional r3 = new Racional(-18, 6); // Debe reducir a -3/1 (Manejo de negativos)
        Racional r4 = new Racional(24, -20); // Debe reducir a -6/5 (Signo abajo)

        System.out.println("Racional por defecto (r1): " + r1);
        System.out.println("Racional 2/4 reducido (r2): " + r2);
        System.out.println("Racional -18/6 reducido (r3): " + r3);
        System.out.println("Racional 24/-20 reducido (r4): " + r4);
        System.out.println();

        // 2. Probar operaciones aritméticas estáticas
        System.out.println("=== OPERACIONES ARITMÉTICAS ===");
        Racional n1 = new Racional(1, 2);
        Racional n2 = new Racional(1, 3);
        Racional nNegativo = new Racional(-3, 4);

        // Suma: 1/2 + 1/3 = 5/6
        Racional suma = Racional.sumar(n1, n2);
        System.out.println("Suma (" + n1 + " + " + n2 + "): " + suma);

        // Resta con negativo involucrado: 1/3 - (-3/4) = 1/3 + 3/4 = 13/12
        Racional resta = Racional.restar(n2, nNegativo);
        System.out.println("Resta (" + n2 + " - " + nNegativo + "): " + resta);

        // Multiplicación: 1/2 * (-3/4) = -3/8
        Racional multiplicacion = Racional.multiplicar(n1, nNegativo);
        System.out.println("Multiplicación (" + n1 + " * " + nNegativo + "): " + multiplicacion);

        // División: (1/2) / (1/3) = 3/2
        Racional division = Racional.dividir(n1, n2);
        System.out.println("División (" + n1 + " / " + n2 + "): " + division);
        System.out.println();

        // 3. Probar representación en Punto Flotante con precisión variable
        System.out.println("=== FORMATO PUNTO FLOTANTE ===");
        Racional fraccionPeriodica = new Racional(1, 3); // 0.33333...
        Racional fraccionNegativa = new Racional(-7, 8); // -0.875

        System.out.println("Fracción 1/3 con 2 decimales: " + fraccionPeriodica.toStringFlotante(2));
        System.out.println("Fracción 1/3 con 5 decimales: " + fraccionPeriodica.toStringFlotante(5));
        System.out.println("Fracción -7/8 con 1 decimal:   " + fraccionNegativa.toStringFlotante(1));
        System.out.println("Fracción -7/8 con 4 decimales: " + fraccionNegativa.toStringFlotante(4));
    }
}

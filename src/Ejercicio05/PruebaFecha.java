package Ejercicio05;

/*
Ejercicio 5

Cree una clase llamada Fecha, que incluya tres variables de instancia: 
un mes (int), un día (int) y un año (int). Su clase  debe tener un 
constructor que inicialice las tres variables de instancia, y debe 
verificar que los valores que se proporcionan son correctos. 
Proporcione los métodos get y set para cada variable de instancia. 
Proporcione un método mostrarFecha , para Imprimir la fecha en varios 
formatos, como
     05/21/2010
     Junio 14, 2012
     20 Agosto 11
Usar constructores sobrecargados para crear objetos Fecha 
inicializados con fechas de los formatos solicitados para imprimir. 
En el primer caso, el constructor debe recibir tres valores enteros. 
En el segundo, debe recibir un objeto String y dos valores enteros. 
En el tercero debe recibir un valor entero, string y otro entero. 
Escriba una aplicación de prueba llamada PruebaFecha, que demuestre 
las capacidades de la clase Fecha.
 */
public class PruebaFecha {
public static void main(String[] args) {
        //Main hecho con Gemini
    
        System.out.println("--- PRUEBA DE FORMATOS DE FECHA ---");

        // 1. Tres valores enteros (según el ejemplo del profe: 05/21/2010)
        // Ojo: el profe puso mes primero en el ejemplo, así que mandamos 5, 21, 2010
        Fecha f1 = new Fecha(21, 5, 2010); 
        System.out.print("Formato A: ");
        f1.mostrarCasoA();

        // 2. String y dos valores enteros (Junio 14, 2012)
        Fecha f2 = new Fecha("Junio", 14, 2012);
        System.out.print("Formato B: ");
        f2.mostrarCasoB();

        // 3. Entero, String y otro entero (20 Agosto 11)
        Fecha f3 = new Fecha(20, "Agosto", 2011);
        System.out.print("Formato C: ");
        f3.mostrarCasoC();
        
        System.out.println("\n--- Prueba de error (Mes inexistente) ---");
        Fecha fError = new Fecha("Enerooooo", 35, 3024);
        fError.mostrarCasoB();
    }
}
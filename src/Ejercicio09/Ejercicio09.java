package Ejercicio09;

/*
Ejercicio 9
Cree una clase llamada Complejo para realizar operaciones aritméticas con números complejos.
Estos números tienen la forma parte Real + parte imaginaria * i

Escriba un programa para probar su clase. 

Use variables de punto flotante para representar los datos private de la clase.
Proporcione un constructor que permita que un objeto de esta clase se inicialice al declararse. 
Proporcione un constructor sin argumentos con valores predeterminados, en caso de que no se proporcionen inicializadores. 

Ofrezca métodos public que realicen las siguientes operaciones:
a) Sumar dos números Complejos: las partes reales se suman entre sí y las partes imaginarias también.
b) Restar dos números Complejos: la parte real del operando derecho se resta de la parte real del operando izquierdo, y 
la parte imaginaria del operando derecho se resta de la parte imaginaria del operando izquierdo.
c) Imprimir números Complejos en la forma (parte Real, parte imaginaria) .
 */
public class Ejercicio09 {
    public static void main(String[] args) {

        //Main creado con Gemini PRO

        System.out.println("==================================================");
        System.out.println("          PRUEBA DE NÚMEROS COMPLEJOS             ");
        System.out.println("==================================================");

        // 1. Probar constructor con argumentos
        Complejo c1 = new Complejo(9.5f, 4.2f);
        Complejo c2 = new Complejo(3.1f, 1.8f);

        // 2. Probar constructor por defecto (sin argumentos)
        Complejo cDefecto = new Complejo();

        System.out.print("Número Complejo 1: ");
        c1.mostrarComplejo();

        System.out.print("Número Complejo 2: ");
        c2.mostrarComplejo();

        System.out.print("Número por Defecto: ");
        cDefecto.mostrarComplejo();
        System.out.println("--------------------------------------------------");

        // 3. Probar la Suma (c1 + c2)
        Complejo resultadoSuma = c1.sumar(c2);
        System.out.print("Resultado de la SUMA (C1 + C2): ");
        resultadoSuma.mostrarComplejo();

        // 4. Probar la Resta (c1 - c2)
        Complejo resultadoResta = c1.restar(c2);
        System.out.print("Resultado de la RESTA (C1 - C2): ");
        resultadoResta.mostrarComplejo();
        
        System.out.println("==================================================");
    }
}

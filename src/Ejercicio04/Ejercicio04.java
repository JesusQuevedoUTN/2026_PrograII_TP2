package Ejercicio04;

/*
Ejercicio 4
Cree una clase llamada Rectángulo con los atributos longitud y anchura, cada uno con un valor predeterminado de 1. Debe tener 
métodos para calcular el perímetro y el área del rectángulo. Debe tener métodos get y set para longitud y anchura. Los 
métodos set deben verificar que longitud y anchura sean números de punto flotante mayores de 0.0, y menores de 20.0. Escriba 
un programa para probar la clase Rectángulo y cada uno de sus métodos.
 */
public class Ejercicio04 {
    public static void main(String[] args) {
        // Main hecho con Gemini
        
        // 1. Creamos el objeto (nace con valores por defecto 1 y 1)
        Rectangulo r1 = new Rectangulo();
        System.out.println("--- Rectángulo por Defecto ---");
        System.out.println("Base: " + r1.getLargo());
        System.out.println("Altura: " + r1.getAlto());
        System.out.println("Perímetro: " + r1.perimetro());
        System.out.println("Área: " + r1.area());

        System.out.println("\n--- Modificando Valores (Válidos) ---");
        r1.setLargo(10.5);
        r1.setAlto(5.0);
        System.out.println("Nueva Base: " + r1.getLargo());
        System.out.println("Nueva Altura: " + r1.getAlto());
        System.out.println("Nuevo Perímetro: " + r1.perimetro());
        System.out.println("Nuevo Área: " + r1.area());

        System.out.println("\n--- Probando Límites (Inválidos) ---");
        // Intentamos poner 50 (no debería cambiar el valor anterior de 10.5)
        r1.setLargo(50.0); 
        // Intentamos poner -5 (no debería cambiar el valor anterior de 5.0)
        r1.setAlto(-5.0);
        
        System.out.println("Base (debería seguir en 10.5): " + r1.getLargo());
        System.out.println("Altura (debería seguir en 5.0): " + r1.getAlto());
        
        if(r1.getLargo() == 10.5 && r1.getAlto() == 5.0) {
            System.out.println(">> Validación exitosa: Los valores fuera de rango fueron ignorados.");
        }
    }
}
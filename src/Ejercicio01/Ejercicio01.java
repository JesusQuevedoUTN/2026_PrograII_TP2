/*
Ejercicio 1
Cree una clase llamada Empleado, que incluya tres variables de instancia: el nombre (String), un apellido (String) y 
un salario mensual (double). Su clase debe tener un constructor que inicialice las tres variables de instancia. 
Proporcione los métodos get y set para cada variable de instancia. Si el salario mensual no es positivo, no establezca 
su valor. 

Escriba una aplicación de prueba llamada PruebaEmpleado, que demuestre las capacidades de la clase Empleado.

Cree dos objetos Empleado y muestre el salario anual de cada objeto. Después, proporcione a cada Empleado un aumento 
del 10% y muestre el salario anual de cada Empleado otra vez.
 */
package Ejercicio01;
public class Ejercicio01 {

    public static void main(String[] args) {
        Empleado jaimito = new Empleado("Jaime", "Gutierrez");
        Empleado jose = new Empleado("Jose", "Jose", 2500);
        
        jaimito.mostrarEmpleado();
        System.out.println("");
        jose.mostrarEmpleado();
        
        jose.aumento(10);
        System.out.println("");
        jaimito.aumento();
        jaimito.aumento(-15);
        
        jaimito.mostrarEmpleado();
        System.out.println("");
        jose.mostrarEmpleado();
        
        System.out.println(jose.getApellido());
        System.out.println(jose.getNombre());
        
        jose.mostrarEmpleado();
        
    }
    
}

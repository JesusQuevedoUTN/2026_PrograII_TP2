package Ejercicio01;

// Autor: Chisus
// Fecha de creación: 24/04/2026
/*
Ejercicio 1
Cree una clase llamada Empleado, que incluya tres variables de instancia: el nombre (String), un apellido (String) y 
un salario mensual (double). Su clase debe tener un constructor que inicialice las tres variables de instancia. 
Proporcione los métodos get y set para cada variable de instancia. Si el salario mensual no es positivo, no establezca 
su valor. Escriba una aplicación de prueba llamada PruebaEmpleado, que demuestre las capacidades de la clase Empleado. 
Cree dos objetos Empleado y muestre el salario anual de cada objeto. Después, proporcione a cada Empleado un aumento 
del 10% y muestre el salario anual de cada Empleado otra vez.
 */
public class Empleado {

    private String nombre;
    private String apellido;
    private double salario;
    private final double SUELDO_MINIMO = 1000000;
    
    public Empleado(String nombre, String apellido, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
    }
    
    public Empleado(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = SUELDO_MINIMO;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario>=0) {
            this.salario = salario;            
        }
        else{
            System.out.println("Hagalo bien");
        }
    }

    public void aumento(){
        this.salario *= 1.1;
    }
    
    public void aumento(double valor){
        if (valor>0) {
            this.salario *= valor;
        }
        else{
            System.out.println("Hagalo bien");
        }
    }
    
    public void mostrarEmpleado() {
        System.out.println(nombre + " " + apellido );
        System.out.println("salario: $" + salario);
    }
    
    
}

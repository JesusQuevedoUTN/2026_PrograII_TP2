package Ejercicio08;

/*
Ejercicio 8
Cree una clase llamada CuentaDeAhorros. 
Use una variable static llamada tasalnteresAnual para almacenar la tasa de interés anual para todos los clientes. 
Cada objeto de la clase debe contener una variable de instancia llamada saldoAhorros, que indique la cantidad que 
el ahorrador tiene actualmente en depósito.

Proporcione el método calcularlnteresMensual para calcular el interés mensual, multiplicando el saldoAhorros por 
la tasalnteresAnual dividida entre 12; este interés debe sumarse al saldoAhorros. 

Proporcione un método static llamado modificarTasalnteres para establecer la tasalnteresAnual en un nuevo valor. 
Escriba un programa para probar la clase CuentaDeAhorros. 

Cree dos instancias de objetos CuentaDeAhorros, ahorradorl y ahorrador2, con saldos de  $20000.00 y $30000.00. 
Establezca la tasalnteresAnual en 4%, después calcule el interés mensual para cada uno de los 12 meses e 
imprima los nuevos saldos para ambos ahorradores. Luego establezca la tasalnteresAnual en 5%, 
calcule el interés del siguiente mes e imprima los nuevos saldos para ambos ahorradores.
 */
public class CuentaDeAhorro {
    static double tasalnteresAnual = 0;
    
    private double saldoAhorros;

    public CuentaDeAhorro(double saldoAhorros) {
        this.saldoAhorros = saldoAhorros;
    }

    public void mostrarSaldo() {
        System.out.println("Saldo ahorros: " + saldoAhorros);
    }

    public void calcularInteresAnual() {
        saldoAhorros += saldoAhorros*tasalnteresAnual;
    }

    static void modificarTasalnteres(int porcentaje){
        System.out.println("La tasa aumenta a un %" + porcentaje + " por cada mes");
        tasalnteresAnual = porcentaje/100.0;
    }
            
    public void calcularInteresMensual() {
        saldoAhorros += (saldoAhorros*tasalnteresAnual)/12;
    }
    
}

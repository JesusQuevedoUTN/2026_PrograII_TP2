package Ejercicio02;

/*
Ejercicio 2
Realizar una aplicación sencilla para simular una cuenta bancaria 
(caja de ahorro). Una cuenta bancaria vista como un objeto 
tiene, por una parte, atributos que definen su estado, como Tipo de 
interés y Saldo, y por otra, operaciones que definen su 
comportamiento, como Establecer tipo de interés, Ingresar dinero, 
Retirar dinero, Saldo actual o Abonar intereses. Asegúrese 
que el monto a retirar no exceda el saldo de Cuenta. Si lo hace, 
el saldo debe permanecer sin cambio y el método debe 
imprimir un mensaje que indique " El monto a retirar excede el 
saldo de la cuenta.” Realice la clase PruebaCuenta para 
probar los diferentes métodos.
*/

public class PruebaCuenta {
    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria();
        CuentaBancaria cuenta2 = new CuentaBancaria(TipoDeInteres.AHORRO);
        CuentaBancaria cuenta3 = new CuentaBancaria(TipoDeInteres.CORRIENTE);
        
        cuenta1.setTipo(TipoDeInteres.SUELDO);
        
        cuenta1.mostrar();
        
        cuenta1.ingresarDinero(1000);
        
        System.out.println("");
        cuenta1.mostrar();
        
        cuenta1.retirarDinero(100);
        
        System.out.println("");
        cuenta1.mostrar();
        
        cuenta1.abonarInteres();
        
        cuenta1.mostrar();
        
        cuenta2.ingresarDinero(100);
        cuenta2.abonarInteres();
        cuenta2.mostrar();
    }
}

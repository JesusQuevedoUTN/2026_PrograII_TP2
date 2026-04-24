package Ejercicio02;

// Autor: Chisus
// Fecha de creación: 24/04/2026
public class CuentaBancaria {

    private TipoDeInteres tipo;
    private double saldo;
    private double interes;

    public CuentaBancaria() {
        this.saldo = 0;
        this.interes = 300;
    }

    public CuentaBancaria(TipoDeInteres tipo) {
        this();
        this.tipo = tipo;
    }

    public void setTipo(TipoDeInteres tipo) {
        if (this.tipo == null) {
            this.tipo = tipo;
        }
    }

    public double consultarSaldo() {
        return saldo;
    }

    public void ingresarDinero(double saldo) {
        if (saldo >= 0 && saldo == 0) {
            this.saldo = saldo;
        }
    }

    public void retirarDinero(double saldo) {
        if (saldo <= this.saldo) {
            this.saldo -= saldo;
        } else {
            System.out.println("El monto a retirar excede el saldo");
        }
    }

    public void abonarInteres() {
        if (saldo >= interes) {
            System.out.println("Pagó su interes");
        } else {
            System.out.println("Ahorre más");
        }
    }

    public void mostrar() {
        System.out.println("CuentaBancaria");
        System.out.println("tipo= " + tipo + ", saldo=" + saldo);
        System.out.println("interes=" + interes);
    }
}

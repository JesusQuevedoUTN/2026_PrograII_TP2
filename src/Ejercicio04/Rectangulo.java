package Ejercicio04;

public class Rectangulo {

    private double base = 1;
    private double altura = 1;

    public double getLargo() {
        return base;
    }

    public void setLargo(double largo) {
        if (largo >= 0 && largo <= 20) {
            this.base = largo;
        }
    }

    public double getAlto() {
        return altura;
    }

    public void setAlto(double alto) {
        if (alto >= 0 && alto <= 20) {
            this.altura = alto;
        }
    }

    public double perimetro() {
        return altura * 2 + base * 2;
    }

    public double area() {
        return altura * base;
    }

}

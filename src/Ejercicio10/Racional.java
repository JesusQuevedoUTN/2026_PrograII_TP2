
package Ejercicio10;


public class Racional {

    private int numerador;
    private int denominador;
    
    public Racional(int numerador, int denominador) {
        if (denominador != 0) {
            simplificar(numerador, denominador);
        } else {
            System.out.println("ERROR: no puede ser 0 el denominador");
        }
    }

    public Racional() {
        this.numerador = 1;
        this.denominador = 1;
    }

    public void simplificar(int numerador, int denominador) {
        
        int mcd = multiplo(numerador, denominador);

        this.numerador = Math.abs(numerador) / mcd;
        this.denominador = Math.abs(denominador) / mcd;
        
        if ((numerador < 0 && denominador > 0) || (numerador > 0 && denominador < 0)) {
            this.numerador = -Math.abs(numerador) / mcd;
        }
    }

    public int multiplo(int numerador, int denominador) {
        int indexA = Math.abs(numerador);
        int indexB = Math.abs(denominador);

        // Usado la ayuda de gemini con el ejemplo de 20/24 analizado por mí
        while (indexB != 0) {
            // 1° resto = 20 % 24 = 24  es mayor, asi que el resto se da vuelta
            // 2° resto = 24 % 20 = 4   
            // 3° resto = 20 % 4  = 0   
            int resto = indexA % indexB;

            //1° cD = 24                pasa de ser el numerador al denominador
            //2° cD = 20
            //3° cD = 4                 pasa a dar el resultado esperado
            indexA = indexB;

            //1° d = 20                 pasa de ser el denominador al numerador
            //2° d = 4
            //3° d = 0 FIN
            indexB = resto;
        }
        return indexA;
    }

    public int getNumerador() {
        return numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public boolean esPositivo() {
        return (this.numerador >= 0 && this.denominador > 0) || (this.numerador < 0 && this.denominador < 0);
    }

    public static Racional sumar(Racional a, Racional b) {
        int numA = a.getNumerador();
        int numB = b.getNumerador();
        int denA = a.getDenominador();
        int denB = b.getDenominador();
        return new Racional((numA * denB + numB * denA), denA * denB);
    }

    public static Racional restar(Racional a, Racional b) {
        int numA = a.getNumerador();
        int numB = b.getNumerador();
        int denA = a.getDenominador();
        int denB = b.getDenominador();
        return new Racional((numA * denB - numB * denA), denA * denB);
    }

    public static Racional multiplicar(Racional a, Racional b) {
        int numA = a.getNumerador();
        int numB = b.getNumerador();
        int denA = a.getDenominador();
        int denB = b.getDenominador();
        return new Racional(numA * numB, denA * denB);
    }

    public static Racional dividir(Racional a, Racional b) {
        int numA = a.getNumerador();
        int numB = b.getNumerador();
        int denA = a.getDenominador();
        int denB = b.getDenominador();
        return new Racional(numA * denB, denA * numB);
    }

    /*
    e) Devolver una representación String de un número Racional en la forma a/b, en donde a es el numerador y b es el denominador.
    f) Devolver una representación String de un número Racional en formato de punto flotante. (Considere proporcionar 
    capacidades de formato, que permitan al usuario de la clase especificar el número de dígitos de precisión a la derecha 
    del punto decimal).
     */
    @Override
    public String toString() {
        return this.numerador + "/" + this.denominador;
    }

    public String toStringFlotante(int decimal) {
        double resultado = this.numerador / (double)this.denominador;
        
        //Ayuda de gemini para esta parte
        String mascara = "%." + decimal + "f";
        return String.format(mascara, resultado);
    }
}

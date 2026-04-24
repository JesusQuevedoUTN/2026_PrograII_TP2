package Ejercicio05;

// Autor: Chisus
// Fecha de creación: 24/04/2026
public class Fecha {
    private static final String[] NOMBRES_MESES = {
        "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
        "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
    };
    private int dia;
    private int mes;
    private int anio;

    //Caso A
    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    //Caso B
    public Fecha(String nombre, int dia, int anio) {
        this.dia = dia;
        this.mes = nombreAMes(nombre);
        this.anio = anio;
    }

    //Caso C
    public Fecha(int dia, String nombre, int anio) {
        this.dia = dia;
        this.mes = nombreAMes(nombre);
        this.anio = anio;
    }
    
    public int nombreAMes(String nombreDelMes){
        int i=0;
        while(!nombreDelMes.equals(NOMBRES_MESES[i])){
            i++;
        }
        
        if (i>NOMBRES_MESES.length) {
            i = -1;
        }
        else{
            i++;
        }
        
        return i;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    // 5/21/2010
    public void mostrarCasoA() {
        System.out.printf("%02d/%02d/%d%n", mes, dia, anio);
    }
    
    // Junio 14, 2012
    public void mostrarCasoB() {
        if (mes >= 1 && mes <= 12) {
            System.out.printf("%s %d, %d%n", NOMBRES_MESES[mes - 1], dia, anio);
        } else {
            System.out.println("Mes inválido");
        }
    }
    
    // 20 Agosto 11
    public void mostrarCasoC() {
        if (mes >= 1 && mes <= 12) {
            // %02d para que el año muestre solo 2 dígitos (usando el resto de 100)
            System.out.printf("%d %s %02d%n", dia, NOMBRES_MESES[mes - 1], anio % 100);
        } else {
            System.out.println("Mes inválido");
        }
    }
}
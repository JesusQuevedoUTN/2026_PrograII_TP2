package Ejercicio03;

// Autor: Chisus
// Fecha de creación: 24/04/2026
public enum Articulo {
    LLAVE_INGLESA(2500.50, "Es como una llave pero inglesa"),
    TORNILLOS(120.00, "Se una para cosas"),
    MARTILLO(4500.5, "Se una para los tornillos");

    private final double precio;
    private final String descripcion;

    Articulo(double precio, String descripcion) {
        this.precio = precio;
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getNumeroDeArticulo() {
        return this.ordinal() + 1;
    }
}

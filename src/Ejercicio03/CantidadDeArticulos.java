package Ejercicio03;

public class CantidadDeArticulos {

    private Articulo articulo;
    private int cantidad;

    public CantidadDeArticulos(Articulo articulo, int cantidad) {
        this.articulo = articulo;
        this.cantidad = cantidad;
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void agregarCantidad(int cantidad) {
        this.cantidad += cantidad;
    }

    public double getTotal() {
        return articulo.getPrecio() * cantidad;
    }
}

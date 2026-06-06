package Ejercicio07;

public class Factura {
    private int vendedor;
    private int producto;
    private double valor;
    
    public Factura(int idVendedor, Articulo articulo){
        this.vendedor   = idVendedor;
        this.producto   = articulo.getId();
        this.valor      = articulo.getPrecio();
    }

    public int getVendedor() {
        return vendedor;
    }

    public int getProducto() {
        return producto;
    }

    public double getValor() {
        return valor;
    }
    
}

package Ejercicio07;

public enum Articulo {
    COMIDA(1, 7239.99), MUEBLE_INTERIOR(2, 9129.75), CALEFACTOR(3, 6899.95), PACK_LUCES(4, 1150.89), COMPUTADORA(5,9999);

    private int id;
    private double precio;

    Articulo(int id, double precio) {
        this.id = id;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public double getPrecio() {
        return precio;
    }
    
    
}

package Ejercicio06;

public enum Articulo {
    HP_1(1, 7239.99), APPLE_G2(2, 9129.75), SAMSUNG_2B(3, 6899.95), OMEN_HP(4, 13150.89);

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

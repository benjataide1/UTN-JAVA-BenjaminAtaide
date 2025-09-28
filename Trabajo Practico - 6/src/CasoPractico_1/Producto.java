package CasoPractico_1;

public class Producto {

    private String id;
    private String name;
    private double precio;
    private int cantidad;
    private CategoriaProducto categoria;

    public Producto(String id, String name, double precio, int cantidad, CategoriaProducto categoria) {
        this.id = id;
        this.name = name;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoria = categoria;
    }

    public String getId() {
        return this.id;
    }

    public CategoriaProducto getCategoria() {
        return this.categoria;
    }

    public int getCantidad() {
        return this.cantidad;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    // Se que la consigna pide el metodo mostrarInfo() pero es lo mismo que el toString() 
    @Override
    public String toString() {
        return "Producto{"
                + "id=" + this.id
                + ", name='" + this.name + '\''
                + ", precio=" + this.precio
                + ", cantidad=" + this.cantidad
                + ", categoria=" + this.categoria
                + '}';
    }

}

package CasoPractico_1;

import java.util.ArrayList;

public class Inventario {

    private ArrayList<Producto> productos = new ArrayList<>();

    public void agregarProducto(Producto producto) {
        this.productos.add(producto);
    }

    public void listarProducto() {
        productos.forEach(producto -> {
            System.out.println(producto);
        });
    }

    public Producto buscarProductoPorId(String id) {
        for (Producto producto : productos) {
            if (producto.getId().equals(id)) {
                return producto;
            }
        }
        return null;
    }

    public void eliminarProducto(String id) {
        productos.removeIf(producto -> producto.getId().equals(id));
    }

    public void actualizarStock(String id, int nuevaCantidad) {
        Producto p = buscarProductoPorId(id);
        p.setCantidad(nuevaCantidad);
    }

    public void filtarPorCategoria(CategoriaProducto categoria) {
        for (Producto producto : productos) {
            if (producto.getCategoria().equals(categoria)) {
                System.out.println(producto);
            }
        }
    }

    public int obtenerTotalStock() {
        int total = 0;
        for (Producto producto : productos) {
            total += producto.getCantidad();
        }
        return total;
    }

    public Producto obtenerProductoConMayorStock() {
        Producto productoNeutro = productos.get(0);

        for (Producto producto : productos) {
            if (productoNeutro.getCantidad() < producto.getCantidad()) {
                productoNeutro = producto;
            }
        }
        return productoNeutro;
    }

    public void filtrarProductosPorPrecio(double min, double max) {
        ArrayList<Producto> productosFiltrados = new ArrayList<>();

        for (Producto producto : productos) {
            if (producto.getPrecio() >= min && producto.getPrecio() <= max) {
                productosFiltrados.add(producto);
            }
        }
        productosFiltrados.forEach(p -> {
            System.out.println(p);
        });
    }

    public void mostrarCategoriasDisponibles() {
        for (CategoriaProducto p : CategoriaProducto.values()) {
            System.out.println("Categoria: " + p + " ,Descripcion: " + p.getDescripcion());
        }
    }

}

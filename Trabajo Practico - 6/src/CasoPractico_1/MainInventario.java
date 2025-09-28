package CasoPractico_1;

public class MainInventario {

    public static void main(String[] args) {
        Producto p1 = new Producto("P1", "Iphone", 5000, 10, CategoriaProducto.ELECTRONICA);
        Producto p2 = new Producto("P2", "Pan", 800, 12, CategoriaProducto.ALIMENTOS);
        Producto p3 = new Producto("P3", "Silla", 1000, 7, CategoriaProducto.HOGAR);
        Producto p4 = new Producto("P4", "Pantalon", 2000, 5, CategoriaProducto.ROPA);

        Inventario inventario = new Inventario();

        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);

        System.out.println("Listando Productos");
        inventario.listarProducto();

        System.out.println("-".repeat(30));

        System.out.println("Bucar Producto por Id");
        System.out.println("El producto encontrado es: " + inventario.buscarProductoPorId("P3"));

        System.out.println("-".repeat(30));

        System.out.println("Productos de una categoria especifica: ");
        inventario.filtarPorCategoria(CategoriaProducto.ELECTRONICA);

        System.out.println("Eliminar producto por ID");
        inventario.eliminarProducto("P2");
        inventario.listarProducto();

        System.out.println("-".repeat(30));

        System.out.println("Actualizar Stock de un producto");
        inventario.actualizarStock("P4", 15);
        System.out.println(inventario.buscarProductoPorId("P4"));

        System.out.println("-".repeat(30));

        System.out.println("Obtener Total de Stock");
        System.out.println("El total de stock es: " + inventario.obtenerTotalStock());

        System.out.println("-".repeat(30));

        System.out.println("Mostrar el producto con mayor stock");
        System.out.println(inventario.obtenerProductoConMayorStock());

        System.out.println("-".repeat(30));

        System.out.println("Productos Filtrados por Precio");
        inventario.filtrarProductosPorPrecio(1000, 3000);

        System.out.println("-".repeat(30));
        System.out.println("Categorias Disponibles");
        inventario.mostrarCategoriasDisponibles();

    }
}

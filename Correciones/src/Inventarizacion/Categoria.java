package Inventarizacion;
import java.util.ArrayList;
import java.util.List;

public class Categoria {
    private final String nombre;
    private final List<Producto> productos;

    public Categoria(String nombre) {
        this.nombre = nombre;
        this.productos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarProducto(Producto sabor) {
        productos.add(sabor);
    }

    public void eliminarProducto(Producto sabor) {
        productos.remove(sabor);
    }

    public List<Producto> getProductos() {
        return productos;
    }
}

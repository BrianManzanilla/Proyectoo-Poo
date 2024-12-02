package Inventarizacion;
import java.util.HashMap;
import java.util.Map;

public class InventarioProductos {
    private final Map<String, Categoria> categorias;

    public InventarioProductos() {
        categorias = new HashMap<>();
    }
    
    //Agregar categorias
     public void agregarCategoria(String nombre) {
        if (!categorias.containsKey(nombre)) {
            categorias.put(nombre, new Categoria(nombre));
            System.out.println("Categoria " + nombre + " agregada.");
        } else {
            System.out.println("La categoria " + nombre + " ya existe.");
        }
    }
     
    //Eliminar categorias
     public void eliminarCategoria(String nombre) {
        if (categorias.containsKey(nombre)) {
            categorias.remove(nombre);
            System.out.println("Categoria " + nombre + " eliminada.");
        } else {
            System.out.println("La categoria " + nombre + " no existe.");
        }
    }
    
    //Agregar producto a la categoria
     public void agregarProductoACategoria(String nombreCategoria, Producto sabor) {
        Categoria categoria = categorias.get(nombreCategoria);
        if (categoria != null) {
            categoria.agregarProducto(sabor);
            System.out.println("Producto " + sabor.getNombre() + " agregado a la categoria " + nombreCategoria + ".");
        } else {
            System.out.println("La categoria " + nombreCategoria + " no existe.");
        }
    }
     //Eliminar producto de la categoria
     public void eliminarProductoDeCategoria(String nombreCategoria, Producto sabor) {
        Categoria categoria = categorias.get(nombreCategoria);
        if (categoria != null) {
            categoria.eliminarProducto(sabor);
            System.out.println("Producto " + sabor.getNombre() + " eliminado de la categoria " + nombreCategoria + ".");
        } else {
            System.out.println("La categoria " + nombreCategoria + " no existe.");
        }
    }
    }

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
         //Mostrar categorias
     public void mostrarCategorias(){
        if (categorias.isEmpty()) {
            System.out.println("No hay categorías disponibles.");
        } else {
            System.out.println("Categorías disponibles:");
            for (String nombreCategoria : categorias.keySet()) {
                System.out.println(nombreCategoria);
            }
        }
     }

     // Mostrar productos y precios en una categoria específica
    public void mostrarProductosEnCategoria(String nombreCategoria) {
        Categoria categoria = categorias.get(nombreCategoria);
        List<Producto> productos = categoria.getProductos();
        
        if (productos.isEmpty()) {
            System.out.println("  No hay productos en esta categoria.");
        } else {
            for (Producto producto : productos) {
                System.out.println("  Producto: " + producto.getNombre() + ", Precio: $" + producto.getPrecio());
            }
        }
    }
    }

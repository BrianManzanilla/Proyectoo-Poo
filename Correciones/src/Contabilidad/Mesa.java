package Contabilidad;
import Inventarizacion.Producto;
import java.util.ArrayList;

public class Mesa {
    private ArrayList<Producto> productosConsumidos;

    public Mesa() {
        this.productosConsumidos = productosConsumidos;
    }

    public ArrayList<Producto> getProductosConsumidos() {
        return productosConsumidos;
    }

    public void setProductosConsumidos(ArrayList<Producto> productosConsumidos) {
        this.productosConsumidos = productosConsumidos;
    }
    

    //Agregar productos a las mesas
    public void agregarProducto(Producto sabor) {
        productosConsumidos.add(sabor);
        System.out.println(sabor.getNombre() + " agregado");
    }
    
    //Eliminar productos a las mesas
    public void eliminarProducto(Producto sabor) {
        if (productosConsumidos.contains(sabor)) {
            productosConsumidos.remove(sabor);
            System.out.println(sabor.getNombre() + " eliminado de la mesa ");
        } else {
            System.out.println(sabor.getNombre() + " no está en la mesa ");
        }
    }
   
    //Limpiar la cuenta de la mesa
    public void limpiarCuenta(){
        productosConsumidos.clear();
    }
    
    //Calcula el total a pagar de la mesa
    public double calcularTotal(){
        double totalCuenta = 0;
        for(Producto sabor : productosConsumidos){
         totalCuenta =+ sabor.getPrecio();
        }
        return totalCuenta;
    }
    
    //Mostrar el consumo de la mesa
    public void mostrarConsumo(){
        for(int i=1 ; i<productosConsumidos.size() ; i++){
            System.out.println(i + "- " + productosConsumidos.indexOf(i) + "\n");
        }
    }
    
    //Mostrar el total de la mesa
    public void mostrarCuenta(){
        double totalCuenta = calcularTotal();
        mostrarConsumo();
        System.out.println("El total es: " + totalCuenta);
    }
}

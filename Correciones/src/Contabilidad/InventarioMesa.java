package Contabilidad;
import Contabilidad.Mesa;
import java.util.HashMap;
import java.util.Map;

public class InventarioMesa {
       private final Map<Integer, Mesa> mesas;

    // Constructor
    public InventarioMesa() {
        this.mesas = new HashMap<>();
    }
    //Metodo getter
    public Map<Integer, Mesa> getMesas()
    {
        return mesas;
    }
    // Metodo para agregar una mesa al inventario
    public void agregarMesa(int numero) 
    {
        if (!mesas.containsKey(numero)) {
            mesas.put(numero, new Mesa());
            System.out.println("Mesa " + numero + " agregada.");
        } else {
            System.out.println("La mesa " + numero + " ya existe.");
        }
    }

    // Metodo para eliminar una mesa del inventario
    public void eliminarMesa(int numero) 
    {
        if (mesas.containsKey(numero)) {
            mesas.remove(numero);
            System.out.println("Mesa " + numero + " eliminada.");
        } else {
            System.out.println("La mesa " + numero + " no existe.");
        }
    }

}

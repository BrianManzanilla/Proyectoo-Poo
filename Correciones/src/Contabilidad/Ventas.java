/*
package Contabilidad;
import java.util.ArrayList;
import java.util.List;

public class Ventas {
      private List<Cuenta> historialCuentas;

    // Constructor
    public Ventas() {
        this.historialCuentas = new ArrayList<>();
    }

    // Método para mostrar las ventas del día
    public void mostrarVentas() {
        System.out.println("Ventas del día:");
        for (Cuenta cuenta : historialCuentas) {
            System.out.println("Mesa " + cuenta.getMesa().getNumero() + ": Total $" + cuenta.getMesa().calcularTotal());
        }
    }

    // Método para ver el detalle de todas las cuentas impresas
    public void verCuentasImpresas() {
        System.out.println("Detalle de Cuentas Impresas:");
        for (Cuenta cuenta : historialCuentas) {
            cuenta.imprimirCuenta();
            System.out.println("-----------------------------");
        }
    }

    // Método para cerrar el día y limpiar el historial de cuentas
    public void cerrarDia() {
        historialCuentas.clear();
        System.out.println("El historial de cuentas ha sido borrado. Día cerrado.");
    }

    // Método para agregar una cuenta al historial
    public void agregarCuenta(Cuenta cuenta) {
        historialCuentas.add(cuenta);
    }
}
*/
